package dziedziczenie;

public class Szkielet extends Potwor{

    String typBroni;
    @Override
    public void atakuj(){
        //implementacja ataku szkieleta
        super.atakuj();
        System.out.println("atak szkieleta");
    }

    @Override
    void opis() {

    }

    public Szkielet(){}
    public Szkielet(double predkoscChodzenia, double healthPoints,String typBroni){
        super(predkoscChodzenia,healthPoints);
        this.typBroni = typBroni;
    }


}
