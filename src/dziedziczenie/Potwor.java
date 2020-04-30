package dziedziczenie;

public class Potwor {
    protected double predkoscChodzenia = 10;
    public double healthPoints;

    public void atakuj(){
        //implementacja metody potwór
        System.out.println("atak");
    }

    public Potwor(){}

    public Potwor(double predkoscChodzenia, double healthPoints){
        this.predkoscChodzenia = predkoscChodzenia;
        this.healthPoints = healthPoints;
    }
}
