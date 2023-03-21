package at.santiago.java.Händi;

public class Händi {
    private String color;
    private Cam cam;
    private SimCard simCard;
    private SdCard sdCard;

    public void makepicture(){
        cam.generatejpg();
    }
    public void makecall(){
        simCard.docall();
    }
    public void getfreespace(){
        if (sdCard.getSaveplace() < sdCard.getStandardsaveplace()){
            sdCard.setSaveplace(sdCard.getSaveplace() + 1);
            System.out.println("das letzte Bild wurde gelöst");
        }
        else {
            System.out.println("es gibt keine bilder zum löschen");
        }

    }

}
