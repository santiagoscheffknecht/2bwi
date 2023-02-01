package at.santiago.java.controler;

public class Main {
    public static void main(String[] args) {
        Batterie b1 = new Batterie(100, 69);
        Batterie b2 = new Batterie(69, 5);

        Controller c1 = new Controller(69){};
        c1.addbatarie(b1);
        c1.addbatarie(b2);

        c1.turon();
        c1.turnoff();
        c1.getakku();
        c1.turon();
        c1.getakku();
    }


}
