package re.register.model;


import re.register.qualificators.City;
import re.register.qualificators.PlotPurpose;


public class Plot extends RealEstate {


    private PlotPurpose purpose;

    public Plot(Integer id, String owner, int price, City city, String address, double area, PlotPurpose purpose) {
        super(id, owner, price, city, address, area);
        this.purpose = purpose;
    }

    public PlotPurpose getPurpose() {
        return purpose;
    }

    public void setPurpose(PlotPurpose purpose) {
        this.purpose = purpose;
    }
}
