package dziedziczenie;

public class Szkielet extends Potwor{

    String typBroni;

    public Szkielet(){}
    public Szkielet(double predkoscChodzenia, double healthPoints,String typBroni){
        super(predkoscChodzenia,healthPoints);
        this.typBroni = typBroni;
    }


}
