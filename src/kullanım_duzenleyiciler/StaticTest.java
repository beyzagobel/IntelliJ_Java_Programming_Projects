package kullanım_duzenleyiciler;

public class StaticTest {

    static int sayi ;

    public StaticTest(){
        sayi ++;
        System.out.println("Yapıcı metod : sayı : " + sayi);
    }

    static {
        sayi ++ ;
        System.out.println("Static Kod Bloğu : sayı : " + sayi);
    }

    public static void main(String [] args){

        StaticTest staticTest = new StaticTest();
        StaticTest.sayi ++;
        System.out.println("Main metodu : sayi : " + sayi);
    }
}

/*

Çıktı :

Static Kod Bloğu : sayı : 1
Yapıcı metod : sayı : 2
Main metodu : sayi : 3

 */
