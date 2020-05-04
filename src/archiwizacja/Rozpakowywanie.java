package archiwizacja;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Rozpakowywanie {

    public static int BUFFOR = 1024;
    public static void main(String[] args)
    {
        File katalog = new File(System.getProperty("user.dir")+File.separator+"nazwaMojegoZipa");
        ZipEntry wpis = null;

        byte []tmpData  = new byte[1024];
        try
        {
            if (!katalog.exists())
                katalog.mkdir();
            ZipInputStream zInS = new ZipInputStream(new BufferedInputStream(new FileInputStream("nazwaMojegoZipa.zip"),BUFFOR));
            while ((wpis = zInS.getNextEntry())!= null)
            {
                BufferedOutputStream fOutS = new BufferedOutputStream(new FileOutputStream(katalog+File.separator+wpis.getName()),BUFFOR);
                int counter;
                while ((counter = zInS.read(tmpData, 0, BUFFOR)) != -1)
                    fOutS.write(tmpData, 0, counter);
                fOutS.close();
                zInS.closeEntry();
            }
            zInS.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
