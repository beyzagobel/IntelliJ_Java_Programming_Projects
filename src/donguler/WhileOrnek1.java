package donguler;

import java.util.Scanner;

public class WhileOrnek1 {
    public static void main(String[] args) {
        // kullanıcıdan girillen sayıya göre ekrana sayıları sıralama
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi=scanner.nextInt();
        int i=1;
        while(i<=sayi){
            System.out.println(i+". sayı : "+i);
            i++;
        }
    }
}
