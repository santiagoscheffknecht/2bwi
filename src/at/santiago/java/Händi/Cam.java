package at.santiago.java.Händi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Cam {
    private String camname;
    SdCard sdCard;
    private double mp;

    //Datum in java übernehmen
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    String Filename = dateFormat.format(date);

    public Cam(String camname, double mp) {
        this.camname = camname;
        this.mp = mp;
    }


    public Phonefile generatejpg() {
        Phonefile file = new Phonefile(mp * 0.6, ".jpg", Filename);
        return file;


    }


    public String getCamname() {
        return camname;
    }

    public void setCamname(String camname) {
        this.camname = camname;
    }


    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFilename() {
        return Filename;
    }

    public void setFilename(String filename) {
        Filename = filename;
    }
}
