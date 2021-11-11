package string_metotlari_05;

import java.util.Scanner;

public class StringDenemesi {

    public static void main(String [] args){
        String isim, baslik, altIsım;
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsim giriniz : ");
        isim = scanner.nextLine();   // TURKIYE girdim
        System.out.println("İsimdeki harf sayısı : ");
        System.out.println(isim.length());
        System.out.println(isim.toLowerCase());
        baslik = "    JAVA    ";
        System.out.println(baslik);
        System.out.println(baslik.trim());  // kelimenin başındaki ve sonundaki boşlukları siler
        System.out.println(isim.charAt(0));  // isim in 0. indexindeki harfi verir   // T
        altIsım = isim.substring(3);  // isim in 3. hafrinden başlar ve sonuna kadar alır
        System.out.println(altIsım);   // KIYE
        altIsım = isim.substring(0,4);  // isim in 0. index dahil 4. index hariç harfleri alır  // TURK
        System.out.println(altIsım);
        int nerede = isim.indexOf("TURK");
        System.out.println(nerede);  // 0

    }
}

/*
ÇIKTI :

İsim giriniz :
TURKIYE
İsimdeki harf sayısı :
7
turkıye
    JAVA
JAVA
T
KIYE
TURK
0

 */