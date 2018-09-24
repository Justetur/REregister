package first;

public class Premise extends  RealEstate implements InfoAboutObject {

    private double premiseArea;
    private PremisePurpose purpose;

    public Premise(String owner, int price, String address, double premiseArea, PremisePurpose purpose) {
        super(owner, price, address);
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
        System.out.println("Premise owner: " + getOwner() + ", address: " + getAddress() + ", price: " + getPrice() +
                " Eur, plot area: " + getPremiseArea() + "a, premise purpose: " + getPurpose());
    }
}
