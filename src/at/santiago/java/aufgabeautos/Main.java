package at.santiago.java.aufgabeautos;

public class Main {
    public static void main(String[] args) {
        Engine v8 = new Engine(200,6.9, "V8");
        Seller ali = new Seller("Ali",1.20, "Lustanbul");
        Car mercedes = new Car("lightblue", v8, ali, 25420.69);
        mercedes.drive();
        mercedes.realcost();
        v8.checkconsumtion();
    }




}
