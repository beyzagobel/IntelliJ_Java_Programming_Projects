package number_number_tip_donusumu;


import java.util.Scanner;

public class JavaLangNumber {
    public static void main(String[] args) {

        /* Burada Java'nın lang paketi içindeki Number sınıfınin üye sınıflarını kullanarak tip dönüşüleri yapacağız.

    6 tanedir.

    byteValue()
    shortValue()
    intValue()
    longValue()
    floatValue()
    doubleValue()

     */

  //      System.out.println(b.compareTo(s.byteValue()));
        double d=0.54;
        int i=(int) d;    // açık tip dönüşümü (daraltma)

        Double d2=new Double(0.323);
        Integer i2=d2.intValue();     // nesne ile atama

        Scanner scanner=new Scanner(System.in);
        Integer sayi=scanner.nextInt();    // Scanner sınıfının üye metodlarını kullanarak dönüşüm

    }







}
