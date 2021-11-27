package java_proje_ornekleri;

import java.util.Scanner;

public class BoslukBulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz :");
        String metin = scanner.nextLine();
        int sayac = 0 ;

        int i = 0 ;
        while (i < metin.length()){

            String harf = metin.substring(i, i+1);

            if(harf.equals(" ")){
                sayac ++ ;
            }
            i ++ ;
        }
        System.out.println("metinin boşuk sayısı : " + sayac);
    }
}
