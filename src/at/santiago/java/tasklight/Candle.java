package at.santiago.java.tasklight;

import java.util.ArrayList;

public class Candle {
    private ArrayList glowelement;
    private int slot;
    int x = slot;

    private Candle(int slot){
        this.glowelement = new ArrayList();
        this.slot = slot;
    }
    public void addglowelemnt(Glowelement glowelement){this.glowelement.add(glowelement);}

    public ArrayList getGlowelement() {
        return glowelement;
    }

    public void setGlowelement(ArrayList glowelement) {
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
