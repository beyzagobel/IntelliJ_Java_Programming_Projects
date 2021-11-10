package diziler.tekboyutludiziler;

public class Ornek3 {

    public static void main(String[] args) {

        /*
         * Dizinin uzunluğuna length özelliğiyle ulaşılabilir
         * Dizinin bir kopyasını oluştururmak için clone() metodu kullanılır.
         * Dizileri elemanları üzerinde gezinmek için döngüler kullanılır.
         * Dizilere ilk değer ataması yapılacaksa bütün değerler yazılmalıdır.
         */

        int dizi1[] = {4,6,2,5,7,8};    // ilk değer  atama
        int dizi2[] = new int[5];       // dizi tanımlarken dizinin boyutunu tanımlamak zorundayız

        System.out.println(dizi1.length);   // 6
        System.out.println(dizi2.length);   // 5

        System.out.println(dizi2[4]);    // 0

        int dizi3[]= dizi2.clone();
        for(int i=0;i<5;i++){
            System.out.println(dizi3[i]);  // diziye ilk değer ataması yapılmazsa tüm elemnalar null olan default değer alırlar
        }

        int dizi4[]=dizi1.clone();
        for(int i =0; i<6 ; i++){
            System.out.println(dizi4[i]);  // 4 6 2 5 7 8
        }

        // 1. for dpngüsü ile gezinme
        double dizi[]=new double[3];
        for(int i =0; i<3; i++){
            System.out.println(dizi[i]);
        }

        // 2. kısayol for dögüsü ile gezinme
        for(double i:dizi){
            System.out.println(i);
        }

        // 3. while dögüsü ile gezinme
        int  i= 0;
        while (i<dizi.length){
            System.out.println(dizi[i]);
            i++;
        }





    }
}
