package klasyAnonimowe;

public class Anonimowe {
    public static void main(String[] args) {
        ZachowaniePoWcisnieciu z = new Przycisk1();
        ZachowaniePoWcisnieciu z2 = new ZachowaniePoWcisnieciu() {
            @Override
            public void akcja() {
                System.out.println("Jestem z klasy anonimowej");
            }
        };

        z.akcja();
        z2.akcja();


        Przycisk3 p = new Przycisk3();
        p.stworz(z2);

    }
}

interface ZachowaniePoWcisnieciu{
    void akcja();
}

class Przycisk1 implements ZachowaniePoWcisnieciu{

    @Override
    public void akcja() {
        System.out.println("Jestem z przycisku 1");
    }
}
class Przycisk2 implements ZachowaniePoWcisnieciu{

    @Override
    public void akcja() {
        System.out.println("Jestem z przycisku 2");
    }
}

class Przycisk3{
    void stworz(ZachowaniePoWcisnieciu z){
        z.akcja();
    }
}
