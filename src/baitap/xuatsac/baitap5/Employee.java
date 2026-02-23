package baitap.xuatsac.baitap5;

public abstract class Employee {
    protected String name;
    protected double baseSallary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSallary = baseSalary;
    }

    public abstract double calculateSalary();

    public void printInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Lương cuối cùng: " + calculateSalary());
        System.out.println();
    }
}
