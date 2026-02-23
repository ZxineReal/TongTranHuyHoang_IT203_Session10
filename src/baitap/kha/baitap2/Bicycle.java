package baitap.kha.baitap2;

public class Bicycle extends Vehicle{
    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.print("Di chuyển bằng sức người");
    }
}
