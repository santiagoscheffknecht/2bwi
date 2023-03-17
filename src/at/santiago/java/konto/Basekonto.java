package at.santiago.java.konto;

public class Basekonto {
    private Girokonto girokonto;
    private Sparbuch sparbuch;
    private Kreditkonto kreditkonto;
    double a = 5000.69;

    public void einzahlenS(){
        sparbuch.setAmmount(sparbuch.getAmmount() + a);
    }

    public void einzahelenG(){
        girokonto.setAmount(girokonto.getAmount() + a);
    }

    public void abhebenG(){
        girokonto.setAmount(girokonto.getAmount() - a);
    }

    public void abhebenK(){
        girokonto.setAmount(girokonto.getAmount() - a);
    }

    public void balancecheck(){
        girokonto.setAmount(girokonto.getAmount() + kreditkonto.getAmmount() + sparbuch.getAmmount());

        System.out.println("neuer giro stand ist " + girokonto.getAmount());
    }

    public void Zinssatz(){
        if (kreditkonto.getAmmount() > 10000.69){
            kreditkonto.setZinssatz(1.3);
        }

        else {
            kreditkonto.setZinssatz(1.7);
        }

        System.out.println("Zinssatz beträgt " + kreditkonto.getZinssatz());
    }

    public void Kredit(){
        kreditkonto.setAmmount(kreditkonto.getAmmount() * kreditkonto.getZinssatz());

        System.out.println("jetziger stand " + kreditkonto.getAmmount());
    }

    public void Sparbuchsatz(){
        if (sparbuch.getAmmount() < 5000 ){
            sparbuch.setMultiplikator(1.03);
        }
        else{
            sparbuch.setMultiplikator(1.01);
        }
    }
}
