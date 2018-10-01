package re.register.model;


public class SearchCriteria2 {

    private boolean typeOfRealEstate;
    private boolean price;
    private boolean city;
    private boolean address;
    private boolean houseArea;
    private boolean equipment;
    private boolean buildYear;
    private boolean plotArea;
    private boolean flatArea;
    private boolean rooms;
    private boolean plotPurpose;
    private boolean premiseArea;
    private boolean premisePurpose;

    public SearchCriteria2(boolean typeOfRealEstate, boolean price, boolean city, boolean address, boolean houseArea,
                          boolean equipment, boolean buildYear, boolean plotArea, boolean flatArea, boolean rooms,
                          boolean plotPurpose, boolean premiseArea, boolean premisePurpose) {
        this.typeOfRealEstate = typeOfRealEstate;
        this.price = price;
        this.city = city;
        this.address = address;
        this.houseArea = houseArea;
        this.equipment = equipment;
        this.buildYear = buildYear;
        this.plotArea = plotArea;
        this.flatArea = flatArea;
        this.rooms = rooms;
        this.plotPurpose = plotPurpose;
        this.premiseArea = premiseArea;
        this.premisePurpose = premisePurpose;
    }

    public boolean isTypeOfRealEstate() {
        return typeOfRealEstate;
    }

    public void setTypeOfRealEstate(boolean typeOfRealEstate) {
        this.typeOfRealEstate = typeOfRealEstate;
    }

    public boolean isPrice() {
        return price;
    }

    public void setPrice(boolean price) {
        this.price = price;
    }

    public boolean isCity() {
        return city;
    }

    public void setCity(boolean city) {
        this.city = city;
    }

    public boolean isAddress() {
        return address;
    }

    public void setAddress(boolean address) {
        this.address = address;
    }

    public boolean isHouseArea() {
        return houseArea;
    }

    public void setHouseArea(boolean houseArea) {
        this.houseArea = houseArea;
    }

    public boolean isEquipment() {
        return equipment;
    }

    public void setEquipment(boolean equipment) {
        this.equipment = equipment;
    }

    public boolean isBuildYear() {
        return buildYear;
    }

    public void setBuildYear(boolean buildYear) {
        this.buildYear = buildYear;
    }

    public boolean isPlotArea() {
        return plotArea;
    }

    public void setPlotArea(boolean plotArea) {
        this.plotArea = plotArea;
    }

    public boolean isFlatArea() {
        return flatArea;
    }

    public void setFlatArea(boolean flatArea) {
        this.flatArea = flatArea;
    }

    public boolean isRooms() {
        return rooms;
    }

    public void setRooms(boolean rooms) {
        this.rooms = rooms;
    }

    public boolean isPlotPurpose() {
        return plotPurpose;
    }

    public void setPlotPurpose(boolean plotPurpose) {
        this.plotPurpose = plotPurpose;
    }

    public boolean isPremiseArea() {
        return premiseArea;
    }

    public void setPremiseArea(boolean premiseArea) {
        this.premiseArea = premiseArea;
    }

    public boolean isPremisePurpose() {
        return premisePurpose;
    }

    public void setPremisePurpose(boolean premisePurpose) {
        this.premisePurpose = premisePurpose;
    }
}
