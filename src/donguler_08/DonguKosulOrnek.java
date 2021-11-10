package donguler_08;

import java.util.Scanner;

public class DonguKosulOrnek {

    public static void main(String[] args) {
       /*
        * Kullanıcıya "Türkiye'nin başkenti neresidir?" sorusunu sorunuz
        * Kullanıcıya doğru cevap için 3 cevap hakkı tanıyınız.
        * Kullanıcı doğru cevap bildiği anda program "Tebrikler, doğru cevap!" çıktısını konsola
          yazdırılmalı ve yürütüm sonlanmalıdır.
        * Kullanıcı 3 hakkında da doğru cevap bilemezse, "Hakkınız kalmadı, cevabı bilemediniz." çıktısının konsola yazdırınız.
        */

        int kalanhak=3;
        String cevap="";
        Scanner scanner = new Scanner(System.in);

        while(kalanhak>0) {
            kalanhak--;
            System.out.println("Türkiye'nin başkenti neresidir ?");
            cevap = scanner.nextLine();
            if (cevap.equalsIgnoreCase("Ankara")) {
                System.out.println("Tebrikler, doğru cevap! ");
                break;
            }
             else{
                System.out.println("Yanlış cevap " +kalanhak+" hakkınız kaldı. ");
            }
        }
        System.out.println("Hakkınız klamdı, cevsbı bilemediniz.");
        }

    }

