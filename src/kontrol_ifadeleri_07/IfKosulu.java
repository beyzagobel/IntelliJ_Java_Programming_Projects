package kontrol_ifadeleri_07;

import java.util.Scanner;

public class IfKosulu {
    public static void main(String[] args) {
        /*
         * if ve if else kontrolleri parametre olarak boolean değerler alır
         * blok yapısı komutlar tek satırda işletilecekse {} kullanılmak zorunlu değildir
       */

        // örnek : x değişkeninin 6 ile 9 arasında olup olmadığını kontrol eden program

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int x=scanner.nextInt();

        if(x>6){
            System.out.println("x,6'dan büyüktür. ");
            if(x<9){
                System.out.println("x,9'dan küçüktür. ");

            }else{
                System.out.println("x, 9'dan büyük veya eşittir . ");
            }
        }else{
            System.out.println("x,6'dan küçüktür. ");
        }
    }
}
