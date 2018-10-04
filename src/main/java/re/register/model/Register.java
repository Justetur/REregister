package re.register.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Repository
@Qualifier(value = "registerJson")
public class Register {

    @Autowired
    private String JSON_FNAME = "register.json";

    @Autowired
    private List<RealEstate> register;

    @Autowired
    private static Register RealEstate;

    private Register(List<RealEstate> register) {
        this.register = register;
    }

    public static Register createNew(List<RealEstate> register) {
        if (RealEstate == null) {
            RealEstate = new Register(register);
        }
        return RealEstate;
    }


    public int add(RealEstate reObject) {
        reObject.setId(getLastId() + 1);
        if(register.add(reObject)){
            saveList();
        }
        return reObject.getId();
    }


    private int getLastId() {

        int max = 0;

        for (RealEstate reObject : register) {
            if (max < reObject.getId()) {
                max = reObject.getId();
            }
        }
        return max;
    }

    public RealEstate getById(int id){
        for (RealEstate reObject : register) {
            if (reObject.getId() == id) {
                return reObject;
            }
        }
        return null;
    }

    public void removeById(int id) {
        for (RealEstate reObject : register) {
            if (reObject.getId() == id) {
                if(register.remove(reObject)){
                    saveList();
                }
            }
        }
    }

    public List<RealEstate> getAllObjects() {
        return register;
    }

    @PostConstruct
    private void init() throws IOException {

        File f = new File(JSON_FNAME);

        f.createNewFile();

        Reader reader = new FileReader(f);

        Type listType = new TypeToken<ArrayList<RealEstate>>() {
        }.getType();
        register = new Gson().fromJson(reader, listType);
    }

    private void saveList() {
        try {
            FileUtils.writeStringToFile(new File(JSON_FNAME), new Gson().toJson(register), StandardCharsets.UTF_8, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
