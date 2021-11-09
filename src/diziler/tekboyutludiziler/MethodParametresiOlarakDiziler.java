package diziler.tekboyutludiziler;

import java.util.Scanner;

public class MethodParametresiOlarakDiziler {
    public static void main(String[] args) {

        // Bir fonksiyonada parametre değişkeni olarak dizi tanımlayabiliriz
        // Kullanıcı tarafından dizinin kaç elemanlı olduğu ve elemanları belirlenir ve bu elemanları bir toplama fonksiyonun göndererek toplam bulalım.

        Scanner scanner= new Scanner(System.in);
        System.out.print("Kaç elemanlı bir dizi tanımlamak istersiniz :");
        int diziElemanSayisi=scanner.nextInt();

        int dizi[]=new int[diziElemanSayisi];
        int toplam=toplamFonksiyonu(dizi,diziElemanSayisi);
        System.out.println("Tanımladığınız "+diziElemanSayisi+" elemanlı dizinin toplamı :"+toplam);


    }

    // Toplama işlemini yapan fonksiyon

    public static int toplamFonksiyonu(int parametreDizi[],int elemanSayisi){
        Scanner scanner=new Scanner(System.in);
        int toplam=0;
        int i;
        for(i=0;i<elemanSayisi;i++){
            System.out.print((i+1)+". sayıyı giriniz :");
            parametreDizi[i]=scanner.nextInt();
            toplam=parametreDizi[i]+toplam;
        }
        return toplam;

    }
}
