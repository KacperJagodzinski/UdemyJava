package token;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Towar {

    //aby osiagnac swobodny dostep do pliku trzeba z gory ustalic ilosc bajtow
    //przeznaczonych do przechowywania danych
    //String Buffer o ustalonej długości (append)

    private double cena;
    private String nazwa;
    private Date dataWydania;

    public Towar() {
        this.cena = 0.0;
        this.nazwa = " ";
        this.dataWydania = new GregorianCalendar().getTime();
    }

    public Towar(double cena, String nazwa) {
        this();
        this.cena = cena;
        this.nazwa = nazwa;
    }

    public Towar(double cena, String nazwa, int rok, int m, int dn) {
        this(cena, nazwa);
        GregorianCalendar kalendarz = new GregorianCalendar(rok,m-1,dn);
        this.dataWydania = kalendarz.getTime();
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setDataWydania(int rok, int m, int dn) {
        GregorianCalendar kalendarz = new GregorianCalendar(rok,m-1,dn);
        this.dataWydania = kalendarz.getTime();
    }

    public double getCena() {
        return cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Date getDataWydania() {
        return dataWydania;
    }

    @Override
    public String toString() {
        return "Towar{" +
                "cena=" + cena + " zł " +
                ", nazwa='" + nazwa + '\'' +
                ", dataWydania=" + dataWydania +
                '}';
    }

    public static void zapiszDoPliku(Towar[] towary, PrintWriter outS){
        outS.println(towary.length);
        GregorianCalendar kalendarz = new GregorianCalendar();
        for (int i = 0; i <towary.length ; i++) {
            kalendarz.setTime(towary[i].getDataWydania());
            outS.println(towary[i].getCena() + " | " + towary[i].getNazwa() + " | " + kalendarz.get(Calendar.YEAR));
        }
    }

    public static Towar[] odczytajZPliku(BufferedReader inS) throws IOException {
        int length = Integer.parseInt(inS.readLine());
        Towar[] towary = new Towar[length];
        for (int i = 0; i < towary.length ; i++) {
            String linia = inS.readLine();
            StringTokenizer tokeny = new StringTokenizer(linia," | ");
            double cena = Double.parseDouble(tokeny.nextToken());
            String nazwa = tokeny.nextToken();
            int rok = Integer.parseInt(tokeny.nextToken());
            towary[i] = new Towar(cena,nazwa,rok,1,1);
        }
        return towary;
    }
}
