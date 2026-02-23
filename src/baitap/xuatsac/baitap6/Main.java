package baitap.xuatsac.baitap6;

public class Main {
    static void main() {
        Product[] products = {
                new Product("Laptop", 1500),
                new Product("Mouse", 20),
                new Product("Keyboard", 50),
                new Product("Monitor", 300)
        };

        //Sắp xếp theo GIÁ tăng dần
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = 0; j < products.length - i - 1; j++) {
                if (products[j].price > products[j + 1].price) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }

        System.out.println("Sắp xếp theo GIÁ tăng dần:");
        for (Product p : products) {
            p.printInfo();
        }

        System.out.println("---------------------");

        //Sắp xếp theo TÊN A-Z
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = 0; j < products.length - i - 1; j++) {
                if (products[j].name.compareTo(products[j + 1].name) > 0) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }

        System.out.println("Sắp xếp theo TÊN A-Z:");
        for (Product p : products) {
            p.printInfo();
        }
    }
}
