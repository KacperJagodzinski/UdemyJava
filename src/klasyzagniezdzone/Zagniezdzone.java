package klasyzagniezdzone;

public class Zagniezdzone {

    public static void main(String[] args) {
        A a = new A();
        A.B tmp = a.new B();
        //nie mozna stworzyc klasy wewnetrznej bez klasy zewnetrzenej
        A.C tmp2 = new A.C();
        //klase statyczna mozemy stworzyc bez tworzenia klasy zewnetrzenej


    }
}
class A{
    private int test;
    A(){
        System.out.println("Jestem z klasy zewnętrznej");
    }
    class B{
        B(){
            System.out.println("Jestem z klasy wewnetrznej");
        }
        private int tmp;
        void cos(){

            //mam dostep do zmiennej zewnetrznej klasy
            test = 5;
        }
        //nie mam dostepu do zmiennej klasy wewnetrznej
        //tmp = 2;

    }

    static class C{
        C(){
            System.out.println("Jestem z klasy statycznej wewnetrznej");
            //test =5;
            //nie mam dostepu do zmiennej klasy zewnetrznej
        }
    }


}
