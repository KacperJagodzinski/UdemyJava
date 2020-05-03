package wejscieWyjscieStrumien;

import java.io.*;

public class WejscieWyjscieStrumien {

    public static void main(String[] args) throws IOException {
        //Klasy abstrakcyje
        //Input i Output na bajtach REader i Writer maja odpowiedniki znakowe
        InputStream inS;
        OutputStream outS;

        File plik = new File("nazaPliku.txt");
        Writer writer2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(plik)));

        Reader reader;
        //FileWriter pozwala nam zapisac do pliku
        //Połączenie strumienia z buforem (zapis tymczasowych danych)
        //Na poczatku sa przetrzymywane w buforze w pamieci i przy zamknieciu sa wysylane wszystkie na raz
        //Program dziala szybciej
        Writer writer = new BufferedWriter(new FileWriter("nazwaPliku.txt"));
        ((BufferedWriter) writer).newLine();
        ((BufferedWriter) writer).write("lalala linia nastepna");
        ((BufferedWriter) writer).close();
        //writer.write("lalalala");
        //zamykamy głowne po to żeby mieć pewność że zmiany się zapisały
        //writer.close();

    }
    //przyjmnuje wszystkie podklasy potem mozemy rzutowac typowa klasa abstrakcyjna
    void nazwaF (InputStream inS){

    }
}
