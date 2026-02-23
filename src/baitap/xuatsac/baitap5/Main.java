package baitap.xuatsac.baitap5;

public class Main {
    static void main() {
        Employee staff = new OfficeStaff("Nguyễn Văn A", 8000000);
        Employee manager = new Manager("Trần Thị B", 15000000, 5000000);

        staff.printInfo();
        manager.printInfo();
    }
}
