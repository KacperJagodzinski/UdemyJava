package archiwizacja;

import java.io.*;
import java.util.zip.*;

public class Archiwizacja {
    public static final int BUFFOR = 1024;

    public static void main(String[] args) {

        byte tmpData[] = new byte[BUFFOR];
        try {
            ZipOutputStream zOutS = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream("nazwaMojgoZipa")));

            BufferedInputStream inS = new BufferedInputStream(new FileInputStream("inny.txt"),BUFFOR);
            zOutS.putNextEntry(new ZipEntry("inny.txt"));
            int counter;
            while((counter = inS.read(tmpData,0,BUFFOR))!= -1) {
                zOutS.write(tmpData,0,counter);
            }
            zOutS.closeEntry();
            zOutS.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


/*
*
* *///