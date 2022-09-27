import java.util.Scanner;


public class Kalender {
    public static void main(String[] args) {
        System.out.println("Wochentag: 1");
        System.out.println("Tage des Monats: 2");
        System.out.println("Kalender erstellen: 3");

        boolean isFinished = false;
        while (!isFinished) {

            Scanner scanner = new Scanner(System.in);


            int selection1 = scanner.nextInt();
            System.out.println(selection1);


            if (selection1 == 1) {
                int wochentage = scanner.nextInt();
            }
            if (selection1 == 2) {
                int monatstage = scanner.nextInt();
            }
            if (selection1 == 3) {
                System.out.println("MO DI MI DO FR SA SO");

                int days = monatstage;
                int firstWeekDay = wochentage;


                for (int i = 1; i < firstWeekDay; i++) {
                    System.out.print("   ");
                }
                int weekDay = firstWeekDay;

                for (int d = 1; d <= days; d++) {
                    if (d < 10)
                        System.out.print("0");

                    System.out.print(d + " ");
                    if (weekDay % 7 == 0)
                        System.out.println("");
                    weekDay++;

                }


            }
        }
    }
};