package donguler_08;

import java.util.Scanner;

public class DongulerdeBreakKomutu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int malzemeNo;
        double deger , toplam;
        System.out.println("10 tane malzeme alabilirsiniz. ");
        System.out.println("Fakat toplam harcamanız 100 TL'yi geçmemeli.");
        toplam = 0 ;
        for(malzemeNo = 1 ; malzemeNo <= 10 ; malzemeNo ++){
            System.out.println("Malzeme " + malzemeNo);
            System.out.println("Fiyatı, TL cinsinden : ");
            deger = scanner.nextInt();
            toplam = toplam + deger ;
            if(toplam == 100 ){
                System.out.println("Bütün paranızı harcadınız!");
                break;   // komutu ile döngüden çıkılır
            }
            else if(toplam > 100){
                System.out.println("Harcamanız gerekenden fazla harcadınız!");
                break;
            }
            System.out.println("Bu ana kadar toplam harcamanız (TL) : " + toplam);
            System.out.println("Daha alabileceğiniz " + (10 - malzemeNo) + " malzeme var.");

        }
        System.out.println("Toplam harcamanız (TL) : " + toplam);
    }
}
