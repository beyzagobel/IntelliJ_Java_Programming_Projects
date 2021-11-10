package diziler09.tekboyutludiziler;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        // Kullanıcı tarafından girilen 5 sayıyı dizilere atarak bunların toplamını bize veren program
        // Dizi kullanmamızdaki amaç, girilen her bir sayıyı bellekte tutmaktır.Böylece girilen herhangi bir sayıya index ile erişebilir ve işlem yapabiliriz.

        Scanner scanner=new Scanner(System.in);

        int dizi[]=new int[5];
        int toplam=0,i;

        for(i=0;i<5;i++){
            System.out.print((i+1)+". sayıyı giriniz : ");
            dizi[i]=scanner.nextInt();
            toplam=toplam+dizi[i];
        }
        System.out.println("Girdiğiniz 5 tane sayının toplamı : "+toplam);
        System.out.println("Girdiğiniz sayıların 3. elemanı "+dizi[2]);
    }

    /*
    Çıktı :

1. sayıyı giriniz : 4
2. sayıyı giriniz : 5
3. sayıyı giriniz : 6
4. sayıyı giriniz : 7
5. sayıyı giriniz : 8
Girdiğiniz 5 tane sayının toplamı : 30
Girdiğiniz sayıların 3. elemanı 6

     */
}
