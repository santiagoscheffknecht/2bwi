import java.util.Scanner;

public class quersummefour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("start the calculator press 1");
        System.out.println("end the calculator press 2:");
        boolean isFinished = false;
        while (!isFinished) {

            int selection1 = scanner.nextInt();
            System.out.println(selection1);

            int cnt = 0;
            String numberAsString = Integer.toString(cnt);
            char[] numbers = numberAsString.toCharArray();

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum = sum + Character.getNumericValue(numbers[i]);
            }

            if (selection1 == 1) {
                int selection2 = scanner.nextInt();
                cnt = selection2;
                System.out.println(sum);
            }
        }
    }
}



