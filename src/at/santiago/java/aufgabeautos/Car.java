package at.santiago.java.aufgabeautos;

public class Car {
    private String color;
    private Engine engine;
    private Seller seller;
    private double cost;
    private double km = 0;



    public Car(String color, Engine engine, Seller seller, double cost){
        this.color = color;
        this.engine = engine;
        this.seller = seller;
        this.cost = cost;
    }
    //echten preis berechnen
    public void realcost(){
        double realcost = cost*getSeller().getSale();
        System.out.println("der preis beträgt " + realcost);
    }

    //drive

    public  void drive(){
    km += 1000;
        System.out.println(km + " km wurden gefahren");
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

}
