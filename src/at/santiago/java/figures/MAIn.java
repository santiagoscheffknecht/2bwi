package at.santiago.java.figures;

public class MAIn {
    public static void main(String[] args) {
    Cyrcle c1 = new Cyrcle(4, "Jeff");
    Dreieck d1 = new Dreieck(5, 6, "Dardan");
    Quadrat q1 = new Quadrat(3, 3, "Murat");
    Quadrat q2 = new Quadrat(6,9, "Natasha");


    c1.getArea();
    q1.getArea();
    q2.getArea();
    d1.getArea();

    }
}
