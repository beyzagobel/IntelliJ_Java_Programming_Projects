package string_metotlari_05;

import java.util.Scanner;

public class StringIsimleri {
    public static void main(String[] args) {
        String isim, baslik , altIsim;
        int nerede;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz : ");
        isim = scanner.nextLine();
        System.out.println("Bu cümlede boşluklar dahil ");
        System.out.println(isim.length() + " karakter vardır. ");
        System.out.println("Cümlenin büyük harfle yazılmış hali ...");
        System.out.println(isim.toUpperCase());
        baslik = "   MERHABA JAVA   ";
        System.out.println("Başlık :" + baslik);
        System.out.print("Başlığın trim metodundan sonraki hali : ");
        System.out.println(baslik.trim());
        altIsim = isim.substring(6);
        System.out.println("Alt başlık : " + altIsim);
        nerede = isim.lastIndexOf("a");
        System.out.print("a' nın bulunduğu son konum : ");
        System.out.println(nerede);
    }
}

/*
Çıktı :

Bir cümle giriniz :
merhaba java
Bu cümlede boşluklar dahil
12 karakter vardır.
Cümlenin büyük harfle yazılmış hali ...
MERHABA JAVA
Başlık :   MERHABA JAVA
Başlığın trim metodundan sonraki hali : MERHABA JAVA
Alt başlık : a java
a' nın bulunduğu son konum : 11

  */
