package re.register.real.estate;

import re.register.qualificators.City;
import re.register.qualificators.PremisePurpose;

public class Premise extends RealEstate{


    private PremisePurpose purpose;

    public Premise(String owner, int price, City city, String address, double area, PremisePurpose purpose) {
        super(owner, price, city, address, area);
        this.purpose = purpose;
    }


    public PremisePurpose getPurpose() {
        return purpose;
    }

    public void setPurpose(PremisePurpose purpose) {
        this.purpose = purpose;
    }
}
