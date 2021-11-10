package java_proje_ornekleri;

import java.util.Scanner;

public class FonksiyonOrnegi {

    public static void main(String[] args) {
        /*
         * f(x) ve g(x) fonksiyonları,
         * x > 0 ise f(x) = 1 / (1 + In x) ve g(x) = 1 / (x + In x)
         * x <= 0 ise f(x) = 1 / (1 + x^2) ve g(x) = 1 / (1 + x + x^2)
         */
        double f,g,x;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        x=scanner.nextInt();

        if(x > 0){
            f = 1 / (1 + Math.log(x));
            g = 1 / (x + Math.log(x));
        }
        else{
            f = 1 / (1 + x * x);
            g = 1 / (1 + x + x * x);
        }

        System.out.println("f(x) = "+f);
        System.out.println("g(x) = "+g);


    }
}
