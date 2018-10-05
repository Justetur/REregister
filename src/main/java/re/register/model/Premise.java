package re.register.model;


import re.register.qualificators.City;
import re.register.qualificators.EquipmentType;
import re.register.qualificators.PremisePurpose;


public class Premise extends RealEstate {

    private PremisePurpose purpose;
    private EquipmentType equipment;
    private int buildYear;



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

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }


}
