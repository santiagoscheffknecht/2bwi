import java.util.Scanner;

public class quersummefour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("was ist deine Nummer");


        int selection1 = scanner.nextInt();
        System.out.println(selection1);


        int cnt = selection1;
        boolean isFinished = false;
        int sum = 0;
        while (!isFinished) {
            String numberAsString = Integer.toString(cnt);
            char[] numbers = numberAsString.toCharArray();


            for (int i = 0; i < numbers.length; i++) {
                sum = sum + Character.getNumericValue(numbers[i]);
            }

            System.out.println(sum);

            if (sum >= 10) {
                cnt = sum;
                sum = 0;
                isFinished = false;
                int x = selection1;
                int y = cnt;
                System.out.println(x+y);

            } else {

                isFinished = true;
            }
            ;


        }
    }
}




