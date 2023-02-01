package at.santiago.java.controler;

public class Batterie {
        private double akku;
        private int brand;

        public Batterie(double akku, int serialnumber){
        this.akku = akku;
        this.brand = serialnumber;
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
