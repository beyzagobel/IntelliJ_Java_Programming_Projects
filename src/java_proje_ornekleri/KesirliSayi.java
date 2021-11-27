package java_proje_ornekleri;

import java.util.Scanner;

public class KesirliSayi {

    private int pay;
    private int payda ;

    public void setSayi(int pay, int payda){
        this.pay = pay ;
        this.payda = payda ;
    }

    public int getPay(){
        return pay;
    }
    public int getPayda(){
        return payda ;
    }
    public KesirliSayi topla (KesirliSayi sayi){
        KesirliSayi toplam = new KesirliSayi();
        toplam.pay = (sayi.pay * payda) + (pay *sayi.payda) ;
        toplam.payda = toplam.payda * payda ;
        return toplam ;
    }
    public void Yazdir(){
        System.out.println(pay + " / " + payda);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        KesirliSayi kesir1 = new KesirliSayi();
        KesirliSayi kesir2 = new KesirliSayi();
        KesirliSayi kesirToplam;

        int pay1, payda1, pay2,payda2;

        System.out.println("Birinci kesirin  pay ve paydasını giriniz : ");
        pay1 = scanner.nextInt();
        payda1 = scanner.nextInt();
        kesir1.setSayi(pay1,payda1);

        System.out.println("İkinci kesinin pay ve paydasını giriniz :");
        pay2 = scanner.nextInt();
        payda2 = scanner.nextInt();
        kesir2.setSayi(pay2,payda2);

        kesirToplam = kesir1.topla(kesir2);
        kesirToplam.Yazdir();










    }
}
