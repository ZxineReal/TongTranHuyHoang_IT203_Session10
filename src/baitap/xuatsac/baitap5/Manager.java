package baitap.xuatsac.baitap5;

public class Manager extends Employee implements BonusCalculator{
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public double calculateSalary() {
        return baseSallary + getBonus();
    }
}
