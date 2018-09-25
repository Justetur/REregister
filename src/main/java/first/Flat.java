package first;

import Enums.City;
import Enums.EquipmentType;
import Enums.ObjectType;

public class Flat extends RealEstate {

    private double flatArea;
    private int rooms;
    private EquipmentType equipment;

    public Flat(ObjectType objectType, String owner, int price, City city, String address, double flatArea, int rooms, EquipmentType equipment) {
        super(objectType, owner, price, city, address);
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
