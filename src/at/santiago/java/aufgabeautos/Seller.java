package at.santiago.java.aufgabeautos;

public class Seller {
    private String name;
    private double sale;
    private String countrie;

    public Seller(String name, double sale, String countrie){
        this.countrie = countrie;
        this.sale = sale;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public String getCountrie() {
        return countrie;
    }

    public void setCountrie(String countrie) {
        this.countrie = countrie;
    }
}
