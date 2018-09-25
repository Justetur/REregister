package first;

import Enums.City;
import Enums.ObjectType;


public abstract class RealEstate {

    private ObjectType objectType;
    private String owner;
    private int price;
    private City city;
    private String address;

    public RealEstate(ObjectType objectType, String owner, int price, City city, String address) {
        this.objectType = objectType;
        this.owner = owner;
        this.price = price;
        this.city = city;
        this.address = address;
    }

    public Object getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}




