package re.register.real.estate;

import re.register.qualificators.City;
import re.register.qualificators.EquipmentType;

public class House extends RealEstate {

    public EquipmentType equipment;
    private int rooms;
    private int buildYear;
    private double plotArea;

    public House(String owner, int price, City city, String address, double area, EquipmentType equipment, int rooms, int buildYear, double plotArea) {
        super(owner, price, city, address, area);
        this.equipment = equipment;
        this.rooms = rooms;
        this.buildYear = buildYear;
        this.plotArea = plotArea;
    }

    public EquipmentType getEquipment() {
        return equipment;
    }

    public void setEquipment(EquipmentType equipment) {
        this.equipment = equipment;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
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
