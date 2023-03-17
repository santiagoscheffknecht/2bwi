package at.santiago.java.figures;

public class Cyrcle {
    private double radius;
    private String name;

    public Cyrcle(double radius, String name){
        this.radius = radius;
        this.name = name;
    }


    public void getArea(){
        System.out.println(name + "hat eine Fläche von " + radius * radius * Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
