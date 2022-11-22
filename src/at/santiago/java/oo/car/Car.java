package at.santiago.java.oo.car;

public class Car {
    //Instanz / Gedächnissvariablen

    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialnumber;
    private String color;

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I'm driving");
    }
}
