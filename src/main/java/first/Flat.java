package first;

import Enums.City;
import Enums.EquipmentType;

public class Flat extends RealEstate{


    private double flatArea;
    private int rooms;
    private EquipmentType equipment;

    public Flat(String owner, int price, City city, String address, double flatArea, int rooms, EquipmentType equipment) {
        super(owner, price, city, address);
        this.flatArea = flatArea;
        this.rooms = rooms;
        this.equipment = equipment;
    }

    public double getFlatArea() {
        return flatArea;
    }

    public void setFlatArea(double flatArea) {
        this.flatArea = flatArea;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public EquipmentType getEquipment() {
        return equipment;
    }

    public void setEquipment(EquipmentType equipment) {
        this.equipment = equipment;
    }
}
