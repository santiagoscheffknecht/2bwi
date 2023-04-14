package at.santiago.java.Camara;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cam {
    private int pixel;
    private double mass;
    private String color;
    private String name;
    private String land;
    private Objectiv objectiv;
    private int settings;
    private Picture picture;

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    String datum = dateFormat.format(date);


    public Cam(int pixel, int mass, String color, String name, String land, Objectiv objectiv){
        this.color = color;
        this.mass = mass;
        this.name=name;
        this.objectiv = objectiv;
        this.land = land;
        this. pixel = pixel;
    }

    public void changeSettingsL(){
        setSettings(3);
        System.out.println("Large");
    }

    public void changeSettingsM(){
        setSettings(2);
        System.out.println("Middle");
    }
    public void changeSettingsS() {
        setSettings(1);
        System.out.println("Small");
    }
    public void generatePicture(){

        if (getSettings()==3){
            Picture picture = new Picture(6, "Big Picture from: ", datum, ".jpg");
        }
        else if(getSettings()==2){
            Picture picture = new Picture(4, "Middle Picture from: ", datum, ".jpg");
        }
        else if (getSettings()==1){
            Picture picture = new Picture(2, "Small Picture from: ", datum, ".jpg");
        }
    }

    public void takePicture(){
        generatePicture();


    }


    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public Objectiv getObjectiv() {
        return objectiv;
    }

    public void setObjectiv(Objectiv objectiv) {
        this.objectiv = objectiv;
    }

    public int getSettings() {
        return settings;
    }

    public void setSettings(int settings) {
        this.settings = settings;
    }
}
