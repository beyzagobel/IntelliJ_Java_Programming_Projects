package kontrol_ifadeleri_07;

import java.util.Scanner;

public class KullaniciAdiParolaSorgulama2 {

    public static void main(String[] args) {
        // aynı örneğin hatalı giriş nedenini gösterecek şekilde yazalım

        Scanner scanner=new Scanner(System.in);
        System.out.println("Kullanici adiniz : ");
        String ad=scanner.nextLine();
        System.out.println("Şifreniz :");
        String sifre=scanner.nextLine();
        if(ad.equals("admin")){
            if(sifre.equals("123")){
                System.out.println("Başarılı giriş");
            }else{
                System.out.println("Yanlış şifre!");
            }
        }else{
            if(sifre.equals("123")){
                System.out.println("Yanlış kullanici adi girişi!");
            }else{
                System.out.println("Yanlış kullanıcı adı ve şifre! ");
            }
        }
    }
}
