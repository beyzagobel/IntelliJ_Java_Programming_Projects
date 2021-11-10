package kontrol_ifadeleri_07;

import java.util.Scanner;

public class SayılarıSıralama {
    public static void main(String[] args) {
        // kullanıcının girdiği 3 sayının küçükten büyüğe sıralamasını veren program

        Scanner scanner=new Scanner(System.in);

        System.out.println("1.sayiyi giriniz :");
        Integer sayi1=scanner.nextInt();
        System.out.println("2.sayiyi giriniz :");
        Integer sayi2=scanner.nextInt();
        System.out.println("3.sayiyi giriniz :");
        Integer sayi3=scanner.nextInt();

        int max=0,min=0,ortanca=0;

        if(sayi1>=sayi2){
            if(sayi1>=sayi3){
                max=sayi1;
                if(sayi2>=sayi3){
                    ortanca=sayi2;
                    min=sayi3;
                }else{    // sayi2<sayi3
                    ortanca=sayi3;
                    min=sayi2;
                }
            }
        }else{   // sayi2>sayi1
              if(sayi2>=sayi3){
                  max=sayi2;
                  if(sayi1>=sayi3){
                      ortanca=sayi1;
                      min=sayi3;
                  }else{   // sayi3>sayi1
                      ortanca=sayi3;
                      min=sayi1;
                  }
              }
        }
        System.out.println("En küçük değer : "+min);
        System.out.println("Ortanca değer : "+ortanca);
        System.out.println("En büyük değer : "+max);

    }
}
