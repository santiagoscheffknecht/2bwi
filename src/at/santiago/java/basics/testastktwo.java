package at.santiago.java.basics;

import java.util.Random;

public class testastktwo {
    public static void main(String[] args) {
        boolean isFinished = false;
        while (!isFinished) {
            Random random = new Random();
            int numberone = random.nextInt(10);

            if (numberone == 5) {
                isFinished = true;
            }
            if (numberone > 5) {
                System.out.println(numberone);
            }
            if (numberone<5) {
                System.out.println(numberone);
            }
        }

    }
}
