package at.santiago.java.oo.car;

public class Car {
    //Instanz / Gedächnissvariablen

    private int fuelConsumption;
    private int fuelAmount;
    private int maxfuelAmount;
    private String brand;
    private String serialnumber;
    private String color;
    private String horn = "tuuut";

    public Car(int fuelConsumption, String brand, String serialNumber, int fuelAmount, int maxfuelAmount)
    {this.fuelConsumption = fuelConsumption;
    this.brand = brand;
    this.serialnumber = serialNumber;
    this.fuelAmount =  fuelAmount;
    this.maxfuelAmount = maxfuelAmount;
    }


    //Drive
    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I'm driving");
    }

    //Breake
    public void breake(){
        System.out.println("ich bremse");
    }

    //turboBoost
    public void turboBoost(){
        if (fuelAmount>=maxfuelAmount*0.1){
            System.out.println("SuperBoostMode");
        }
        else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    //honk
    public void honk(int amountOfRepitions){
        for (int i = 0; i < amountOfRepitions; i++) {
            System.out.println(horn);
        }
    }

    //remaining Range to drive
    public void getRemainingRange(){
        System.out.println(fuelAmount/fuelConsumption + " times to dirve");
    }

    //setter für Gedächnisinstanz


    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxfuelAmount(int maxfuelAmount) {
        this.maxfuelAmount = maxfuelAmount;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }
    //getter für Klassen
    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxfuelAmount() {
        return maxfuelAmount;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getHorn() {
        return horn;
    }

    public String getSerialnumber() {
        return serialnumber;
    }
}

