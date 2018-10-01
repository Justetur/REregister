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
    private Integer roomsFrom;
    private Integer roomsTo;
    private EquipmentType equipment;
    private Integer buildYearFrom;
    private Integer buildYearTo;
    private PlotPurpose plotPurpose;
    private PremisePurpose premisePurpose;

    public SearchCriteria(String typeOfRealEstate, Integer priceFrom, Integer priceTo, City city, String address, Double areaFrom, Double areaTo, Integer roomsFrom, Integer roomsTo, EquipmentType equipment, Integer buildYearFrom, Integer buildYearTo, PlotPurpose plotPurpose, PremisePurpose premisePurpose) {
        this.typeOfRealEstate = typeOfRealEstate;
        this.priceFrom = priceFrom;
        this.priceTo = priceTo;
        this.city = city;
        this.address = address;
        this.areaFrom = areaFrom;
        this.areaTo = areaTo;
        this.roomsFrom = roomsFrom;
        this.roomsTo = roomsTo;
        this.equipment = equipment;
        this.buildYearFrom = buildYearFrom;
        this.buildYearTo = buildYearTo;
        this.plotPurpose = plotPurpose;
        this.premisePurpose = premisePurpose;
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

    public Integer getRoomsFrom() {
        return roomsFrom;
    }

    public void setRoomsFrom(Integer roomsFrom) {
        this.roomsFrom = roomsFrom;
    }

    public Integer getRoomsTo() {
        return roomsTo;
    }

    public void setRoomsTo(Integer roomsTo) {
        this.roomsTo = roomsTo;
    }

    public EquipmentType getEquipment() {
        return equipment;
    }

    public void setEquipment(EquipmentType equipment) {
        this.equipment = equipment;
    }

    public Integer getBuildYearFrom() {
        return buildYearFrom;
    }

    public void setBuildYearFrom(Integer buildYearFrom) {
        this.buildYearFrom = buildYearFrom;
    }

    public Integer getBuildYearTo() {
        return buildYearTo;
    }

    public void setBuildYearTo(Integer buildYearTo) {
        this.buildYearTo = buildYearTo;
    }

    public PlotPurpose getPlotPurpose() {
        return plotPurpose;
    }

    public void setPlotPurpose(PlotPurpose plotPurpose) {
        this.plotPurpose = plotPurpose;
    }

    public PremisePurpose getPremisePurpose() {
        return premisePurpose;
    }

    public void setPremisePurpose(PremisePurpose premisePurpose) {
        this.premisePurpose = premisePurpose;
    }
}


