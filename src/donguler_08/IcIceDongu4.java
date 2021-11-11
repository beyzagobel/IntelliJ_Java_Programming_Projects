package donguler_08;

public class IcIceDongu4 {
    public static void main(String[] args) {
        /*

         * * * *
         * * *
         * *
         *
         Çıktısını ekrana yazdıran program yazınız.

         */

        int yildiz_sayisi = 4 ;

        for(int i = 0 ; i < 4 ; i ++){  // 4 satırdan oluşacak

            for(int  j =0 ; j < yildiz_sayisi; j ++){

                System.out.print("*");
                System.out.print(" ");

            }
            System.out.println();  // 1 satır atla
            yildiz_sayisi --;   // her satırda yıldız sayısını 1 azalt
        }
    }
}
