package at.santiago.java.controler;

public class Batterie {
        private double akku;
        private int brand;

        public Batterie(double akku, int brand){
        this.akku = akku;
        this.brand = brand;
    }

    public double getAkku() {
        return akku;
    }

    public void setAkku(double akku) {
        this.akku = akku;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }
}
