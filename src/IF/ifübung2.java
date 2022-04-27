package IF;

import java.util.Random;

public class ifübung2 {
    public static void main(String[] args) {
        Random randomO = new Random();
        int randomNumberO = randomO.nextInt(100);
        Random randomT = new Random();
        int randomNumberT = randomT.nextInt(100);
        if (randomNumberO < randomNumberT && randomNumberO < 50) {
            System.out.println("Zahl1 ist kleiner als Zahl2 und Mini");
            if (randomNumberO < 30) {
                System.out.println("einer der Zahlen ist kleiner als 30");
                if (randomNumberO < 50 && randomNumberT != 50) {
                    System.out.println("Erste Zahl klein, zweite kein 50iger");
                }
            }


        }
    }}