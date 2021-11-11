package donguler_08;

public class IcIceDongu1 {

    public static void main(String[] args) {

        /*
         * Dıştaki döngü N kadar tekrar ediyorsa, içteki döngüde kendi başına M kadar tekrar ediyorsa,
         bu döngüler iç içe yazıldığında içteki döngü N*M kadar tekrar eder.
         */
        for(int i=0; i<3; i++){
            for(int j=1; j<3; j++){
                System.out.println("İç döngü çalıştı. ");
            }
            System.out.println("Dış döngü çalıştı. ");
        }
    }

}
/*
Çıktı :

İç döngü çalıştı.
İç döngü çalıştı.
Dış döngü çalıştı.
İç döngü çalıştı.
İç döngü çalıştı.
Dış döngü çalıştı.
İç döngü çalıştı.
İç döngü çalıştı.
Dış döngü çalıştı.
 */
