package at.santiago.java.konto;

public class zahlungen {
    private girokonto girokonto;
    private sparbuch sparbuch;
    private kreditkonto kreditkonto;




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
        if (sparbuch.getAmmount() > 5000 ){
            sparbuch.setMultiplikator(1.03);
        }
        else{
            sparbuch.setMultiplikator(1.01);
        }
    }
}
