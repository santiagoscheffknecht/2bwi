package IF;

import java.util.Random;

public class ifübung {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        if ((randomNumber > 1 && randomNumber <= 20)) {
            System.out.println("Mini");
        }
        if ((randomNumber > 20 && randomNumber <= 50)) {
            System.out.println("Middle");
        }
        if ((randomNumber > 50 && randomNumber <= 100)) {
            System.out.println("big");
        }
    }
}