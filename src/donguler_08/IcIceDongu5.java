package donguler_08;

public class IcIceDongu5 {
    public static void main(String[] args) {
        /*
         Yıldızlardan uçgen yapan program
         */

        int i , j , k ;

        for(i = 1 ; i <= 5 ; i ++){  // döngünün ne kadar döneceğini belirtir.

            for(j = i ; j <= 5 ; j ++){  // üçgeni yaparken ekran çıktısının sol tarafındaki boşluğu belirtir

                System.out.print(" ");
            }
            for(k = 1 ; k <= i ; k ++){   // yıldız sembolunun yazılmasını sağlar

                System.out.print("*");
                System.out.print(" ");

            }

            System.out.println();  // döngüden sonra 1 sonraki satıra geçmemizi sağlar

        }
    }
}
