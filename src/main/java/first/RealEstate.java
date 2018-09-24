package first;

import java.util.ArrayList;
import java.util.List;

public abstract class RealEstate {

    private Object objectType;
    private String owner;
    private int price;
    private City city;
    private String address;

    public Object getObjectType() {
        return objectType;
    }

    public String getOwner() {
        return owner;
    }


    public int getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }

    public RealEstate(Object objectType, String owner, int price, City city, String address) {
        this.objectType = objectType;
        this.owner = owner;
        this.price = price;
        this.city = city;
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public List<RealEstate> add(List<RealEstate> RElist, RealEstate object) {
        RElist.add(object);
        return RElist;
    }

    public List<RealEstate> delete(List<RealEstate> RElist, RealEstate object) {
        RElist.remove(object);
        return RElist;
    }


    public List<RealEstate> edit(List<RealEstate> RElist) {
        //???
        return RElist;
    }


    public List<RealEstate> getAllObjects(List<RealEstate> RElist) {
        return RElist;
    }

    //filtravimas: pagal objekto tipa (namas/butas/sklypas/patalpa), miesta, kaina, plota;
    public List<RealEstate> filterByCity(List<RealEstate> RElist, City city) {

        List<RealEstate> filterList = new ArrayList<>();

        for (int i = 0; i < RElist.size(); i++) {
            if (RElist.get(i).equals(city)) {
                filterList.add(RElist.get(i));
            }
        }
        return filterList;
    }


    //rikiavimas
}
