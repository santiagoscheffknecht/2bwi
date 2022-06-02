import java.util.Random;

public class TestTaskone {
    public static void main(String[] args) {
        Random randomO = new Random();
        int zahleins = randomO.nextInt(1000);
        Random random1 = new Random();
        int zahlzwei = random1.nextInt(1000);
        if (zahleins < zahlzwei) {
            for(let i = zahleins; i > zahlzwei; i--){
            console.count();};
        }
        ;
        if (zahlzwei < zahleins) {
            for (let i = zahlzwei; i > zahleins; i--){
            console.count();};


        }
    }


}
