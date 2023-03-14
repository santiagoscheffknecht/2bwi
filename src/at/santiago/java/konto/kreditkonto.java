package at.santiago.java.konto;

public class kreditkonto {
    private double ammount;
    private String name;
    private double zinssatz;

    public kreditkonto(double ammount, double zinssatz , String name){
        this.ammount = ammount;
        this.name = name;
        this.zinssatz = zinssatz;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void setZinssatz(double zinssatz) {
        this.zinssatz = zinssatz;
    }
}
