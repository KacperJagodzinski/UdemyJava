public class Enkapsulacja {

    public static void main(String[] args) {

        KontoBankowe kontoBankowe = new KontoBankowe();

        System.out.println(kontoBankowe.getSaldo());
        kontoBankowe.wyplac(500);
        System.out.println(kontoBankowe.getSaldo());

    }

}

class KontoBankowe {
    public KontoBankowe()
    {
        saldo = 1000;
    }

    private int saldo;

    int getSaldo(){
        return saldo;
    }

    private boolean setSaldo(int saldo)
    {
        /*
            Warunki!!
         */
        this.saldo = saldo;
        return true;
    }

    boolean wyplac(int ile){
        if(saldo<ile)
            return false;
        else{
            setSaldo(saldo-ile);
            return true;
        }


    }



}
