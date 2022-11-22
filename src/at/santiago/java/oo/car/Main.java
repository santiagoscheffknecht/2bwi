package at.santiago.java.oo.car;

public class Main {
    public static void main(String[] args) {
        int a = 7;

        Car C1 = new Car();
        C1.brand = "Audi";
        C1.fuelConsumption = 7;
        C1.serialnumber = "A7";
        C1.fuelAmount = 70;

        Car C2 = new Car();
        C2.brand = "BMW";
        C2.fuelConsumption = 5;
        C2.serialnumber = "Bin Moslem Weisch";
        C2.fuelAmount = 69;

        System.out.println(C2.fuelAmount);
        C2.drive();
        System.out.println(C2.fuelAmount);
    }

}
