package java_proje_ornekleri;

import java.util.Scanner;

public class BoslukBirlestirme {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir metin giriniz : ");
        String metin = scanner.nextLine();

        for(int i = 0 ; i < metin.length()-1 ; i++){
            metin = metin.replace(" ","");
        }

        System.out.println("Yazdığınız metnin boşluksuz hali : " + metin);
    }
}
