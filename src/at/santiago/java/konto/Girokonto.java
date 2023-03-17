package at.santiago.java.konto;

public class Girokonto {
    private double Amount;
    private String name;

    public Girokonto(double amount, String name){
        this.Amount = amount;
        this.name = name;
    }


    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
