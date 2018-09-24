package first;

public class House extends RealEstate implements InfoAboutObject {

    private HouseType type;
    private double houseArea;
    private EquipmentType equipment;
    private int buildYear;
    private double plotArea;


    public House(Object objectType, String owner, int price, City city, String address, HouseType type, double houseArea,
                 EquipmentType equipment, int buildYear, double plotArea) {
        super(objectType, owner, price, city, address);
        this.type = type;
        this.houseArea = houseArea;
        this.equipment = equipment;
        this.buildYear = buildYear;
        this.plotArea = plotArea;
    }


    public int getBuildYear() {
        return buildYear;
    }

    public double getPlotArea() {
        return plotArea;
    }


    public HouseType getType() {
        return type;
    }

    public double getHouseArea() {
        return houseArea;
    }

    public EquipmentType getEquipment() {
        return equipment;
    }

    public double getLandPlot() {
        return plotArea;
    }

    @Override
    public void getInfoAboutObject() {
        System.out.println(getObjectType() + " owner: " + getOwner() + ", address: " + getAddress() + ", " + getCity() + ", price: " + getPrice() +
                " Eur, house area: " + getHouseArea() + " sq.m., land area: " + getPlotArea() + " a, house type: " +
                getType() + ", equipment type: " + getEquipment() + ", build year: " + getBuildYear());
    }

}
