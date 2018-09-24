package first;

public class Plot extends RealEstate implements InfoAboutObject{

    private double plotArea;
    private PlotPurpose purpose;

    public double getPlotArea() {
        return plotArea;
    }

    public PlotPurpose getPurpose() {
        return purpose;
    }

    public Plot(Object objectType, String owner, int price, City city, String address, double plotArea, PlotPurpose purpose) {
        super(objectType, owner, price, city, address);
        this.plotArea = plotArea;
        this.purpose = purpose;
    }

    @Override
    public void getInfoAboutObject() {
        System.out.println(getObjectType() + " owner: " + getOwner() + ", address: " + getAddress() + ", " + getCity() +  ", price: " + getPrice() +
                " Eur, plot area: " + getPlotArea() + " a, plot purpose: " + getPurpose());
    }
}
