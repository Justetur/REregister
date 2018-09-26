package first;

import Enums.City;
import Enums.PremisePurpose;

public class Premise extends RealEstate{


    private double premiseArea;
    private PremisePurpose purpose;

    public Premise(String owner, int price, City city, String address, double premiseArea, PremisePurpose purpose) {
        super(owner, price, city, address);
        this.premiseArea = premiseArea;
        this.purpose = purpose;
    }

    public double getPremiseArea() {
        return premiseArea;
    }

    public void setPremiseArea(double premiseArea) {
        this.premiseArea = premiseArea;
    }

    public PremisePurpose getPurpose() {
        return purpose;
    }

    public void setPurpose(PremisePurpose purpose) {
        this.purpose = purpose;
    }
}
