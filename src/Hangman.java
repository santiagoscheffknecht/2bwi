import java.util.Scanner;
import java.util.Random;
public class Hangman {
    public static void main(String[] args) {
        String wort = "";

        System.out.println("Finde das wort");

        Random random = new Random();
        int zahl = random.nextInt(5);
        switch (zahl){
            case 0:
                wort = "block";
                break;
            case 1:
                wort = "bande";
                break;
            case 2:
                wort = "strasse";
                break;
            case 3:
                wort = "viertel";
                break;
            case 4:
                wort = "dieb";
                break;
            case 5:
                wort = "sportauto";
                break;

        }
        char[] ch = new char[wort.length()];
        for (char c : ch){
            System.out.println(c);
        }
        for (int i = 0; i < wort.length(); i++) {

        }



        boolean isFinished = false;
        while (!isFinished) {


            Scanner scanner = new Scanner(System.in);

            System.out.println("Buchstabe:");
            char Buchstabe = scanner.next().charAt(0);
            System.out.println(Buchstabe);
        }
    }
}