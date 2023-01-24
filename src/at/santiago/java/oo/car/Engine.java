package at.santiago.java.oo.car;

import java.lang.reflect.Type;

public class Engine {
    public enum TYPE {DIESEL, GAS};
    private int horsePower;
    private TYPE type;
    private int speed;



    public Engine(int speed, int horsePower, TYPE type){
        this.speed = speed;
        this.horsePower = horsePower;
        this.type = type;

    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void PS(int horsePower){
        System.out.println("The motor has 500PS");
    }


    }

