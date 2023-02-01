package at.santiago.java.controler;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private int serialnumber;
    private List<Batterie> batteries;


    public Controller(int serialnumber){
        this.batteries = new ArrayList<>();
        this.serialnumber = serialnumber;
    }
    //akku verbrauch berechnen
    public void turon(){
        double newakku = 0.0;
        for (int i = 0; i < batteries.size(); i++) {
            newakku = batteries.get(i).getAkku()*0.95;
            batteries.get(i).setAkku(newakku);
            System.out.println("die console ist an");
        }
    }
    public void turnoff(){
        System.out.println("die console ist aus");
    }

    //akkustand berechnen mit durchschnitt
    public void getakku(){
        double akkustand = 0.0;
        for (int y = 0; y < batteries.size(); y++) {
            akkustand += batteries.get(y).getAkku();
        }
        akkustand /= batteries.size();
        System.out.println("der akkustand beträgt " + akkustand);
    }
    //battarie hinzufügen
    public void addbatarie(Batterie batterie){this.batteries.add(batterie);};


}
