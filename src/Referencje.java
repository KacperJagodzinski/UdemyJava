public class Referencje {
    public static void main(String[] args) {
        int a = 53;

        System.out.println(a);

        Test x = new Test(); //x nie znajduje sie żadna warosc zwykla tylko adres

        Test y = x;

        y.a = 40;

        System.out.println(x.a);

        String imie = "Arkadiusz";
        String imie2 = new String(imie);

        imie2 = "Trarlalla";

        System.out.println(imie);
    }
}

class Test
{
    int a = 20;
}
