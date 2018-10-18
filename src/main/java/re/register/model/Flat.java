package re.register.model;


import re.register.qualificators.City;
import re.register.qualificators.EquipmentType;


public class Flat extends RealEstate implements RoomsBuildYearEquipment {

    private int rooms;
    private int buildYear;
    private EquipmentType equipment;



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
