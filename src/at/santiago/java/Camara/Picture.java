package at.santiago.java.Camara;

public class Picture {
    private double place;
    private String name;
    private String  extention;
    private String date;


    public Picture(int place, String name, String date ,String extention){
        this.extention = extention;
        this.name = name;
        this.place = place;
        this.date = date;
    }


    public double getPlace() {
        return place;
    }

    public void setPlace(double place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }
}
