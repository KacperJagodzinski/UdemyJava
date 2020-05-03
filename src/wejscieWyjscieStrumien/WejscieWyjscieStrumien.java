package wejscieWyjscieStrumien;

import java.io.*;

public class WejscieWyjscieStrumien {

    public static void main(String[] args) throws IOException {
        //Klasy abstrakcyje
        //Input i Output na bajtach REader i Writer maja odpowiedniki znakowe
        InputStream inS;
        OutputStream outS;

        Reader reader;
        Writer writer = new FileWriter("nazwaPliku.txt");
        writer.write("lalalala");
        //zamykamy głowne po to żeby mieć pewność że zmiany się zapisały
        writer.close();

    }
    //przyjmnuje wszystkie podklasy potem mozemy rzutowac typowa klasa abstrakcyjna
    void nazwaF (InputStream inS){

    }
}
