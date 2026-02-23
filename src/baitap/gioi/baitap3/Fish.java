package baitap.gioi.baitap3;

public class Fish extends Animal implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Cá có thể bơi");
    }
}
