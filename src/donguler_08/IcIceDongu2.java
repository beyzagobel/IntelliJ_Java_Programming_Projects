package donguler_08;

public class IcIceDongu2 {
    public static void main(String[] args) {
        /*
         * * *
         * * *
         * * *
         Çıktısını veren program
         */

        for(int i = 0 ; i < 3 ; i ++){   // 3 satır olacak

            for(int j = 0 ; j < 3 ; j ++){  // her satırda bir yıldız bir boşluk olacak

                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();  // her satırdan sonra bir alt satıra geçer
        }
    }
}
