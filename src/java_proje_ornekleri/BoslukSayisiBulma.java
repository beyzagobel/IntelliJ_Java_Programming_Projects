package java_proje_ornekleri;

import java.util.Scanner;

public class BoslukSayisiBulma {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String metin = scanner.nextLine();

        int sayac = 0; // boşluk sayısını yazaııcaz

        for (int i = 0; i < metin.length(); i++) {
            String karakter = metin.substring(i, i + 1);

            if (karakter.equals(" ")) {
                sayac++;
            }

        }
        System.out.println("boşlıuk sayısı : " + sayac);
    }
}
