package re.register.app;

import re.register.model.Register;
import re.register.Services.Search;
import re.register.model.*;
import re.register.qualificators.City;
import re.register.qualificators.EquipmentType;
import re.register.qualificators.PlotPurpose;
import re.register.qualificators.PremisePurpose;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<RealEstate> register = new ArrayList<>();

        register.add(new House(1, "Petrauskas", 120000, City.Vilnius, "Bajoru g. 10", 100.0,
                EquipmentType.FullyEquipped, 5, 2010, 6.0));
        register.add(new Flat(2, "Antanauskas", 100000, City.Kaunas, "Laisves al.55", 50.0,
                2, 1980, EquipmentType.PartialDecoration));
        register.add(new Plot(3, "Petrauskas", 50000, City.Marijampole, "Kauno g. 22", 10.0,
                PlotPurpose.Commercial));
        register.add(new Premise(4, "Antanauskas", 110000, City.Marijampole, "Bajoru g. 1",
                200.0, PremisePurpose.Services, EquipmentType.FullyEquipped, 2005));
        register.add(new Flat(5, "Vytauskas", 130000, City.Klaipeda, "Liepu al. 109", 65.0,
                3, 2005, EquipmentType.FullyEquipped));
        register.add(new House(6, "Jonauskas", 200000, City.Vilnius, "Gedimino pr. 9", 80.0,
                EquipmentType.FullyEquipped, 5, 1990, 2.0));
        register.add(new Plot(7, "Petrauskas", 70000, City.Ukmerge, "Kauno g. 106", 20.0,
                PlotPurpose.ResidentialLand));
        register.add(new House(8, "Jonauskas", 90000, City.Kaunas, "Vilniaus g. 5", 90.0,
                EquipmentType.PartialDecoration, 4, 2010, 3.0));

        Register reg = Register.createNew(register);

        SearchCriteria criteria = new SearchCriteria(null, 70000, 130000, null,
                null, null, null, null, null, null, null,
                null, null);

        Search search = new Search();

        List<RealEstate> result = search.search(reg, criteria);

        for (RealEstate reObject : result) {
            System.out.println(reObject.getId());
        }



    }

}
