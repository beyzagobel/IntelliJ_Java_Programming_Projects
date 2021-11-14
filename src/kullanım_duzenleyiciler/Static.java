package kullanım_duzenleyiciler;

public class Static {

    public static int sayi = 5 ;

    public static void sayiEkle(){
        sayi++;
    }

    /*
     * static anahtar sözcüğü global değişkenlerde ve metodlarda kullanılır.
     * Yerel değişkenlere uygulanamaz.
     * Sınıf üzerinde tanımlandığında ilgili sınıftan türetilen tüm nesnelerde aynı değere sahiptir.
     * Sınıfa ait bir çok nesne yaratılsa bile, static değişkenin değerini ortak olarak kullanırlar.
     * Tabii, program içerisinde static değişkenin değeri değişebilir. Ama, değişene dek, bütün nesneler aynı değeri kullanmak durumundadır.
     * Değeri değişse bile, o andan sonra gene bütün nesneler onun yeni değerini kullanır.
     */

    public static void main(String[] args) {

        Static nesne = new Static();

//        System.out.println(nesne.yas);

    }
}
