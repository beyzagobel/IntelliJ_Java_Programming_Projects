package diziler.cokboyutludiziler;

import java.util.Scanner;

public class MatrisYazdirma {

    public static void main(String[] args) {
        // boyutu ve parametresi kullanıcıdan alınan  tamsayı matrisini ekrana program

        Scanner scanner = new Scanner(System.in);
        System.out.println("Oluşturulacak matrisin satır boyutunu giriniz :");
        int satir = scanner.nextInt();
        System.out.println("Oluşturulacak matrisin sütun boyutunu giriniz :");
        int sutun = scanner.nextInt();
        int [][] matris = new int[satir][sutun];

        for(int i = 0 ; i < satir ; i ++){
            for(int  j = 0 ; j < sutun ; j ++ ){
                System.out.println((j+1)+". satır "+(i+1)+" sütun değerini giriniz : ");
                matris[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0 ; i < satir ; i ++){
            for(int  j = 0 ; j < sutun ; j ++ ){
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }


    }
}
