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

    public int add(RealEstate object) {
        object.setId(getLastId() +1);
        rElist.add(object);

        return object.getId();
    }


    private int getLastId() {

        int max = 0;

        for (RealEstate object : rElist) {
            if (max < object.getId()) {
                max = object.getId();
            }
        }

        return max;
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
                    addressFilter(criteria, object) && areaFilter(criteria, object) && roomsFilter(criteria, object) &&
                    buildYearFilter(criteria, object) && equipmentFilter(criteria, object) &&
                    plotPurposeFilter(criteria, object) && premisePurposeFilter(criteria, object)) {
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

    private boolean buildYearFilter(SearchCriteria criteria, re.register.real.estate.RealEstate object) {

        boolean buildYearNotNull = criteria.getBuildYearFrom() != null && criteria.getBuildYearTo() != null;
        boolean buildYearBetweenLimits = false;

        if(object instanceof Flat) {
            Flat flat = (Flat) object;
            buildYearBetweenLimits = flat.getBuildYear() >= criteria.getBuildYearFrom() &&
                    flat.getBuildYear() <= criteria.getBuildYearTo();

        } else if(object instanceof House){
            House house = (House) object;
            buildYearBetweenLimits = house.getBuildYear() >= criteria.getBuildYearFrom() &&
                    house.getBuildYear() <= criteria.getBuildYearTo();
        }

        if(buildYearNotNull && buildYearBetweenLimits){
            return true;
        }
        return false;
    }

    private boolean roomsFilter(SearchCriteria criteria, RealEstate object) {

        boolean roomsNotNull = criteria.getRoomsFrom() != null && criteria.getRoomsTo() != null;
        boolean roomsBetweenLimits = false;

        if(object instanceof Flat) {
            Flat flat = (Flat) object;
            roomsBetweenLimits = flat.getRooms() >= criteria.getRoomsFrom() && flat.getRooms() <= criteria.getRoomsFrom();

        } else if(object instanceof House){
            House house = (House) object;
            roomsBetweenLimits = house.getRooms() >= criteria.getRoomsFrom() && house.getRooms() <= criteria.getRoomsFrom();
        }

        if(roomsNotNull && roomsBetweenLimits){
            return true;
        }

        return false;
    }

    private boolean premisePurposeFilter(SearchCriteria criteria, RealEstate object) {

        boolean purposeNotNull = criteria.getPremisePurpose() != null;
        boolean purposeMatches = false;

        if(object instanceof Premise){
            Premise premise = (Premise) object;
            purposeMatches = premise.getPurpose().equals(criteria.getPremisePurpose());;
        }

        if(purposeNotNull && purposeMatches){
            return true;
        }

        return false;
    }

    private boolean plotPurposeFilter(SearchCriteria criteria, RealEstate object) {

        boolean purposeNotNull = criteria.getPlotPurpose() != null;
        boolean purposeMatches = false;

        if(object instanceof Plot){
            Plot plot = (Plot) object;
            purposeMatches = plot.getPurpose().equals(criteria.getPlotPurpose());;
        }

        if(purposeNotNull && purposeMatches){
            return true;
        }

        return false;
    }

    private boolean equipmentFilter(SearchCriteria criteria, RealEstate object) {

        boolean equipmentNotNull = criteria.getEquipment() != null;
        boolean equipmentMatches = false;

        if(object instanceof Flat) {
            Flat flat = (Flat) object;
            equipmentMatches = flat.getEquipment().equals(criteria.getEquipment());

        } else if(object instanceof House){
            House house = (House) object;
            equipmentMatches = house.getEquipment().equals(criteria.getEquipment());;

        } else if(object instanceof Premise){
            Premise premise = (Premise) object;
            equipmentMatches = premise.getEquipment().equals(criteria.getEquipment());;
        }

        if(equipmentNotNull && equipmentMatches){
            return true;
        }

        return false;
    }





}



