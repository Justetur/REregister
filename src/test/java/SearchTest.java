import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import re.register.model.*;
import re.register.qualificators.City;
import re.register.qualificators.EquipmentType;
import re.register.qualificators.PlotPurpose;
import re.register.qualificators.PremisePurpose;
import re.register.model.Register;
import re.register.services.Search;

import java.util.ArrayList;
import java.util.List;

public class SearchTest {

    private Register register;
    private Search search;
    private List<RealEstate> registerList;
    private SearchCriteria criteria;

    @Before
    public void init(){
        registerList = new ArrayList<>();

        registerList.add(new House(1, "Petrauskas", 120000, City.Vilnius, "Bajoru g. 10", 100.0,
                EquipmentType.FullyEquipped, 5, 2010, 6.0));
        registerList.add(new Flat(2, "Antanauskas", 100000, City.Kaunas, "Laisves al.55", 50.0,
                2, 1980, EquipmentType.PartialDecoration));
        registerList.add(new Plot(3, "Petrauskas", 50000, City.Marijampole, "Kauno g. 22", 10.0,
                PlotPurpose.Commercial));
        registerList.add(new Premise(4, "Antanauskas", 110000, City.Marijampole, "Bajoru g. 1",
                200.0, PremisePurpose.Services, EquipmentType.FullyEquipped, 2005));
        registerList.add(new Flat(5, "Vytauskas", 130000, City.Klaipeda, "Liepu al. 109", 65.0,
                3, 2005, EquipmentType.FullyEquipped));
        registerList.add(new House(6, "Jonauskas", 200000, City.Vilnius, "Gedimino pr. 9", 80.0,
                EquipmentType.FullyEquipped, 5, 1990, 2.0));
        registerList.add(new Plot(7, "Petrauskas", 70000, City.Kaunas, "Kauno g. 106", 20.0,
                PlotPurpose.ResidentialLand));
        registerList.add(new House(8, "Jonauskas", 90000, City.Kaunas, "Vilniaus g. 5", 90.0,
                EquipmentType.PartialDecoration, 3, 2010, 3.0));


        register = Register.createNew(registerList);

        criteria = new SearchCriteria(null, 70000, 110000, City.Kaunas, null,
                null, null, 1, 4, null, null,
                null, null);

        search = new Search();

    }


    @Test
    public void successCases() {

        List<RealEstate> result = search.search(register, criteria);

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(registerList.get(1).getId(), result.get(0).getId());
        Assert.assertEquals(registerList.get(7).getId(), result.get(1).getId());
        Assert.assertEquals(registerList.get(1).getCity(), result.get(0).getCity());
        Assert.assertEquals(registerList.get(7).getCity(), result.get(1).getCity());
        Assert.assertEquals(registerList.get(1).getPrice(), result.get(0).getPrice());
        Assert.assertEquals(registerList.get(7).getPrice(), result.get(1).getPrice());

    }

}
