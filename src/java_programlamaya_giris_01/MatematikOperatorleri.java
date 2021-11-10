package java_programlamaya_giris_01;

public class MatematikOperatorleri {
    public static void main(String[] args) {

        /*
         * Toplama : +
         * Çıkarma : -
         * Çarpma : *
         * Bölme : /
         * Mod : % (kalanı verir)

         İşlem Öncelik Sırası
         * Parantez İçleri
         * Bölme
         * Çarpma
         * Toplama ve Çıkarma
         */

        double sonuc1 = 0.5 + 0.1 * 4 ;
        double sonuc2 = (0.5 + 0.1) * 4 ;
        double sonuc3= 0.5 / 0.1 * 4 ;

        System.out.println(sonuc1);       // 0.9
        System.out.println(sonuc2);       // 2.4
        System.out.println(sonuc3);       // 20

        int i = 5 , j = 1;
        System.out.println("Sayi : " + i + j);    // String birleştirmesi yapar  // 51
        System.out.println("Sayi : " + (i + j));  // numerik toplama yapar  // 6
    }
}
