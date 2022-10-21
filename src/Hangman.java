import java.util.Scanner;
import java.util.Random;
public class Hangman {
    public static void main(String[] args) {
        String word = "";

        System.out.println("Finde das wort");

        Random random = new Random();
        int number = random.nextInt(5);
        switch (number){
            case 0:
                word = "block"; // test
                break;
            case 1:
                word = "bande";
                break;
            case 2:
                word = "strasse";
                break;
            case 3:
                word = "viertel";
                break;
            case 4:
                word = "dieb";
                break;
            case 5:
                word = "sportauto";
                break;

        }
        char[] ch = word.toCharArray();
        char[] letters = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            int randomDescryption = random.nextInt(2);
            if (randomDescryption == 0){
                System.out.println(ch[i]);
            }

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