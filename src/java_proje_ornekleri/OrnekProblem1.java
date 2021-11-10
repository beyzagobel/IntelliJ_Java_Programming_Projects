package java_proje_ornekleri;

import java.util.Scanner;

public class OrnekProblem1 {

    public static void main(String[] args) {
        /*
         * Bir satış elemanının sattığı ürün miktarına göre alacağı günlük ücret aşağıdaki gibi
         * Günlük satış miktarı 50 adetten az ise 15 tl tutarındaki sabit ücrete, satılan ürün başına 1 tl prim eklenerek günlük ücret belirlenir.
         * Günlük satış miktarı 50 adet ya da falza ise 15 tl tutarındaki sabit ücrete,
         * satılan ürün başına ilk 50 adet ürün için 2 tl, 50 adedi aşan kısım için 3 tl prim verilecektir

Bir satıcının günlük satış miktarına satıcının alacağı günlüğk ücreti hesaplayınız.
         */

        int satilan_urun_miktari, gunluk_ucret;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Günlük ürün satış miktarını giriniz :");
        satilan_urun_miktari = scanner.nextInt();

        if(satilan_urun_miktari<50){
            gunluk_ucret = 15 + (satilan_urun_miktari *1) ;
        }
        else{
            gunluk_ucret = 15 + (50 * 2) + (satilan_urun_miktari-50)*3 ;
        }

        System.out.println("Günlük alınan ücret : "+gunluk_ucret+" Tl 'dir. ");
    }
}
