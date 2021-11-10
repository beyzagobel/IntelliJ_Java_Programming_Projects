package java_proje_ornekleri;

import java.util.Scanner;

public class TasKagitMakasOyunu {

    public static void main(String[] args) {
        /*
         * Kullanıcıdan ve bilgisayardan değerler alımır ve puanlar tutulur, en son kazanan belirlenir
         */

        Scanner scanner = new Scanner(System.in);
        int kullanici_puan = 0 ;
        int bilgisayar_puan = 0;

        System.out.println("Taş kağıt makas oyununa hoş geldiniz !");

        while(true){
            System.out.println("1 - Taş  2 - Kağıt  3 - Makas");
            System.out.println("Seçiminiz : ");
            int kullanici_giris = scanner.nextInt();
            int bilgisayar_giris =(int) Math.random()*3;
            // Math.random metodu ile 0 ile 3 arasında rastgele sayı ürettiriyoruz

            if(kullanici_giris == 1){
                if(bilgisayar_giris == 1){
                    System.out.println("Bilgisayarın seçimi Taş, Sonuç : Berabere");
                    System.out.println("Puanınız : "+kullanici_puan+" Bilgisayarın puanı : "+bilgisayar_puan);
                }
                else if(bilgisayar_giris == 2){
                    System.out.println("Bilgisayarın seçimi Kağıt, Sonuç : Kaybettiniz");
                    bilgisayar_puan++;
                    System.out.println("Puanınız "+kullanici_puan+" Bilgisayarın puanı "+bilgisayar_puan);
                }
                else{
                    System.out.println("Bilgisayarın seçimi Makas, Sonuç Kazandınız");
                    kullanici_puan++;
                    System.out.println("Puanınız "+kullanici_puan+" Bilgisayarın puanı "+bilgisayar_puan);
                }
            }
            else if(kullanici_giris == 2){
                if(bilgisayar_giris == 1){
                    System.out.println("Bilgisayarın seçimi Taş , Sonuç : Kazandınız");
                    kullanici_puan++;
                    System.out.println("Puanınız "+kullanici_puan+" Bilgisayarın puanı "+bilgisayar_puan);
                }
                else if(bilgisayar_giris == 2){
                    System.out.println("Bilgisayarın seçimi Kağıt, Sonuç : Berabere");
                    System.out.println("Puanınız "+kullanici_puan+" Bilgisayarın puanı "+bilgisayar_puan);
                }
                else{
                    System.out.println("Bilgisayarın seçimi Makas, Sonuç : Kaybettiniz");
                    bilgisayar_puan++;
                    System.out.println("Puanınız "+kullanici_puan+" Bilgisayarın puanı "+bilgisayar_puan);
                }
            }
            else if(kullanici_giris == 3){
                if(bilgisayar_giris == 1){
                    System.out.println("Bilgisayarın girişi Taş, Sonuç : Kaybettiniz");
                    bilgisayar_puan++;
                    System.out.println("Puanınız "+kullanici_puan+" Bilgisayarın puanı "+bilgisayar_puan);
                }
                else if(bilgisayar_giris ==2){
                    System.out.println("Biilgisayarın girişi Kağıt, Sonuç : Kazandınız ");
                    kullanici_puan++;
                    System.out.println("Puanınız "+kullanici_puan+" Bilgisayarın puanı "+bilgisayar_puan);
                }
                else{
                    System.out.println("Bilgisayarın girişi Makas, Sonuç Berabere");
                    System.out.println("Puanınız "+kullanici_puan+" Bilgisayarın puanı "+bilgisayar_puan);
                }
            }
            else {
                System.out.println("Hatalı giriş yaptınız tekrar deneyiniz");
                continue;
            }

            if(kullanici_puan == 3){
                System.out.println("Oyunu " + (kullanici_puan-bilgisayar_puan) + "  ile kazandınız");
                break;
            }
            else if(bilgisayar_puan == 3){
                System.out.println("Oyunu " + (bilgisayar_puan-kullanici_puan) + " ile kaybettiniz");
                break;
            }


        }

    }
}
