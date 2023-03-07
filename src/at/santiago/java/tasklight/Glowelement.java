package at.santiago.java.tasklight;

public class Glowelement {
    private String name;
    private String color;
    private double energieconsumption;
    private int statutus;
    public Glowelement(String name, String color, double energieconsumtion, int statutus){
        this.name = name;
        this.color =color;
        this.energieconsumption = energieconsumtion;
        this.statutus = statutus;
    }

    public void setStatutus(int statutus) {
        this.statutus = statutus;
    }

    public int getStatutus() {
        return statutus;
    }

    public void turnoneon(){
        setStatutus(1);
        if (getStatutus() == 1){
            System.out.println("is on");
        }
        else {System.out.println("is off");}
    }

    public double getEnergieconsumption() {
        return energieconsumption;
    }
}
