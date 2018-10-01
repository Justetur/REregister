package re.register.real.estate;

import re.register.qualificators.City;
import re.register.qualificators.EquipmentType;
import re.register.qualificators.PremisePurpose;

public class Premise extends RealEstate{


    private PremisePurpose purpose;
    private EquipmentType equipment;

    public Premise(String owner, int price, City city, String address, double area, PremisePurpose purpose, EquipmentType equipment) {
        super(owner, price, city, address, area);
        this.purpose = purpose;
        this.equipment = equipment;
    }

    public PremisePurpose getPurpose() {
        return purpose;
    }

    public void setPurpose(PremisePurpose purpose) {
        this.purpose = purpose;
    }

    public EquipmentType getEquipment() {
        return equipment;
    }

    public void setEquipment(EquipmentType equipment) {
        this.equipment = equipment;
    }
}
