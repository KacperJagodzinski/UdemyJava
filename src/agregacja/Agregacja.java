package agregacja;

public class Agregacja {

    public static void main(String[] args) {

        Pracownik pracownik = new Pracownik("Andrzej",new Adres("Wilcza",11));

    }
}

class Pracownik{
    String imie;
    //agregacja
    Adres adres;

    public Pracownik(String imie, Adres adres) {
        this.imie = imie;
        this.adres = adres;
    }
}

class Adres{
    String ulica;
    int nrDomu;

    public Adres(String ulica, int nrDomu) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
    }
}
