package wyjątki;

public class Wyjatek {

    public static void main(String[] args) {
//        System.out.println(5/0);
//
//        System.out.println("cokolwiek");

        /*
        try
        {
        instrukcje potencjalnie wywołujace błąd
        }
        catch(Nawzwa_wyjatku zmienna)
        {
         co mamy zrobić jak cos się stanie
        }
         */

        try{
            System.out.println("haha");
            System.out.println(5/0);
            System.out.println("haha");
        }catch(ArithmeticException e){
            System.out.println("Dzielenie przez 0");
        }finally {
            System.out.println("to bedzie wykonane zawsze");
        }

        int a = 10;
        try{
            if(a == 10)
                throw new NaszWyjatek("a rowne 10");
        }catch (NaszWyjatek e) {
            e.printStackTrace();
        }


    }


}

class NaszWyjatek extends Exception{
    public NaszWyjatek(String message) {
        super(message);
    }
}
