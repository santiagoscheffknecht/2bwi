package at.santiago.java.rechner;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double pi = (180/Math.PI);


        boolean isFinished = false;
        while (!isFinished){
            System.out.println("gib deine Zahl ein");
            Scanner number = new Scanner(System.in);
            int a = number.nextInt();

            System.out.println(" was möchtest du mit deiner zahl machen");
            Scanner rechnerart = new Scanner(System.in);

            int selection2 = rechnerart.nextInt();

            if (selection2 == 1){
                double g;

                g = (Math.sin(a));
                System.out.println("der sinuns von " + a + " ist " + g + "RAD");
            }
            if (selection2 == 2){
                double g;

                g = Math.cos(a);
                System.out.println("der cosinus von " + a + " ist " + g +"RAD");
            }
            if (selection2 == 3){
                double pullermann;

                pullermann = Math.sqrt(a);

                System.out.println("die wurzel von " + a + " ist " + pullermann + "RAD");

            }
            if (selection2 == 5){
                isFinished = true;
                System.out.println("auf wieder sehen");
            }

        }
    }}
