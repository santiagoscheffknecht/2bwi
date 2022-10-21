package at.santiago.java.basics;

import java.util.Scanner;


public class Kalender {
    public static void main(String[] args) {
        System.out.println("1.Wochentage eingeben");
        System.out.println("2.Tage des Monats eingeben");
        System.out.println("3.at.santiago.java.basics.Kalender erstellen mit 3");

        boolean isFinished = false;
        while (!isFinished) {

            Scanner scanner = new Scanner(System.in);

            int   wochentage = scanner.nextInt();;
            int monatstage = scanner.nextInt();;

            int selection1 = scanner.nextInt();
            System.out.println(selection1);



            if (selection1 == 3) {
                System.out.println("MO DI MI DO FR SA SO");

                for (int i = 1; i < wochentage; i++) {
                    System.out.print("   ");
                }

                for (int d = 1; d <= monatstage; d++) {
                    if (d < 10) {
                        System.out.print("0");
                    }

                    System.out.print(d + " ");
                    if (wochentage % 7 == 0)
                        System.out.println("");
                    wochentage++;

                }


            }
        }
    }
};