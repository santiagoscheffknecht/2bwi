package at.santiago.java.tasklight;

import java.util.ArrayList;
import java.util.List;

public class Candle {

    private List<Glowelement> glowelement;
    private int slot;
    int x = slot;

    public Candle(int slot){
        this.glowelement = new ArrayList();
        this.slot = slot;
    }
    public void addglowelemnt(Glowelement glowelement){this.glowelement.add(glowelement);}

    public void turnALLon(){
        for (int i = 0; i < glowelement.size(); i++) {
            glowelement.get(i).setStatutus(1);
        }
        System.out.println("all glowelements are on");
    }

    public void getOverallPowerUsage(){
        for (int r = 0; r < glowelement.size(); r++) {
            double gonsumption = glowelement.get(r).getEnergieconsumption();
            System.out.println("the consumption from " + glowelement.get(r).getName() + " is " + gonsumption);
        }
    }

    public void printNamesOfLightElements(){
        for (int penis = 0; penis < glowelement.size(); penis++) {
            System.out.println("the name of the glowelement is " + glowelement.get(penis).getName());
        }
    }

    public List<Glowelement> getGlowelement() {
        return glowelement;
    }

    public void setGlowelement(List<Glowelement> glowelement) {
        this.glowelement = glowelement;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
