package at.santiago.java.aufgabeautos;

public class Engine {
    private int maxspeed;
    private int consumtion;
    private String model;


    private Engine(int maxspeed, int consumtion, String model){
        this.consumtion = consumtion;
        this.maxspeed = maxspeed;
        this.model = model;
    }


    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getConsumtion() {
        return consumtion;
    }

    public void setConsumtion(int consumtion) {
        this.consumtion = consumtion;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
