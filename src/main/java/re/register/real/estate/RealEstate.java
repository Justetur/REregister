package re.register.real.estate;


import re.register.qualificators.City;

public abstract class RealEstate {

    private String owner;
    private int price;
    private City city;
    private String address;
    private double area;

    public RealEstate(String owner, int price, City city, String address, double area) {
        this.owner = owner;
        this.price = price;
        this.city = city;
        this.address = address;
        this.area = area;
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}




