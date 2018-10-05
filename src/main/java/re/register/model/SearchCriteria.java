package re.register.model;


import org.springframework.stereotype.Component;
import re.register.qualificators.City;
import re.register.qualificators.EquipmentType;
import re.register.qualificators.PlotPurpose;

@Component
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
    private String purpose;



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

    public String getPurpose() {
        return purpose;
    }

    public void setPlotPurpose(PlotPurpose plotPurpose) {
        this.purpose = purpose;
    }


}

//    private String field;
//    private String value;
//
//    public SearchCriteria() {
//
//    }
//
//    public SearchCriteria(String field, String value) {
//        super();
//        this.field = field;
//        this.value = value;
//    }
//
//    public static Map<String, String> convertToMap(List<SearchCriteria> searchCriterias) {
//
//        Map<String, String> result = new HashMap<>();
//
//        for (SearchCriteria searchCriteria : searchCriterias) {
//            result.put(searchCriteria.field, searchCriteria.value);
//        }
//        return result;
//    }
//
//    public String getField() {
//        return field;
//    }
//
//    public void setField(String field) {
//        this.field = field;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//}







