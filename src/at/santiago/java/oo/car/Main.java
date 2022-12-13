package at.santiago.java.oo.car;

public class Main {
    public static void main(String[] args) {
        int a = 7;

        Car C1 = new Car();
        C1.brand = "Audi";
        C1.fuelConsumption = 7;
        C1.serialnumber = "A7";
        C1.fuelAmount = 70;
        C1.maxfuelAmount = 70;

        Car C2 = new Car();
        C2.brand = "BMW";
        C2.fuelConsumption = 5;
        C2.serialnumber = "Bin Moslem Weisch";
        C2.fuelAmount = 69;
        C2.maxfuelAmount = 69;

        System.out.println(C1.fuelAmount);
        System.out.println(C1.fuelAmount);
        C1.breake();
        C1.turboBoost();
        C1.honk(3);
        C1.getRemainingRange();
        C1.drive();
        C1.getRemainingRange();
    }

}
