import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5);
        switch (randomNumber) {
            case 0:
                System.out.println("is0");
                break;
            case 1:
                System.out.println("is1");
                break;
            case 2:
                System.out.println("is2");
            break;
            default:
                System.out.println("other value");
            break;

        }
    }
}
