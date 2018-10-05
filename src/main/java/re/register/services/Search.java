package re.register.services;

import org.springframework.stereotype.Service;
import re.register.model.*;
import re.register.repositories.Register;

import java.util.ArrayList;
import java.util.List;

@Service
public class Search {

    public List<RealEstate> search(Register register, SearchCriteria criteria) {

        List<RealEstate> filteredList = new ArrayList<>();

        for (RealEstate reObject : register.getAllObjects()) {
            if (typeFilter(criteria, reObject) && priceFilter(criteria, reObject) && cityFilter(criteria, reObject) &&
                    addressFilter(criteria, reObject) && areaFilter(criteria, reObject) && roomsFilter(criteria, reObject) &&
                    buildYearFilter(criteria, reObject) && equipmentFilter(criteria, reObject) && purposeFilter(criteria,
                    reObject)) {
                filteredList.add(reObject);
            }
        }
        return filteredList;
    }

    private boolean typeFilter(SearchCriteria criteria, RealEstate reObject) {

        if (criteria.getTypeOfRealEstate() == null) {
            return true;
        } else if (criteria.getTypeOfRealEstate() != null && typeMatches(criteria, reObject)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean typeMatches(SearchCriteria criteria, RealEstate reObject) {
        return criteria.getTypeOfRealEstate().toLowerCase().equals(reObject.getClass().getSimpleName().toLowerCase());
    }

    private boolean priceFilter(SearchCriteria criteria, RealEstate reObject) {

        if (criteria.getPriceFrom() == null && criteria.getPriceTo() == null) {
            return true;
        } else if (criteria.getPriceFrom() != null && criteria.getPriceTo() != null && priceMatches(criteria, reObject)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean priceMatches(SearchCriteria criteria, RealEstate reObject) {
        return reObject.getPrice() >= criteria.getPriceFrom() && reObject.getPrice() <= criteria.getPriceTo();
    }

    private boolean cityFilter(SearchCriteria criteria, RealEstate reObject) {

        if (criteria.getCity() == null) {
            return true;
        } else if (criteria.getCity() != null && cityMatches(criteria, reObject)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean cityMatches(SearchCriteria criteria, RealEstate reObject) {
        return reObject.getCity().toString().toLowerCase().equals(criteria.getCity().toString().toLowerCase());
    }

    private boolean addressFilter(SearchCriteria criteria, RealEstate reObject) {

        if (criteria.getAddress() == null) {
            return true;
        } else if (criteria.getAddress() != null && addressMatches(criteria, reObject)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean addressMatches(SearchCriteria criteria, RealEstate reObject) {
        return reObject.getAddress().toLowerCase().startsWith(criteria.getAddress().toLowerCase());
    }

    private boolean areaFilter(SearchCriteria criteria, RealEstate reObject) {

        if (criteria.getAreaFrom() == null && criteria.getAreaTo() == null) {
            return true;
        } else if (criteria.getAreaFrom() != null && criteria.getAreaTo() != null && areaMatches(criteria, reObject)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean areaMatches(SearchCriteria criteria, RealEstate reObject) {
        return reObject.getArea() >= criteria.getAreaFrom() && reObject.getArea() <= criteria.getAreaTo();
    }

    private boolean buildYearFilter(SearchCriteria criteria, RealEstate reObject) {

        if (criteria.getBuildYearFrom() == null && criteria.getBuildYearTo() == null) {
            return true;
        } else if (criteria.getBuildYearFrom() != null && criteria.getBuildYearTo() != null && buildYearMatches(criteria, reObject)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean buildYearMatches(SearchCriteria criteria, RealEstate reObject) {

        if (reObject instanceof RoomsAndBuildYear) {
            RoomsAndBuildYear obj = (RoomsAndBuildYear) reObject;
            return obj.getBuildYear() >= criteria.getBuildYearFrom() &&
                    obj.getBuildYear() <= criteria.getBuildYearTo();
        } else {
            return false;
        }
    }


    private boolean roomsFilter(SearchCriteria criteria, RealEstate reObject) {

        if (criteria.getRoomsFrom() == null && criteria.getRoomsTo() == null) {
            return true;
        } else if (criteria.getRoomsFrom() != null && criteria.getRoomsTo() != null && roomsMatches(criteria, reObject)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean roomsMatches(SearchCriteria criteria, RealEstate reObject) {

        if (reObject instanceof RoomsAndBuildYear) {
            RoomsAndBuildYear obj = (RoomsAndBuildYear) reObject;
            return obj.getRooms() >= criteria.getRoomsFrom() && obj.getRooms() <= criteria.getRoomsTo();
        } else {
            return false;
        }
    }

    private boolean purposeFilter(SearchCriteria criteria, RealEstate reObject) {

        if (criteria.getPurpose() == null) {
            return true;
        } else if (criteria.getPurpose() != null && purposeMatches(criteria, reObject)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean purposeMatches(SearchCriteria criteria, RealEstate reObject) {
        if (reObject instanceof Plot) {
            Plot plot = (Plot) reObject;
            return plot.getPurpose().toString().toLowerCase().startsWith(criteria.getPurpose().toLowerCase());
        } else if (reObject instanceof Premise) {
            Premise premise = (Premise) reObject;
            return premise.getPurpose().toString().toLowerCase().startsWith(criteria.getPurpose().toLowerCase());
        } else {
            return false;
        }
    }

    private boolean equipmentFilter(SearchCriteria criteria, RealEstate reObject) {

        if (criteria.getEquipment() == null) {
            return true;
        } else if (criteria.getEquipment() != null && equipmentMatches(criteria, reObject)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean equipmentMatches(SearchCriteria criteria, RealEstate reObject) {

        if (reObject instanceof RoomsAndBuildYear) {
            RoomsAndBuildYear obj = (RoomsAndBuildYear) reObject;
            return obj.getEquipment().toString().toLowerCase().startsWith(criteria.getEquipment().toString().toLowerCase());
        } else {
            return false;
        }
    }


}




