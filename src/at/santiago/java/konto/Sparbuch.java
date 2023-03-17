package at.santiago.java.konto;

public class Sparbuch {
    private double ammount;
    private double multiplikator;
    private String name;

    public Sparbuch(double ammount, double multiplikator, String name){
        this.ammount = ammount;
        this.multiplikator = multiplikator;
        this.name = name;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public double getMultiplikator() {
        return multiplikator;
    }

    public void setMultiplikator(double multiplikator) {
        this.multiplikator = multiplikator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
