/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Obiekt <code>Pracownik</code> reprezentuje Pracownika, jest to nadklasa dla...
 * opis
 * opis
 * opis
 *
 * @author Kacper Jagodzinski
 * @version 1.0.4.2 01/05/2020
 * @see
 *
 */
public class Dokumentacja {
    /**
     * Imię pracownika
     */
    private String imie;
    /**
     * Nazwisko pracownika
     */
    private String nazwisko;
    /**
     * Wynagrodzenie pracownika
     */
    private double wynagrodzenie;

    /**
     * Konstruktor domyslny
     */
    public Dokumentacja(){}

    /**
     * Konstruktor towrzacy obiekt z imieniem,nazwiskiem oraz wynagrodzeniem
     * @param imie ustawia umie
     * @param nazwisko ustawia nazwisko
     * @param wynagrodzenie ustawia wynagrodzenie
     */
    public Dokumentacja(String imie, String nazwisko, double wynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wynagrodzenie = wynagrodzenie;
    }

    /**
     * <pre>
     * Jak używać:
     *
     * Pracownik p = new Pracownik();
     * p.setWynagrodzenie(1000);
     *</pre>
     * @param wynagrodzenie ustawia nowe wynagrodzenie
     */
    public void setWynagrodzenie(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }
    /**
     * @since 1.0.0.0     *
     * @return zwraca pensje typu double w zł
     */
    public double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }
}
