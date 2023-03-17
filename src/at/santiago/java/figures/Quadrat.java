package at.santiago.java.figures;

public class Quadrat {
    private double seite;
    private double seite2;
    private String name;

    public Quadrat( double seite, double seite2, String name){
        this.name = name;
        this.seite = seite;
        this.seite2 = seite2;
    };
    public void getArea(){
        if (seite2 == seite){
            System.out.println(name + seite * seite +"quadrat");}

        else{
                System.out.println(name + seite * seite2 + "Rechteck");
            }}

    public double getSeite() {
        return seite;
    }

    public void setSeite(double seite) {
        this.seite = seite;
    }

    public double getSeite2() {
        return seite2;
    }

    public void setSeite2(double seite2) {
        this.seite2 = seite2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

