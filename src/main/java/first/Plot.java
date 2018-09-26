package first;

import Enums.City;
import Enums.PlotPurpose;

public class Plot extends RealEstate {


    private double plotArea;
    private PlotPurpose purpose;

    public Plot(String owner, int price, City city, String address, double plotArea, PlotPurpose purpose) {
        super(owner, price, city, address);
        this.plotArea = plotArea;
        this.purpose = purpose;
    }

    public double getPlotArea() {
        return plotArea;
    }

    public void setPlotArea(double plotArea) {
        this.plotArea = plotArea;
    }

    public PlotPurpose getPurpose() {
        return purpose;
    }

    public void setPurpose(PlotPurpose purpose) {
        this.purpose = purpose;
    }
}
