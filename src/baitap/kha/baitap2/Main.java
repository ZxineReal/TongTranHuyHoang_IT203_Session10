package baitap.kha.baitap2;

public class Main {
    static void main() {
        Vehicle car = new Car("Toyota");
        Vehicle bicycle = new Bicycle("Mini");

        System.out.print(car.Brand + " - Cách di chuyển: ");
        car.move();
        System.out.println();
        System.out.print(bicycle.Brand + " - Cách di chuyển: ");
        bicycle.move();
    }
}
