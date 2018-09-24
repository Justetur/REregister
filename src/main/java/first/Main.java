package first;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    House a = new House("Jonauskas", 150000, "Gedimino pr. 9", HouseType.Cottage,
            150.0, EquipmentType.FullyEquipped, 2008, 6.0);
    Flat b = new Flat("Petrauskas", 120000, "Gabijos g. 59", 60.5, 3, EquipmentType.FullyEquipped);
    Plot c = new Plot("Antanauskas", 100000, "Bajoru g. 10", 15.0, PlotPurpose.ResidentialLand);
    Premise d = new Premise("Vytauskas", 200000, "Laisves pr. 102", 300.0, PremisePurpose.Office);

    List<RealEstate> RElist = new ArrayList<>();
    RElist.add(a);
    RElist.add(b);
    RElist.add(c);
    RElist.add(d);

    a.getInfoAboutObject();
    b.getInfoAboutObject();
    c.getInfoAboutObject();
    d.getInfoAboutObject();
    

    }
}
