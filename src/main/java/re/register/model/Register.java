package re.register.model;


import re.register.Services.Search;

import java.util.List;

public class Register {

    private List<RealEstate> register;
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
        register.add(reObject);
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

    public void removeById(Integer id) {
        for (RealEstate reObject : register) {
            if (reObject.getId() == id) {
                register.remove(reObject);
            }
        }
    }

    public List<RealEstate> getAllObjects() {
        return register;
    }

//    public List<RealEstate> search(Search search, SearchCriteria criteria){
//
//        List<RealEstate> filteredList = search.search(Register.createNew(register), criteria);
//        return filteredList;
//    }


}



