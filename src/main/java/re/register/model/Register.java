package re.register.model;


import re.register.real.estate.*;

import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<re.register.real.estate.RealEstate> rElist = new ArrayList<>();
    private static Register RealEstate;

    private Register() {

    }

    public static Register createNew() {
        if (RealEstate == null) {
            RealEstate = new Register();
        }
        return RealEstate;
    }

    public void add(RealEstate object) {
        rElist.add(object);
    }


    public void delete(RealEstate object) {
        rElist.remove(object);
    }

    public List<RealEstate> getAllObjects(List<RealEstate> rEList) {
        return rEList;
    }

    public List<RealEstate> filter(SearchCriteria criteria) {

        List<RealEstate> filteredList = new ArrayList<>();

        for (RealEstate object : rElist) {
            if (typeFilter(criteria, object) && priceFilter(criteria, object) && cityFilter(criteria, object) &&
                    addressFilter(criteria, object) && areaFilter(criteria, object)) {
                filteredList.add(object);
            }
        }
        return filteredList;
    }



    private boolean typeFilter(SearchCriteria criteria, RealEstate object) {

        boolean typeNotNull = criteria.getTypeOfRealEstate() != null;
        boolean typeMatches = false;

        if(criteria.getTypeOfRealEstate() != null){
            typeMatches = criteria.getTypeOfRealEstate().equals(isTypeOf(object));
        }
        

        if(typeNotNull && typeMatches){
            return true;
        } else {
            return false;
        }
    }

    private String isTypeOf(RealEstate object){

        String type = "";
        if(object instanceof House){
            type = "House";
        }
        else if(object instanceof Flat){
            type = "Flat";
        }
        else if(object instanceof Plot){
            type = "Plot";
        }
        else if(object instanceof Premise){
            type = "Premise";
        }

        return type;
    }

    private boolean priceFilter(SearchCriteria criteria, RealEstate object) {
        boolean priceNotNull =  criteria.getPriceFrom() != null && criteria.getPriceTo() != null;
        boolean priceBetweenLimits = object.getPrice() >= criteria.getPriceFrom() && object.getPrice() <= criteria.getPriceTo();

            if (priceNotNull && priceBetweenLimits) {
                return true;
            } else {
                return false;
            }

    }

    private boolean cityFilter(SearchCriteria criteria, RealEstate object) {

        boolean cityNotNull = criteria.getCity() != null;
        boolean cityName = criteria.getCity() == object.getCity();

        if(cityNotNull && cityName){
            return true;
        } else {
            return false;
        }
    }

    private boolean addressFilter(SearchCriteria criteria, RealEstate object) {

        boolean addressNotNull = criteria.getAddress() != null;
        boolean addressMatches = object.getAddress().startsWith(criteria.getAddress());

        if(addressNotNull && addressMatches){
            return true;
        } else {
            return false;
        }
    }

    private boolean areaFilter(SearchCriteria criteria, RealEstate object) {

        boolean areaNotNull = criteria.getAreaFrom() != null && criteria.getAreaTo() != null;
        boolean areaBetweenLimits = object.getArea() >= criteria.getAreaFrom() && object.getArea() <= criteria.getAreaTo();

        if (areaNotNull && areaBetweenLimits) {
            return true;
        } else {
            return false;
        }
    }








}



