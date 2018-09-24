package first;

import java.util.ArrayList;
import java.util.List;

public abstract class RealEstate {

    private String owner;
    private int price;
    private String address;

    public String getOwner() {
        return owner;
    }

    public int getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }

    public RealEstate(String owner, int price, String address){

        this.owner = owner;
        this.price = price;
        this.address = address;
    }


    public List<RealEstate> add (List<RealEstate> RElist, RealEstate object){
        RElist.add(object);
        return RElist;
    }

    public List<RealEstate> delete(List<RealEstate> RElist, RealEstate object){
        RElist.remove(object);
        return RElist;
    }


    public List<RealEstate> edit(List<RealEstate> RElist){
        //???
        return RElist;
    }


    public List<RealEstate> getAllObjects(List<RealEstate> RElist){
        return RElist;
    }
}
