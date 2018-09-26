package first;


import Enums.City;

import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<RealEstate> rElist = new ArrayList<>();
    private static Register RealEstate;

    private Register(){

    }

    public static Register createNew(){
        if (RealEstate == null){
            RealEstate = new Register();
        }
        return RealEstate;
    }

    public void add(RealEstate object){
        rElist.add(object);
    }


    public void delete(RealEstate object){
        rElist.remove(object);
    }

    public Object[] filterByPrice(int pricefrom, int priceTo){
        List<RealEstate> filteredList = new ArrayList<>();
        for (RealEstate obj : rElist) {
            if (obj.getPrice() >= pricefrom && obj.getPrice() <= priceTo){
                filteredList.add(obj);
            }
        }
        return filteredList.toArray();
    }



    public Object[] filterByPriceTypeAndCity(City city, int pricefrom, int priceTo){
        List<RealEstate> filteredList = new ArrayList<>();
        for (RealEstate obj : rElist) {
            if (obj.getCity().equals(city) && obj.getPrice() >= pricefrom
                    && obj.getPrice() <= priceTo){
                filteredList.add(obj);
            }
        }
        return filteredList.toArray();
    }

    public Object[] getAllObjects(){
        return rElist.toArray();
    }
}
