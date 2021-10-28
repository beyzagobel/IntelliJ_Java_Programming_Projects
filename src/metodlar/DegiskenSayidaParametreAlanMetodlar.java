package metodlar;

import java.util.Scanner;

public class DegiskenSayidaParametreAlanMetodlar  {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("toplanacak sayıları adetini giriniz : ");
        int sayi=scanner.nextInt();
        System.out.println(topla(sayi));
    }
    public static int topla(int...values){
        Scanner scanner=new Scanner(System.in);
        Integer toplam=0;

        for(int value: values){


            toplam+=value;
        }
return toplam;
    }
}
