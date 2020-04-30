public class Butelka {

    //wartości
    private double pojemnosc;
    private double ileLitrow;

    //konstruktor bezparametrowy
    Butelka(){}

    //konstruktor
    Butelka(double pojemnosc, double ileLitrow)
    {
        this.pojemnosc = pojemnosc;
        this.ileLitrow = ileLitrow;
    }

    double getIleLitrow(){
        return ileLitrow;
    }

    void wlej(double ilosc)
    {
        if(this.ileLitrow + ilosc <= this.pojemnosc)
            this.ileLitrow += ilosc;
        else{
            double zostalo = ilosc - (pojemnosc - ileLitrow);
            this.ileLitrow = this.pojemnosc;
            System.out.println("Zostało " + zostalo + " litrów");
        }


    }
    boolean wylej(double ilosc)
    {
        if(ilosc<=ileLitrow)
            this.ileLitrow -= ilosc;
        else
            return false;

        return true;
    }

    void przelej(double ile,Butelka gdziePrzelać)
    {
        if(this.wylej(ile))
            if(gdziePrzelać.ileLitrow + ile <= gdziePrzelać.pojemnosc)
                gdziePrzelać.ileLitrow += ile;
            else{
                double zostalo = ile - (gdziePrzelać.pojemnosc - gdziePrzelać.ileLitrow);
                gdziePrzelać.ileLitrow += (ile - zostalo);
                this.ileLitrow +=zostalo;
            }
    }


    public static void main(String[] args) {


        Butelka[] butelka = new Butelka[10]; //NULL

        for (int i = 0; i < 10 ; i++) {
            butelka[i] = new Butelka(5,3);
        }

        butelka[0].przelej(3,butelka[1]);
        System.out.println(butelka[0].ileLitrow);
        System.out.println(butelka[1].ileLitrow);
    }
}
