import java.util.Random;
import java.util.Scanner;


public class bankautomat {
    public static void main(String[] args) {
        System.out.println("Hallo du");
        System.out.println("1 Kontostand");
        System.out.println("2 Geld überweisen");
        System.out.println("3 Geld abheben");
        System.out.println("4 Ende");

        Random random = new Random();
        int balance = random.nextInt(100);
        System.out.println("Ihr Kontostand betraegt" + balance + "€");

        boolean isFinished = false;
        while (!isFinished) {

            Scanner scanner = new Scanner(System.in);


            int selection1 = scanner.nextInt();
            System.out.println(selection1);


            if (selection1 == 1) {
                System.out.println(balance);
            }
            ;
            if (selection1 == 2) {
                // abfrage wieviel
                // amount
                // balance = balance + amount
                int amount = scanner.nextInt();
                System.out.println(amount);
                System.out.println(balance = balance + amount);

            }
            ;
            if (selection1 == 3) {
                // abfrage wieviel
                // amount
                // balance = balance + amount
                int takeaway = scanner.nextInt();
                System.out.println(takeaway);
                System.out.println(balance=balance-takeaway);}
            if (selection1 == 4) {isFinished = true;};
        }
        ;
    }

    ;
};
