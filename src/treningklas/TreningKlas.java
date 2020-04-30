package treningklas;

import java.util.DoubleSummaryStatistics;

public class TreningKlas {

    public static void main(String[] args) {

        Osoba[] osoba = new Osoba[4];
        //osoba[0] == null
        osoba[0] = new Pracownik("Arek","Test",1234);
        osoba[1] = new Student("Darek","TEstwowy");

        //osoba[0].opis();

        for (int i = 0; i < osoba.length ; i++) {
            if(osoba[i] instanceof Osoba)
                osoba[i].opis();
            else
                break;
        }


    }
}

abstract class Osoba{
    String imie;
    String nazwisko;
    Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    abstract void opis();
}

class Pracownik extends Osoba{
    Pracownik(String imie, String nazwisko, double wynagrodzenie){
        super(imie,nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }
    double wynagrodzenie;

    @Override
    void opis() {
        System.out.println("Jestem pracownikiem");

    }
}

class Student extends Osoba{
    Student(String imie, String nazwisko){
        super(imie,nazwisko);
    }

    @Override
    void opis() {
        System.out.println("Jestem studentem");

    }

}