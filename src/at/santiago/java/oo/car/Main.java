package at.santiago.java.oo.car;

public class Main {
    public static void main(String[] args) {
        int a = 7;

        Car C1 = new Car(7,"Mercedes", "CL500", 100, 150){

        };
        Car C3 = new Car(17, "Babawagen", "Apocar", 69, 100){
        };

        System.out.println(C1.getFuelAmount());
        System.out.println(C3.getBrand());
        C1.breake();
        C1.turboBoost();
        C1.honk(3);
        C1.getRemainingRange();
        C1.drive();
        C1.getRemainingRange();
    }

}
