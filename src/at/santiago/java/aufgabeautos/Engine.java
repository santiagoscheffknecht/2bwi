package at.santiago.java.aufgabeautos;

public class Engine {
    private int maxspeed;
    private double consumtion;
    private String model;
    private Car car;
    public Engine(int maxspeed, double consumtion, String model){
        this.consumtion = consumtion;
        this.maxspeed = maxspeed;
        this.model = model;
    }

    //consumtion checken
    public void checkconsumtion(){
        if (car.getKm() >= 50000){
            setConsumtion(consumtion * 1.098);
        }
        System.out.println("consumtion " + consumtion);
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public double getConsumtion() {
        return consumtion;
    }

    public void setConsumtion(double consumtion) {
        this.consumtion = consumtion;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
