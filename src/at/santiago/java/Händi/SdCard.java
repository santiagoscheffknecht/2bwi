package at.santiago.java.Händi;

import java.util.ArrayList;
import java.util.List;

public class SdCard {
    private Cam cam;
    private int saveplace;
    private List<Phonefile> files;


    public SdCard(int saveplace) {
        this.saveplace = saveplace;

        this.files = new ArrayList<>();
    }

    ;

    public void savefile() {
        if (saveplace - files.get(files.size()).getMb() > 0) {
            setSaveplace(saveplace - files.size());
        } else {
            System.out.println("der speicher muss bereinigt werden");
        }
    }

    public void addPhonefile(Phonefile phonefile) {
        this.files.add(phonefile);
    }

    public void printFileNames(){
        System.out.println("------------ file names --------------");
        for (Phonefile file:this.files) {
            System.out.println(file.getName() + file.getExtention() + file.getExtention());
        }
    }

    public int getSaveplace() {
        return saveplace;
    }

    public void setSaveplace(int saveplace) {
        this.saveplace = saveplace;
    }

    public void deletesplace(String name) {
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i).getName().equalsIgnoreCase(name)) {
                files.remove(files.get(i));
            } else {
                System.out.println("keine Datei gefunden");
            }
        }
    }


    public Cam getCam() {
        return cam;
    }

    public void setCam(Cam cam) {
        this.cam = cam;
    }

    public List<Phonefile> getFiles() {
        return files;
    }

    public void setFiles(List<Phonefile> files) {
        this.files = files;
    }
}
