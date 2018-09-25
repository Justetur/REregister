package first;

import Enums.City;
import Enums.EquipmentType;
import Enums.HouseType;
import Enums.ObjectType;

public class House extends RealEstate {

    private HouseType type;
    private double houseArea;
    private EquipmentType equipment;
    private int buildYear;
    private double plotArea;


    public House(ObjectType objectType, String owner, int price, City city, String address, HouseType type,
                 double houseArea, EquipmentType equipment, int buildYear, double plotArea) {
        super(objectType, owner, price, city, address);
        this.type = type;
        this.houseArea = houseArea;
        this.equipment = equipment;
        this.buildYear = buildYear;
        this.plotArea = plotArea;
    }



    public HouseType getType() {
        return type;
    }

    public void setType(HouseType type) {
        this.type = type;
    }

    public double getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(double houseArea) {
        this.houseArea = houseArea;
    }

    public EquipmentType getEquipment() {
        return equipment;
    }

    public void setEquipment(EquipmentType equipment) {
        this.equipment = equipment;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public double getPlotArea() {
        return plotArea;
    }

    public void setPlotArea(double plotArea) {
        this.plotArea = plotArea;
    }



}
