package donguler_08;

import java.util.Scanner;

public class EnBuyukBolenBulma {

    public static void main(String[] args) {
        /*
        * Parametre olarak gelen  tamsayının kendisinden ayrı en büyük bölenini geri döndüren,
        enBuyukBolen Bul isimli metodu en optimum şekilde yazınız.
        * Metodu test etmek için kullanıcıdan bir tamsayı girmesini isteyiniz.
        * Girilen tamsayıyı geliştirdiğiniz metoda parametre olarak gönderiniz.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz : ");
        int sayi = scanner.nextInt();
        System.out.println(sayi + "'dan farklı en buyuk bolen : "+enBuyukBolenBul(sayi));

    }

    public static int enBuyukBolenBul(int sayi){
        for(int i=sayi/2;i>=2;i--){
            if(sayi % 1 == 0){
                return i ;
            }
        }
        return 1;   // asal sayılar için
    }
}
