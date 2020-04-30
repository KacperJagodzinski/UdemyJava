public class Referencje2 {
    public static void main(String[] args) {
        int a = 5;
        Test2 x = new Test2();
        x.zmienWarosc(a);
        //a = x.zmienWarosc(a);

        System.out.println(a);

        Foo foo = new Foo();

        x.zmienWartosc(foo);

        System.out.println(foo.y);

    }
}

class Test2
{
    int zmienWarosc(int zm){
        zm +=2;
        //tutaj zm przestaje istniec
        return zm;
    }
    void zmienWartosc(Foo zm)
    {
        zm.y = zm.y + 40;
    }
}

class Foo{
    int y = 20;
}
