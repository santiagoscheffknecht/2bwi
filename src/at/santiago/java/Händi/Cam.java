package at.santiago.java.Händi;

public class Cam {
    private String camname;
    private String jpg;
    private SdCard sdCard;


    public Cam(String jpg, String camname){
        this.jpg = jpg;
        this.camname = camname;
    }

    public void generatejpg(){
        if (sdCard.getSaveplace() > 0){
            sdCard.setSaveplace(sdCard.getSaveplace()-1);
            System.out.println("es ist noch platz für " + sdCard.getSaveplace());
        }
        else {
            System.out.println("der speicher ist voll");
        }
    }
}
