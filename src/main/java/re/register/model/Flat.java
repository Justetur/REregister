package re.register.model;


import re.register.qualificators.City;
import re.register.qualificators.EquipmentType;


public class Flat extends RealEstate {

    private int rooms;
    private int buildYear;
    private EquipmentType equipment;

    public Flat(Integer id, String owner, int price, City city, String address, double area, int rooms, int buildYear, EquipmentType equipment) {
        super(id, owner, price, city, address, area);
        this.rooms = rooms;
        this.buildYear = buildYear;
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

    public EquipmentType getEquipment() {
        return equipment;
    }

    public void setEquipment(EquipmentType equipment) {
        this.equipment = equipment;
    }

}
