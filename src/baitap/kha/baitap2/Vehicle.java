package baitap.kha.baitap2;

public abstract class Vehicle {
    protected String Brand;

    public Vehicle(String brand) {
        Brand = brand;
    }

    public abstract void move();
}
