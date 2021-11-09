package diziler.tekboyutludiziler;

import java.util.Scanner;

public class Ornek1<j> {
    public static void main(String[] args) {
        /*
        * Değerleri arasında index ile üzerinde gezinilenebiliriz
        * Dizilerin tüm elemanları aynı tipte olmak zorundadır.
        * İndexleme 0'dan başlar, n elemanlı bir dizi için n-1 'de biter.
        Tüm dizi yapıları, nesne tipindedir.

       DiziTipi DiziAdi[] = new DiziTipi [eleman sayısı]

         */

        // Dizi kullanılmadan 5  adet sayıyı toplayan program yazalım

        Scanner scanner=new Scanner(System.in);
        int girilenSayi=0,toplam=0,i;

        for(i=1;i<=5;i++){
            System.out.print(i+". sayıyı giriniz : ");
            girilenSayi=scanner.nextInt();
            toplam=toplam+girilenSayi;
        }
        System.out.println("Girdidğiniz 5 tane sayının toplamı : "+toplam);
    }

    // Yukarıdaki aynı programı diziler kullanarak Ornek2.java class ında yazalım

/*
Çıktı :

1. sayıyı giriniz : 4
2. sayıyı giriniz : 5
3. sayıyı giriniz : 6
4. sayıyı giriniz : 7
5. sayıyı giriniz : 8
Girdiğiniz 5 tane sayının toplamı : 30

 */


}
