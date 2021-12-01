/*
 * static anahtar sözcüğü global değişkenlerde ve metodlarda kullanılır.   *****
 * Yerel değişkenlere uygulanamaz.
 * Sınıf üzerinde tanımlandığında ilgili sınıftan türetilen tüm nesnelerde aynı değere sahiptir.
 * Sınıfa ait bir çok nesne yaratılsa bile, static değişkenin değerini ortak olarak kullanırlar.
 * Tabii, program içerisinde static değişkenin değeri değişebilir. Ama, değişene dek, bütün nesneler aynı değeri kullanmak durumundadır.
 * Değeri değişse bile, o andan sonra gene bütün nesneler onun yeni değerini kullanır.
 * Static metod, static olmayan bir metoda ve değişkene ulaşamaz. Bir nesne üzerinden static metodlara ve değişkenlere erişilinir. ******
 * Static olmayan metodlar static değişkenlere erişebilir.
 * Static değişkenlere sınıf üzerinden veya kendisi üzerinden erişim sağlanır. Nesne üzerinden erişim gereksizdir.
 * Static metodlar ve değişkenler , sınıfa ait olduğundan ilgili sınıftan hiç nesne oluşturulmamış olsa bile kullanılabilir.
 * Sınıflar metod tanımlamları dışında static kod bloklarına sahip olabilirler.Bu kod blokları, ilgili yapıcı metoddan ve sınıftaki herhangi başka metottan önce çalıştırılır.
 *
 */

package kullanım_duzenleyiciler;

public class Static {


    public static int sayi = 5 ;

    private int sayi2;   // gloabal ve static değişkenlerin ilk değerleri vardır.

    public static void sayiEkle(){
        Static nesne2 = new Static();
           sayi++;
        // sayi2 ++;   erişemeyiz. Çünkü static olmayan bir değişken, static metod içinde kullanılamaz.
        // yazdir();  buradan çağıramam çünkü staticmetod içinde static olmayan metod veya değişken çağrılamaz.
        nesne2.yazdir();  // yazdir() metodu bir static metod değildir fakat bir nesne üzerinden static bir metodda static olmayan bir metod çağrılabilir.
        nesne2.sayi2 ++ ;   // sayi2 değişkeni static bir değişken değildir fakat nesne üzerinden static meod içinde static olmayan bir değişkene erişilebilir.
    }

    public void yazdir(){
        System.out.println(sayi);
        System.out.println(this.sayi2);  // gloabal değişken olan sayi2'nin varswayılan değeri = 0
        this.sayi2++;
        System.out.println(this.sayi2);
        sayiEkle();  // static bir  metoda  he yerden erişim sağlanabilir
    }

    static {
        sayi ++;   // 6
        System.out.println("Static kod bloğu : "+ sayi);
    }

    public static void main(String[] args) {

        // static int sayi1 ;   yerel değişkenlere uygulanamaz

        Static nesne = new Static();
        System.out.println(Static.sayi);     //    sınıf üzerinden erişim
        System.out.println(sayi);            //    satatic değişkene direk erişim

        sayi ++ ;   // 6 + 1 = 7

        sayiEkle();                        //  static metod olduğu için bu şekilde erişebilirim
        System.out.println(sayi);
        Static.sayiEkle();                 //   static metoda sınıf üzerinden erişim
        System.out.println(sayi);
        nesne.yazdir();

        System.out.println(nesne.sayi);   // erişilinir ama tercih edilmez


    }
}


