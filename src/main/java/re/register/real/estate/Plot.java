package re.register.real.estate;

import re.register.qualificators.City;
import re.register.qualificators.PlotPurpose;

public class Plot extends RealEstate {


    private PlotPurpose purpose;

    public Plot(String owner, int price, City city, String address, double area, PlotPurpose purpose) {
        super(owner, price, city, address, area);
        this.purpose = purpose;
    }


    public PlotPurpose getPurpose() {
        return purpose;
    }

    public void setPurpose(PlotPurpose purpose) {
        this.purpose = purpose;
    }
}
