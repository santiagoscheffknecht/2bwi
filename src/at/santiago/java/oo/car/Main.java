package at.santiago.java.oo.car;


public class Main {
    public static void main(String[] args) {
        int a = 7;
        Engine E1 = new Engine(69, 500, Engine.TYPE.DIESEL);
        Tank T1 = new Tank(69, 8,120, Tank.TYPE.DIESEL);

        Car C1 = new Car("bmw",E1,"BigbabaBumBum", T1){

        };
        Car C3 = new Car("Rarri",E1, "Rapcar",T1){
        };

        C1.checkSpeed();
        C3.drive();
        System.out.println(C3.getTank().getFuelAmount());
        C3.drive();
        System.out.println(C3.getTank().getFuelAmount());
    }

}
