package at.santiago.java.Camara;

import java.util.ArrayList;

public class SDcard {
    private double saveplace;
    private ArrayList<Picture> pictures;


    public SDcard(int saveplace){
        this.saveplace = saveplace;
        this.pictures = new ArrayList<>();
    }

    public double getSaveplace() {
        return saveplace;
    }

    public void setSaveplace(double saveplace) {
        this.saveplace = saveplace;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<Picture> pictures) {
        this.pictures = pictures;
    }
}
