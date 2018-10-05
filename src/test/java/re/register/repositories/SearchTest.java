package re.register.repositories;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import re.register.model.*;
import re.register.qualificators.City;
import re.register.qualificators.EquipmentType;
import re.register.qualificators.PlotPurpose;
import re.register.qualificators.PremisePurpose;
import re.register.services.Search;

import java.util.ArrayList;
import java.util.List;

public class SearchTest {

	private Register register;
	private Search filterBy;
	private List<RealEstate> registerList;
	private SearchCriteria criteria;

	@Before
	public void init() {


		RealEstate house1 = new House();
		house1.setCity(City.Vilnius);
		house1.setAddress("Bajoru g. 10");
		house1.setArea(100.0);
		house1.setPrice(120000);
		((House) house1).setRooms(5);
		((House) house1).setEquipment(EquipmentType.FullyEquipped);

		RealEstate  house2 = new House();
		house2.setCity(City.Kaunas);
		house2.setAddress("Laisves al.55");
		house2.setArea(50.0);
		house2.setPrice(100000);
		((House)house2).setRooms(2);
		((House)house2).setEquipment(EquipmentType.PartialDecoration);

		RealEstate  house3 = new House();
		house3.setCity(City.Vilnius);
		house3.setAddress("Vilniaus g. 5");
		house3.setArea(80.0);
		house3.setPrice(90000);
		((House)house3).setRooms(3);
		((House)house3).setEquipment(EquipmentType.FullyEquipped);

		RealEstate  flat1 = new Flat();
		flat1.setCity(City.Vilnius);
		flat1.setAddress("Gedimino pr. 9");
		flat1.setPrice(250000);
		((Flat)flat1).setRooms(2);
		((Flat)flat1).setEquipment(EquipmentType.FullyEquipped);
		((Flat)flat1).setBuildYear(1980);


		RealEstate  flat2 = new Flat();
		flat2.setCity(City.Kaunas);
		flat2.setAddress("Laisves al. 44");
		flat2.setPrice(150000);
		((Flat)flat2).setRooms(2);
		((Flat)flat2).setEquipment(EquipmentType.PartialDecoration);

		RealEstate  plot1 = new Plot();
		plot1.setCity(City.Marijampole);
		plot1.setAddress("Vilniaus g. 2");
		plot1.setPrice(110000);
		((Plot)plot1).setPurpose(PlotPurpose.Commercial);
		((Plot)plot1).setArea(10.0);

		RealEstate  plot2 = new Plot();
		plot2.setCity(City.Ukmerge);
		plot2.setAddress("Bukoniu k.");
		plot2.setPrice(300000);
		plot2.setArea(100.0);
		((Plot)plot2).setPurpose(PlotPurpose.Agricultural);

		RealEstate premise1 = new Premise();
		premise1.setCity(City.Vilnius);
		premise1.setAddress("Ulonu g. 5");
		premise1.setArea(55.0);
		premise1.setPrice(130000);
		((Premise)premise1).setPurpose(PremisePurpose.Office);
		((Premise)premise1).setBuildYear(2005);

		RealEstate  premise2 = new Premise();
		premise2.setCity(City.Marijampole);
		premise2.setAddress("Kauno g. 55");
		premise2.setArea(250.0);
		premise2.setPrice(200000);
		((Premise)premise2).setBuildYear(1999);
		((Premise)premise2).setPurpose(PremisePurpose.WareHouse);

		registerList = new ArrayList<>();
		registerList.add(house1);
		registerList.add(house2);
		registerList.add(house3);
		registerList.add(flat1);
		registerList.add(flat2);
		registerList.add(plot1);
		registerList.add(plot2);
		registerList.add(premise1);
		registerList.add(premise2);

		register = new Register(registerList);

		criteria = new SearchCriteria();
		criteria.setPriceFrom(100000);
		criteria.setPriceTo(150000);
		criteria.setCity(City.Vilnius);

		filterBy = new Search();

	}

    @Test
	public void successCases() {

		List<RealEstate> result = filterBy.search(register, criteria);

		Assert.assertEquals(2, result.size());
		Assert.assertEquals(registerList.get(0).getId(), result.get(0).getId());
		Assert.assertEquals(registerList.get(7).getId(), result.get(1).getId());
		Assert.assertEquals(registerList.get(0).getCity(), result.get(0).getCity());
		Assert.assertEquals(registerList.get(7).getCity(), result.get(1).getCity());
		Assert.assertEquals(registerList.get(0).getPrice(), result.get(0).getPrice());
		Assert.assertEquals(registerList.get(7).getPrice(), result.get(1).getPrice());

	}

}
