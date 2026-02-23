package baitap.kha.baitap1;

public class Main {
    static void main() {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(4, 5);

        System.out.println("Diện tích hình tròn: " + circle.getArea());
        System.out.println("Chu vi hình tròn: " + circle.getPerimeter());
        System.out.println();
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
    }
}
