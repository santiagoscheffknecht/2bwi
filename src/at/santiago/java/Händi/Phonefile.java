package at.santiago.java.Händi;

public class Phonefile {

    private double mb;
    private String extention;
    private String name;


    public Phonefile(double mb, String extention, String name) {
        this.extention = extention;
        this.name = name;
        this.mb = mb;
    }

    public double getMb() {
        return mb;
    }

    public void setMb(double mb) {
        this.mb = mb;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
