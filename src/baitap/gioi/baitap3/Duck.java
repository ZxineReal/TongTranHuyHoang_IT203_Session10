package baitap.gioi.baitap3;

public class Duck extends Animal implements Flyable, Swimmable{
    @Override
    public void fly() {
        System.out.println("Vịt có thể bay");
    }

    @Override
    public void swim() {
        System.out.println("Vịt có thể bơi");
    }
}
