package re.register.model;


import re.register.qualificators.City;
import re.register.qualificators.PlotPurpose;


public class Plot extends RealEstate {


    private PlotPurpose purpose;



    public PlotPurpose getPurpose() {
        return purpose;
    }

    public void setPurpose(PlotPurpose purpose) {
        this.purpose = purpose;
    }


}
