import java.util.Random;
import java.util.Scanner;

public class denem2 {
    public static void main(String[] args) {
        boolean sonuc=tahminEt(3);

    }
    public static boolean tahminEt(int ustSinir){
        Random random=new Random(3);
        int rastgeleSayi=random.nextInt();
        Scanner scanner=new Scanner(System.in);
        System.out.println("0 ile "+ustSinir+" arasında ("+ustSinir+") hariç bir tamsayı giriniz: ");
        return  true;
    }
}
