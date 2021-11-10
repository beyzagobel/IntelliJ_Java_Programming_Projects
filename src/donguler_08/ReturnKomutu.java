package donguler_08;

import java.util.Scanner;

public class ReturnKomutu {

    public static void main(String[] args) {
        // Metodun yürütülmesini durdurup, geri dönüş değerini döndürür.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tamsayi giriniz : ");
        Integer giris = scanner.nextInt();

        System.out.println("Girilen sayinin mutlak değeri : " + mutlakDeger(giris));

    }

    public static Integer mutlakDeger(Integer sayi){
        if(sayi<0)
            return sayi * -1 ;
        else
            return sayi ;  
    }
}
