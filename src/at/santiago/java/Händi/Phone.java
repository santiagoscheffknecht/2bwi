package at.santiago.java.Händi;

public class Phone {
    private String color;
    private Cam cam;
    private SimCard simCard;
    private SdCard sdCard;

    public Phone(String color, Cam cam, SimCard simCard, SdCard sdCard) {
        this.cam = cam;
        this.color = color;
        this.sdCard = sdCard;
        this.simCard = simCard;
    }

    public void makepicture() {
        Phonefile file = cam.generatejpg();
        sdCard.addPhonefile(file);
        System.out.println(file.getName());
        sdCard.printFileNames();
    }

    public void makecall() {
        simCard.docall();
    }

    public void getfreespace() {
        sdCard.deletesplace("11/04/2023 09:57:42");
    }

    public void getallfiles() {
        sdCard.getallfiles();
    }

}
