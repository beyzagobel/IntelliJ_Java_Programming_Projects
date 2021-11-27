package java_proje_ornekleri;

import java.util.Scanner;

public class Palindram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir yazi giriniz : ");
        String yazi = scanner.nextLine();
        String rev = "";

        for(int i = yazi.length()-1 ; i >= 0 ; i --){

            rev = rev + yazi.charAt(i);

        }
        if(yazi.equals(rev)){
            System.out.println(yazi + " polindram");
        }
        else{
            System.out.println("değil");
            System.out.println("Yazının tersi : " + rev);
        }
    }
}
