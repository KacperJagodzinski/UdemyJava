package interfejsy;

import java.util.Arrays;

public class TestInterface {
    public static void main(String[] args) {
        System.out.println(nazwaInterfejsu.PI);
        //nazwaInterfejsu a = new Pracownik();
        //a.cos();
        Pracownik[] tab = new Pracownik[3];
        tab[0] = new Pracownik(1000);
        tab[1] = new Pracownik (5000);
        tab[2] = new Pracownik(500);

        System.out.println(tab[0].wynagrodzenie);
        Arrays.sort(tab);
        System.out.println(tab[0].wynagrodzenie);
    }
}

interface nazwaInterfejsu{
    double PI = 3.14; //public static final

    void cos(); //public, abstract - musi zostac nadpisana

    //interface jest po to żeby wymóc coś na klasie
    //moge implementować wiecej niz 1 interfejs
    //wszystkie metody są publiczne a w klasie abstrakcyjnej moge wybrać

}

class Pracownik implements nazwaInterfejsu, Comparable<Pracownik>{

    double wynagrodzenie;

    Pracownik(double wynagrodzenie){
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public void cos() {

    }

    @Override
    public int compareTo(Pracownik o) {
        if(this.wynagrodzenie<o.wynagrodzenie)
            return -1;
        else if(this.wynagrodzenie==o.wynagrodzenie)
            return 0;
        else
            return 1;
    }
}
