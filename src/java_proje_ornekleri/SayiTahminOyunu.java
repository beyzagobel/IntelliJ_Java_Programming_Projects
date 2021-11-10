package java_proje_ornekleri;

// import java.util.Scanner;
// import java.util.Random;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    public  static  void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Sayı tahmin oyununa hoş geldiniz.");
        System.out.println("Lütfen 1-10 arası bir tam sayı giriniz. ");
        int tahmin = scanner.nextInt();    // kullanıcıdan sayı alıyoruz
        int randomSayi = random.nextInt(11);  // 10 de dahil random sayı alıyoruz

        while(tahmin != randomSayi){
            if(tahmin < 0  || tahmin > 10){
                System.out.println("Lütfen 1 ile 10 arasında bir değer giriniz. ");
            }
            else if(tahmin < randomSayi){
                System.out.println("Daha büyük bir değer giriniz.");
                tahmin = scanner.nextInt();
            }
            else{
                System.out.println("Daha küçük bir değer giriniz. ");
                tahmin = scanner.nextInt();
            }
        }
        System.out.println("Tebrikler, "+randomSayi+" randomm sayısını buldunuz. ");


    }
}
