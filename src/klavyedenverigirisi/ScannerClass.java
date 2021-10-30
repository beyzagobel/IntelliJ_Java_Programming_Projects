package klavyedenverigirisi;

import java.util.Scanner;    // java.util paketi altındaki Scanner sınıfına erişim demektir

public class ScannerClass {
    public static void main(String[] args) {
        /* java.util paketialtındaki Scanner sınıfı kullanılır bu yüzden de önce paketi inport etmemmiz gerekir
        import java.util.Scanner
        Scanner sınıfına ait çeşitli tipte veri girişi yapmamızı sağlayan metodlar vardır.
        nextLine()  - String
        nextInt()
        nextDouble()
        nestFloat()
        nextByte()
        nextLong
        nextBoolean()
         */

        Scanner scanner=new Scanner(System.in);   // 1. Scanner nesnesi oluşturulur
        System.out.println("AD : ");   // 2. kullanıcıdan veri girişi için soru sorulur
        String ad=scanner.nextLine();   // 3. kullanıcı hangi tipte vergi girmesini istiyorsak o tipte yazılır
        System.out.println("Girdiğiniz ad : "+ad);   // 4. kullanıcının girdiği String ifadeyi döndürdük

        System.out.println("Yaşınız : ");
        int yas1=scanner.nextInt();
        System.out.println("Girdiğiniz yas : "+yas1);




    }
}
