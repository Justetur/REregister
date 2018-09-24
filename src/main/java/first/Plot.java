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

    public Plot(String owner, int price, String address, double plotArea, PlotPurpose purpose) {
        super(owner, price, address);
        this.plotArea = plotArea;
        this.purpose = purpose;
    }

    @Override
    public void getInfoAboutObject() {
        System.out.println("Plot owner: " + getOwner() + ", address: " + getAddress() + ", price: " + getPrice() +
                " Eur, plot area: " + getPlotArea() + " a, plot purpose: " + getPurpose());
    }
}
