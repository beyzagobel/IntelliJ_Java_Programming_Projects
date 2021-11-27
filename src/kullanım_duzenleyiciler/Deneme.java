package kullanım_duzenleyiciler;

public class Deneme {

    static  int x = 11 ;
    private  int y = 33 ;

    public void metod1 (int x) {
        Deneme d2 = new Deneme();
        Deneme.x = 22 ;
        y = 44 ;   // d1 nesnesinin y değişkenin değeri metod1 metodu ile değişir fakat d2 nesnesinin y değişkeninin değerini etkilemez.

        // static değişkenlerin değeri bir yerde değişirse, tüm nesneler üzerindeki değeri değişir.

        System.out.println("Deneme.x : " + Deneme.x);  // 22
        System.out.println("d2.x : " + d2.x);     // 22
        System.out.println("d2.y : " + d2.y);   // 33
        System.out.println("y : " + y);         // 44

    }

    public static void main(String[] args) {
        Deneme d1 = new Deneme();
        d1.metod1(5);
        System.out.println("d1.y : " + d1.y);

    }
}
