package metodlar;

import java.util.Random;
import java.util.Scanner;

public class RandomSınıfıileTahminEt {
    /* tahminEt metod, 0 ile bizim parametre olarak belirttiğimiz üst sınır arasında rastgele tamsayı üretecek
    Kullanıcıya üst sınır hariç bir sayi tahmin etmesi istenir. Rastgele üretilen sayi ve kullanıcının girdiği
    tahmin ekrana yazdırılır.Metod üretilen tahminin doğruluğunu geri döndürür
    Main metodunda tahminEt metodu bizim belirttiğimiz parametre ile çağrılmalı ve sonuç ekrana yazdırılmalıdır.

     */

    public static void main(String[] args) {
        Boolean tahminSonucu=tahminEt(5);    // ustsınır:3
        if(tahminSonucu==true){
            System.out.println("Tebrikler doğru tahmin!");
        }else{
            System.out.println("Yanlış tahmin, bir daha deneyin!");
        }

    }
    public static boolean tahminEt(int ustSinir){
        Random random= new Random();
        int rastgeleUretilenSayi=random.nextInt(ustSinir);
        Scanner scanner=new Scanner(System.in);

        System.out.println("0 ile "+ustSinir+" arasında ("+ustSinir+") hariç bir tamsayı sayi giriniz : ");
        int tahmin=scanner.nextInt();
        System.out.println("Rastgele üretilen sayi : "+rastgeleUretilenSayi+" ve Sizin tahminini : "+tahmin);

        return rastgeleUretilenSayi==tahmin;
    }
}
