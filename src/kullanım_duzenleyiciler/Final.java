package kullanım_duzenleyiciler;

public class Final {

    String renk;
    final String renk2 = "Kırmızı";  // ilk tanımlandığı yerde ilk değer ataması yapılmalı veya

    final String renk3; // ilk değer ataması yapılmamış fakat yapıcı metod ile değer ataması yapılmıştır
    public Final(){
        renk3 = "Beyaz";
   }

    public static void main(String[] args) {

        /*
         * Değişkenleri değiştirilemez, sabit değer (constant) taşıyacak hale getirir.
         * Metodları override edilemez (ezilemez) hale getirir.
         * Sınıfları kendisinden türetilemez hale getirir.
         * final değişkenlere değer ataması ,tanımlama esnasında veya yapıcı metotta gerçekleştirilir.
         * final primitive değişkenlere değer atandıktan sonra değiştirilemez.
         * final değişkenlerin referans ettiği nesneler değiştirilemez; ancak ilgili nesnelerin alanları değiştirilebilir.


         public final class Ornel{    // final sınıf tanımlama

         }


         public final String ad = "Ahmet" ;  // final değişken tanımlama

         public final void yazdir () {   // final metod tanımlama

         * }


         */


        Final nesne = new Final();

        final String renk4;

        renk4 = "Yeşil";
//        renk4 = "Sarı";   bu şekilde final olan renk4 değişkeninin değerini değişteremeyiz

        nesne.renk = "Siyah";  // yerel ve final değişken olan renk4 değişkeninin ilk değer ataması


//        nesne.renk2 = "Pembe";  değerini değiştiremeyiz

        System.out.println(nesne.renk);
        System.out.println(nesne.renk2);
        System.out.println(nesne.renk3);
        System.out.println(renk4);


    }
}


