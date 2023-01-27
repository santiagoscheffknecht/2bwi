package at.santiago.java.oo.car;

import java.util.ArrayList;
import java.util.List;

public class Car {
    //Instanz / Gedächnissvariablen

    private Tank tank;
    private List<HotWheel> wheels;
    private List<Rearmirror> mirrors;
    private Engine engine;
    private String brand;
    private String serialnumber;
    private String color;
    private String horn = "tuuut";

    public Car(String brand, Engine engine, String serialNumber, Tank tank)
    {
    this.wheels = new ArrayList<>();
    this.mirrors = new ArrayList<>();
    this.brand = brand;
    this.engine = engine;
    this.serialnumber = serialNumber;
    this.tank = tank;

    }


    //Drive
    public void drive() {
        int newAmount = tank.getFuelAmount()- tank.getFuelConsumption();
        tank.setFuelAmount(newAmount);
        System.out.println("I'm driving");
    }

    //How fast is the Car running
    public void checkSpeed (){
        System.out.println("the motor is running with " + engine.getSpeed());
    }
    //Breakes
    public void breake(){
        System.out.println("ich bremse");
    }

    //turboBoost
    public void turboBoost(){
        if (tank.getFuelAmount()>=tank.getMaxfuelAmount()*0.1){
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

    public void addmirrors(Rearmirror rearmirror){
        this.mirrors.add(rearmirror);
    }

    public void addwheel(HotWheel wheel){this.wheels.add(wheel);}

    public Tank getTank() {
        return tank;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public String getColor() {
        return color;
    }

    public String getHorn() {
        return horn;
    }

    public List<Rearmirror> getMirrors() {
        return mirrors;
    }

    public List<HotWheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<HotWheel> wheels) {
        this.wheels = wheels;
    }
}

