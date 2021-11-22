package donguler_08;

import java.util.Scanner;

public class WhileIfOrnek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int kalanHak = 3;
        String cevap ;
        boolean sonuc = false;   // değer atamalıyız çünkü döngü sonunda değişkeni çağırıdık

        while (kalanHak > 0){
            kalanHak -- ;
            System.out.println("Türkiye nin başkenti neresidir ? ");
            cevap = scanner.nextLine();
            if (cevap.equalsIgnoreCase("ankara")) {
                sonuc = true;
                break;
            }
            else{
                System.out.println("Yanlış cevap. "+kalanHak+" hakkınız kaldı. ");

            }

        }
        if(sonuc){
            System.out.println("Tebrikler, doğru cevap .");

        }
        else {
            System.out.println("Hakkınız kalmadı.");

        }
    }
}
