package at.santiago.java.figures;

public class Dreieck {
    private double highwiedieNASA;
    private double breitweiBobmarley;
    private String name;

    public Dreieck(double highwiedieNASA, double breitweiBobmarley, String name){
        this.highwiedieNASA = highwiedieNASA;
        this.name = name;
        this.breitweiBobmarley = breitweiBobmarley;
    }

    public void getArea(){
        System.out.println(name + (highwiedieNASA * breitweiBobmarley)/2);
    }

    public double getHighwiedieNASA() {
        return highwiedieNASA;
    }

    public void setHighwiedieNASA(double highwiedieNASA) {
        this.highwiedieNASA = highwiedieNASA;
    }

    public double getBreitweiBobmarley() {
        return breitweiBobmarley;
    }

    public void setBreitweiBobmarley(double breitweiBobmarley) {
        this.breitweiBobmarley = breitweiBobmarley;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
