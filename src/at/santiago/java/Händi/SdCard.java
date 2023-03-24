package at.santiago.java.Händi;

import java.util.ArrayList;
import java.util.List;

public class SdCard {
    private Cam cam;
    private int saveplace;

    private List<Phonefile> file;


    public SdCard(int saveplace){
        this.saveplace = saveplace;

        this.file = new ArrayList<>();
    };
    public void addPhonefile(Phonefile phonefile){
        this.file.add(phonefile);
    }

    public void savepicture(){

    }




    public int getSaveplace() {
        return saveplace;
    }

    public void setSaveplace(int saveplace) {
        this.saveplace = saveplace;
    }


}
