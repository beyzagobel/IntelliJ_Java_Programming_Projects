package metodlar;

import java.util.Scanner;

public class DegiskenSayidaParametreAlanMetodlar  {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("toplanacak sayıları adetini giriniz : ");
        String sayi=scanner.nextLine();
        System.out.println(topla(Integer.parseInt(sayi)));
    }
    public static int topla(int...values){
        Scanner scanner=new Scanner(System.in);
        Integer toplam=0;
        Integer sayi=0;
        for(int value: values){
            System.out.println(value+". sayi : ");
            sayi=scanner.nextInt();
            toplam+=sayi;
        }
return toplam;
    }
}
