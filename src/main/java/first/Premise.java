package first;

public class Premise extends  RealEstate implements InfoAboutObject {

    private double premiseArea;
    private PremisePurpose purpose;

    public Premise(Object objectType, String owner, int price, City city, String address, double premiseArea, PremisePurpose purpose) {
        super(objectType, owner, price, city, address);
        this.premiseArea = premiseArea;
        this.purpose = purpose;
    }

    public double getPremiseArea() {
        return premiseArea;
    }

    public PremisePurpose getPurpose() {
        return purpose;
    }

    @Override
    public void getInfoAboutObject() {
        System.out.println(getObjectType() + " owner: " + getOwner() + ", address: " + getAddress() + ", " + getCity() +  ", price: " + getPrice() +
                " Eur, plot area: " + getPremiseArea() + "a, premise purpose: " + getPurpose());
    }
}
