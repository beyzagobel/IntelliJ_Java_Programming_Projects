package donguler_08;

public class ForDongusu {
    public static void main(String[] args) {
        /*

        for(ilk değer atama; döngü devam koşulu; iterasyon gğncellemesi){
             KOMUTLAR;
        }

         */

        // 1.döngü örneği
        for(int i=0;i<5;i++){    // 0'dan başla 5 e kadar ama 5 dahil değil
            System.out.println(i);
        }

        // 2.döngü örneği
        int k=0;
        for(;k<5;){
            System.out.println(k); // 0 1 3 4
            k++;   // iterasyon güncellemesi burada yapılmış
        }

        // 3.döngü örneği
        int j=0;
        for(;j<5;){    // iterasyon güncellemesi olmadığı için sonsuz kere 0 basar.
            System.out.println(j);
        }

        //4.döngü örneği
        int l=0;
        for(;;l++){    //  burada l değişkenine bir döngü devam koşulu belirtilmediği için sonsuz dögüye girer
            System.out.println(l);   // 1 2 3 4 ...
        }


    }


}
