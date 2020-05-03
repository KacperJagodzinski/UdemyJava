package wejscieWyjscieStrumien;

import java.io.*;

public class ZapisIOdczyt {

    public static void main(String[] args) {
        try {
            PrintWriter drukarz = new PrintWriter(new FileWriter("dane.txt")); //dopisz ,true zeby dopisywac
            drukarz.print(1234);
            //drukarz.flush();
            drukarz.close();

            //drukarz.print("lalala");

            drukarz = new PrintWriter(new FileWriter("dane.txt",true));
            drukarz.append("testappend");
            drukarz.println();
            drukarz.printf("lala %d, i %.2f",50,204.567);
            drukarz.close();

            BufferedReader reader = new BufferedReader(new FileReader("dane.txt"));
            //System.out.println((char)reader.read());
            //System.out.println(reader.readLine());
            BufferedWriter writer = new BufferedWriter(new FileWriter("baza.txt"));
            String tresc ="";
            while((tresc = reader.readLine()) != null){
                System.out.println(tresc);
                writer.write(tresc);
                writer.newLine();
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
