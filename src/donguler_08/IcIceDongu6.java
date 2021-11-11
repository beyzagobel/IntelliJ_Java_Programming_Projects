package donguler_08;

public class IcIceDongu6 {
    public static void main(String[] args) {

        /*
        Ters ucgen çıktısı veren program yazınız.
         */

        int i , j , k ;

        for(i = 5 ; 0 < i ; i-- ){

            for(j = i ; j < 5 ; j ++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.

                System.out.print(" ");//Boşluğumuzu belirtiyoruz.

            }
            for (k=1; k<=i; k++) {//Yıldız sembolümüzün yazılmasını sağlar.

                System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
                System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.

            }
            System.out.println();
        }
    }
}
