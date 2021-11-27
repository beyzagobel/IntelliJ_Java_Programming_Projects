package java_proje_ornekleri;

import java.util.Scanner;

public class VeriDondur {

    public int veriYazdir(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String metin = scanner.nextLine();
        int sayi = metin.length();
        return sayi;

    }

    public static void main(String[] args) {
        int sembolsayisi;
        VeriDondur eleman = new VeriDondur();
        sembolsayisi = eleman.veriYazdir();
        System.out.println("Sembol sayisi : " + sembolsayisi);
    }
}
