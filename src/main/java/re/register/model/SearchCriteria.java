package re.register.model;

import re.register.qualificators.City;
import re.register.qualificators.EquipmentType;
import re.register.qualificators.PlotPurpose;
import re.register.qualificators.PremisePurpose;

public class SearchCriteria {

    private String typeOfRealEstate;
    private Integer priceFrom;
    private Integer priceTo;
    private City city;
    private String address;
    private Double areaFrom;
    private Double areaTo;



    public SearchCriteria(String typeOfRealEstate, Integer priceFrom, Integer priceTo, City city, String address,
                          Double areaFrom, Double areaTo) {
        this.typeOfRealEstate = typeOfRealEstate;
        this.priceFrom = priceFrom;
        this.priceTo = priceTo;
        this.city = city;
        this.address = address;
        this.areaFrom = areaFrom;
        this.areaTo = areaTo;
    }

    public String getTypeOfRealEstate() {
        return typeOfRealEstate;
    }

    public void setTypeOfRealEstate(String typeOfRealEstate) {
        this.typeOfRealEstate = typeOfRealEstate;
    }

    public Integer getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(Integer priceFrom) {
        this.priceFrom = priceFrom;
    }

    public Integer getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(Integer priceTo) {
        this.priceTo = priceTo;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getAreaFrom() {
        return areaFrom;
    }

    public void setAreaFrom(Double areaFrom) {
        this.areaFrom = areaFrom;
    }

    public Double getAreaTo() {
        return areaTo;
    }

    public void setAreaTo(Double areaTo) {
        this.areaTo = areaTo;
    }




}


