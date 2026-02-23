package baitap.kha.baitap2;

public class Car extends Vehicle{
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.print("Di chuyển bằng động cơ");
    }
}
