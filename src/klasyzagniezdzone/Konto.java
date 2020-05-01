package klasyzagniezdzone;

public class Konto {
    public static void main(String[] args) {
        KontoBankowe kontoBankowe = new KontoBankowe(1000);
        System.out.println(kontoBankowe.getStanKonta());

        kontoBankowe.start(5);

        System.out.println(kontoBankowe.getStanKonta());
    }

}

class KontoBankowe{
    private double stanKonta;

    public KontoBankowe(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    double getStanKonta(){
        return this.stanKonta;
    }

    void start(double stopaProcentowa){
        Odsetki odsetki = new Odsetki(stopaProcentowa);
    }

    class Odsetki{
        private double stopaProcentowa;

        public Odsetki(double stopaProcentowa) {
            this.stopaProcentowa = stopaProcentowa;
            this.zmienStanKonta(stopaProcentowa);
        }
        void zmienStanKonta(double stopaProcentowa){
           double odset = (stanKonta * stopaProcentowa) /100;
            stanKonta += odset;

        }
    }
}
