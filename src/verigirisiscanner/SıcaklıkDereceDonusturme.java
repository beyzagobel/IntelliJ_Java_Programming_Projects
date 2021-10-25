package verigirisiscanner;

import java.util.Scanner;

public class SıcaklıkDereceDonusturme {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Sıcaklık değerini giriniz :");
        double giris=scanner.nextDouble();
        double celciusDouble=(giris-32)*5/9;

        int celciusInt=(int)celciusDouble;

        System.out.println("Sıcaklık değeri :"+celciusInt);

    }
}
