package kalıtım.overloading;

public class Overloading {

    /*
     * Erişim düzenleyiciler ve geri dönüş tiplerinin bir öenmi yoktur.
     * Oveloading işleminde metod isimleri aynı ve metod parametleri farklı olmalıdır. Bu iki kritere baklılır.
     */
    private int  sayi1;
    private int sayi2 ;
    private int sayi3;

    public int topla(int sayi1, int sayi2){
        int toplam = sayi1 + sayi2;
        return toplam;
    }

    private double topla(int sayi1,int sayi2,int sayi3){
        double toplam = sayi1 + sayi2 + sayi3;
        return toplam;
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.topla(3,4);
    }
}
