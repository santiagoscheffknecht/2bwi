package at.santiago.java.oo.car;


public class Main {
    public static void main(String[] args) {
        int a = 7;
        Engine E1 = new Engine(69, 500, Engine.TYPE.DIESEL);
        Tank T1 = new Tank(69, 8,120, Tank.TYPE.DIESEL);
        Rearmirror R1 = new Rearmirror(69,0);
        Rearmirror R2 = new Rearmirror(100, -8);

        Car C1 = new Car("bmw",E1,"BigbabaBumBum", T1){

        };
        C1.addmirrors(R1);
        C1.addmirrors(R2);
        Car C3 = new Car("Rarri",E1, "Rapcar",T1){
        };
        System.out.println(C1.getMirrors().get(0).getPosition());

        C1.checkSpeed();
        C3.drive();
        System.out.println(C3.getTank().getFuelAmount());
        C3.drive();
        System.out.println(C3.getTank().getFuelAmount());
    }

}
