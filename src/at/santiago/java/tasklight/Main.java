package at.santiago.java.tasklight;

public class Main {
    public static void main(String[] args) {
    Glowelement g1 = new Glowelement("R200", "Red", 8.4, 0);
    Glowelement g2 = new Glowelement("G110", "Green", 4.4, 0);
    Glowelement g3 = new Glowelement("B400", "Blue", 9.99, 0);
    Glowelement g4 = new Glowelement("Stefan", "Silver", 0.9, 0);

        Candle c1 = new Candle(5);{
            c1.addglowelemnt(g1);
            c1.addglowelemnt(g4);
            c1.addglowelemnt(g1);
            c1.addglowelemnt(g3);
            c1.addglowelemnt(g2);
        }
        System.out.println(g1.getStatutus());
        c1.turnALLon();
        System.out.println(g1.getStatutus());
        c1.getOverallPowerUsage();
    }

};
