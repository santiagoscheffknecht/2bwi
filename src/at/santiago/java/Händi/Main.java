package at.santiago.java.Händi;

public class Main {
    public static void main(String[] args) {
        Cam cam = new Cam("cam1",24);
        SimCard card = new SimCard(1234,121);
        SdCard sdCard = new SdCard(4000);
        Phone phone = new Phone("red",cam,card,sdCard);

        phone.makepicture();
    }
}
