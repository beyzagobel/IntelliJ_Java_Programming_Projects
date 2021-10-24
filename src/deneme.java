import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Kullanicinin adi : ");
        String ad= scanner.nextLine();
        System.out.println("Sifreniz :" );
        String sifre= scanner.nextLine();

        if(ad.equals("admin")) {


            if (sifre.equals("123")) {    // kullanıcıdan girilern her değer string olduğu için  tırnak işareti konulur
                System.out.println("Basarili giris");
            }
            else {
                System.out.println("Basarisiz giris");
            }
        }
        else{
            System.out.println("Kullanici yanlis. ");

        }

    }
}
