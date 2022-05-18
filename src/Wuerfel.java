import java.util.Scanner;
import java.util.Random;

public class Wuerfel {
    public static void main(String[] args) {
        System.out.println("Werfe den Wuerfel mit 1");
        Random random = new Random();
        int generateNumber = random.nextInt(30)+6;
        boolean isFinished = false;
        while (!isFinished) {
            Scanner scanner = new Scanner(System.in);


            int selection1 = scanner.nextInt();
            System.out.println(selection1);
        };
    };
}
