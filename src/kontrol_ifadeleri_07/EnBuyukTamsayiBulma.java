package kontrol_ifadeleri_07;

import java.util.Scanner;

public class EnBuyukTamsayiBulma {
    public static void main(String[] args) {
        // Kullanıcıdan girilen 3 adet tamsayının en büyüğünü yazdıran program

        Scanner scanner=new Scanner(System.in);

        System.out.println("1.sayiyi giriniz :");
        Integer sayi1=scanner.nextInt();
        System.out.println("2.sayiyi giriniz :");
        Integer sayi2=scanner.nextInt();
        System.out.println("3.sayiyi giriniz :");
        Integer sayi3=scanner.nextInt();

        Integer max;

        if(sayi1>=sayi2){
            if(sayi1>=sayi3){
                max=sayi1;
            }else{
                max=sayi3;
            }
        }else{   // sayi1<sayi2
            if(sayi2>=sayi3){
                max=sayi2;
            }else{
                max=sayi3;
            }
        }
        System.out.println("En buyuk sayi :"+max);
    }
}
