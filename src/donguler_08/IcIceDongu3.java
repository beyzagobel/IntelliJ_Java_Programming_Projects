package donguler_08;

public class IcIceDongu3 {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         Çıktısı veren program yazınız.

         */

        int sembol = 1; // bir satırda yazdıracağımız yıldız sayısını artırmak için kullanacağız.

        for (int i = 0; i < 4; i++) {   // 4 satır olacak

            for (int j = 0; j < sembol; j++) {   // her satırda kaç yıldız olacak

                System.out.print("*");
                System.out.print(" ");

            }

            System.out.println();
            sembol ++;
        }
    }
}
