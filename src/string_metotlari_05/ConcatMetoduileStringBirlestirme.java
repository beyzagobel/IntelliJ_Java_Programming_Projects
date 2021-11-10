package string_metotlari_05;

public class ConcatMetoduileStringBirlestirme {
    public static void main(String[] args) {
        /* String birleştirme işlemi 2 türlüde gerçekleştirilebilir
        1- + operatörü
        2- concat metodu
        3- String BUilder ve String Buffer
               */

        String ad="Beyza";
        String soyAd="Göbel";
        System.out.println("Ad-Soyad : "+ad+soyAd);   // Ad-Soyad : BeyzaGöbel

        System.out.println("Ad-Soyad : "+ad.concat(soyAd));   // Ad-Soyad : BeyzaGöbel
    }
}
