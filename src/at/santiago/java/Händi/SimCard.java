package at.santiago.java.Händi;

public class SimCard {
    private int number;
    private int id;

    public SimCard(int number, int id){
        this.id = id;
        this.number = number;
    }

    public void docall(){
        System.out.println("obama wird gecallt");
    }







    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
