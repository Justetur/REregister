package re.register.repositories;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Repository;
import re.register.model.RealEstate;

@Repository
public class Register {

	private static final String JSON_FNAME = "register.json";

	private List<RealEstate> register;

	Register(List<RealEstate> register) {
		this.register = register;
	}

	public Register() {

	}

	public int add(RealEstate reObject) {
		reObject.setId(getLastId() + 1);
		if (register.add(reObject)) {
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

	public RealEstate getById(int id) {
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
				if (register.remove(reObject)) {
					saveList();
				}
			}
		}
	}

	public List<RealEstate> getAllObjects() {
		return register;
	}

	@PostConstruct
	private void load() throws IOException {

		File f = new File(JSON_FNAME);

		f.createNewFile();

		Reader reader = new FileReader(f);

		Type listType = new TypeToken<ArrayList<RealEstate>>() {
		}.getType();
		register = new Gson().fromJson(reader, listType);
	}

	private void saveList() {
		try {
			FileUtils.writeStringToFile(new File(JSON_FNAME), new Gson().toJson(register), StandardCharsets.UTF_8,
					false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
