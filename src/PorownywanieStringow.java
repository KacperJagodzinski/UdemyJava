public class PorownywanieStringow {

    public static void main(String[] args) {
//        String imie = "Arkadiusz";
//        String imie2 = "Arkadiusz";
        String imie = new String("Arkadiusz");
        String imie2 = new String("Arkadiusz");

        if(imie==imie2)
            System.out.println("Są równe");

        if(imie.equals(imie2))
            System.out.println("są równe");
    }
}
