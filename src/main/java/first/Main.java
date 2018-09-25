package first;

import Enums.*;
import Enums.ObjectType;

import java.util.List;


public class Main {

    public static void main(String[] args) {

        Register RElist = new Register();

        RElist.add(new House(ObjectType.House, "Jonauskas", 250000, City.Vilnius, "Gedimino pr. 9",
                HouseType.Residential, 120.0, EquipmentType.FullyEquipped, 1980, 6.0));
        RElist.add(new Flat(ObjectType.Flat, "Petrauskas", 120000, City.Vilnius, "Gabijos g. 59-5",
                60.0, 3, EquipmentType.PartialDecoration));
        RElist.add(new Plot(ObjectType.Plot, "Antanauskas", 150000, City.Klaipeda, "Bajoru al. 10",
                20.0, PlotPurpose.Agricultural));


        RElist.getAllObjects();
        RElist.filterByPriceAndType(ObjectType.Flat, 100000, 140000);


    }

}
