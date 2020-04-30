import dziedziczenie.Potwor;
import dziedziczenie.Szkielet;
import dziedziczenie.Zombie;

public class Dziedziczenie {


    public static void main(String[] args) {
        Potwor potwor = new Potwor(10,100);
        //System.out.println(potwor.predkoscChodzenia);

        Szkielet szkielet = new Szkielet(5,50,"Łuk");
        szkielet.atakuj();

        Zombie zombie = new Zombie();

        zombie.healthPoints = 10;

        //polimorfizm

        Potwor szk = new Szkielet(10,100,"Łuk");
        szk.atakuj();

        //potwor.predkoscChodzenia
        //protected




    }
}
