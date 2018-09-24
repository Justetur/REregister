package first;

public class Flat extends RealEstate implements InfoAboutObject {

    private double flatArea;

    private int rooms;

    private EquipmentType equipment;


    public Flat(String owner, int price, String address, double flatArea, int rooms, EquipmentType equipment) {
        super(owner, price, address);
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
        System.out.println("Flat owner: " + getOwner() + ", address: " + getAddress() + ", price: " + getPrice() +
                " Eur, flat area: " + getFlatArea() + " sq.m., rooms: " + getRooms());
    }
}
