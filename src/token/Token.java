package token;

import java.io.*;

public class Token {

    public static void main(String[] args) {

        Towar[] towary = new Towar[3];
        towary[0] = new Towar();
        towary[0].setNazwa("test");
        towary[1] = new Towar(29.0,"Java");
        towary[2] = new Towar(39.0,"C++",2008,11,21);

        try{
            PrintWriter writer = new PrintWriter(new FileWriter("baza.txt"));
            Towar.zapiszDoPliku(towary,writer);
            writer.close();
            BufferedReader reader = new BufferedReader(new FileReader("baza.txt"));
            Towar[] towary2 = Towar.odczytajZPliku(reader);
            for (int i = 0; i < towary2.length; i++) {
                System.out.println(towary2[i]);
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
