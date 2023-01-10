package at.santiago.java.oo.car;

public class Car {
    //Instanz / Gedächnissvariablen

    public int fuelConsumption;
    public int fuelAmount;
    public int maxfuelAmount;
    public String brand;
    public String serialnumber;
    private String color;
    private String horn = "tuuut";

    public Car(int fuelConsumption, String brand, String serialNumber)
    {this.fuelConsumption = fuelConsumption;
    this.brand = brand;
    this.serialnumber = serialNumber;};
    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I'm driving");
    }
    public void breake(){
        System.out.println("ich bremse");
    }
    public void turboBoost(){
        if (fuelAmount>=maxfuelAmount*0.1){
            System.out.println("SuperBoostMode");
        }
        else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }
    public void honk(int amountOfRepitions){
        for (int i = 0; i < amountOfRepitions; i++) {
            System.out.println(horn);
        }
    }
    public void getRemainingRange(){
        System.out.println(fuelAmount/fuelConsumption + " times to dirve");
    }
}
