package at.santiago.java.Camara;

public class Objectiv {
    private String producer;
    private int burningwidht;

    public Objectiv(String producer, int burningwidht){
        this.burningwidht = burningwidht;
        this.producer = producer;
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getBurningwidht() {
        return burningwidht;
    }

    public void setBurningwidht(int burningwidht) {
        this.burningwidht = burningwidht;
    }
}
