package pliki;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class PlikiKatalogi {

    public static void main(String[] args) {
        File plik = new File("test.txt");
        File katalog = new File("cos"+File.separator+"test");
        katalog.mkdirs();
        System.out.println("Czy katalog? " + katalog.isDirectory());

        File plik2 = new File("tescik2.txt");

        try{
            if(!plik.exists()){
                plik.createNewFile();
            }
            System.out.println("Czy moge pisać? " + plik.canWrite() );
            System.out.println("Czy moge odpalic? " + plik.canExecute() );
            System.out.println("Czy moge czytac? " + plik.canRead() );
            System.out.println("Czy jest ukryty? " + plik.isHidden() );
            System.out.println("Czy jest plikiem? " + plik.isFile() );
            System.out.println("Ostatnio modyfikacja " + new Date(plik.lastModified()) );
            System.out.println("Długość pliku w bajtach " + plik.length() );
            //plik.delete();
            //nie mozna usuwac katalogow jezeli cos w nich jest

        }
        catch(IOException e){
                e.printStackTrace();
            }

        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("java.home"));

        System.out.println(plik.getPath());
        System.out.println(plik.getAbsolutePath());
        //testowane w try catch
        //System.out.println(plik.getCanonicalPath());

        System.out.println(plik.list());

        wypiszSciezki(new File(System.getProperty("user.dir")));

    }

    public static void wypiszSciezki(File nazwaSciezki){
        String[] nazwyPlikowIKatalogow = nazwaSciezki.list();
        System.out.println(nazwaSciezki.getPath());
        for (int i = 0; i < nazwyPlikowIKatalogow.length ; i++) {
            File f = new File(nazwaSciezki.getPath(), nazwyPlikowIKatalogow[i]);
            System.out.println(f.getPath());
        }
    }
}
