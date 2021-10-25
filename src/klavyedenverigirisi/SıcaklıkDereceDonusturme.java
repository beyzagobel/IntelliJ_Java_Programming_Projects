package klavyedenverigirisi;

import java.util.Scanner;

public class SıcaklıkDereceDonusturme {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Sıcaklık değerini giriniz :");
        double giris1=scanner.nextDouble();
        double celciusDouble1=(giris1-32)*5/9;

        int celciusInt1=(int)celciusDouble1;

        System.out.println("Sıcaklık değeri :"+celciusInt1);

        // aynı işlemi Sarıcı sınıf ve metodunu kullanarak çözelim.

        System.out.println("Sıcaklık değerini giriniz :");
        Double giris2=scanner.nextDouble();
        Double celciusDouble2=(giris2-32)*5/9;

        Integer celciusInt2=celciusDouble2.intValue();   // Number sınıfının metodu, t,p dönüşümü için kullanılmış oldu.
        System.out.println("Sıcaklık değeri :"+celciusInt2);




    }
}
