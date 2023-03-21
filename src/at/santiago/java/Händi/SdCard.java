package at.santiago.java.Händi;

import java.util.ArrayList;
import java.util.List;

public class SdCard {
    private int saveplace;
    private int standardsaveplace;
    private List<Phonefile> file;


    public SdCard(int saveplace, int standardsaveplace){
        this.saveplace = saveplace;
        this.standardsaveplace = standardsaveplace;
        this.file = new ArrayList<>();
    };




    public int getSaveplace() {
        return saveplace;
    }

    public void setSaveplace(int saveplace) {
        this.saveplace = saveplace;
    }

    public int getStandardsaveplace() {
        return standardsaveplace;
    }

    public void setStandardsaveplace(int standardsaveplace) {
        this.standardsaveplace = standardsaveplace;
    }
}
