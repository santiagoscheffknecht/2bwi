package at.santiago.java.oo.car;

public class Tank {
    public enum TYPE {DIESEL, GAS};
    private int fuelConsumption;
    private TYPE type;
    private int fuelAmount;
    private int maxfuelAmount;


    public Tank(int fuelAmount, int fuelConsumption, int maxfuelAmount, TYPE type){
        this.fuelAmount = fuelAmount;
        this.maxfuelAmount = maxfuelAmount;
        this.fuelConsumption = fuelConsumption;
        this.type = type;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getMaxfuelAmount() {
        return maxfuelAmount;
    }

    public void setMaxfuelAmount(int maxfuelAmount) {
        this.maxfuelAmount = maxfuelAmount;
    }
}
