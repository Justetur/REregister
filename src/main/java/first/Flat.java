package first;

public class Flat extends RealEstate implements InfoAboutObject {

    private double flatArea;

    private int rooms;

    private EquipmentType equipment;


    public Flat(Object objectType, String owner, int price, City city, String address, double flatArea, int rooms, EquipmentType equipment) {
        super(objectType, owner, price, city, address);
        this.flatArea = flatArea;
        this.rooms = rooms;
        this.equipment = equipment;
    }

    public double getFlatArea() {
        return flatArea;
    }

    public int getRooms() {
        return rooms;
    }

    public EquipmentType getEquipment() {
        return equipment;
    }


    @Override
    public void getInfoAboutObject() {
        System.out.println(getObjectType() + " owner: " + getOwner() + ", address: " + getAddress() + ", " + getCity() +  ", price: " + getPrice() +
                " Eur, flat area: " + getFlatArea() + " sq.m., rooms: " + getRooms());
    }
}
