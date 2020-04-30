import dziedziczenie.Potwor;
import dziedziczenie.Szkielet;
import dziedziczenie.Zombie;

public class Dziedziczenie {


    public static void main(String[] args) {
        Potwor potwor = new Potwor(10,100);
        System.out.println(potwor.predkoscChodzenia);

        Szkielet szkielet = new Szkielet(5,50);

        Zombie zombie = new Zombie();

        zombie.healthPoints = 10;


    }
}
