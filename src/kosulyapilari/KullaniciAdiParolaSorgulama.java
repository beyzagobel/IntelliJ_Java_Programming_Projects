package kosulyapilari;

import java.util.Scanner;

public class KullaniciAdiParolaSorgulama {
    public static void main(String[] args) {
        // kullanıcı adı "admin ve şifresi "123" olsun

        Scanner scanner=new Scanner(System.in);
        System.out.println("kullanıcı adınız : ");
        String ad=scanner.nextLine();
        System.out.println("Şifreniz : ");
        String sifre=scanner.nextLine();

        if(ad.equals("admin")&&sifre.equals("123")){
            System.out.println("başarılı giriş");
        }
        else{
            System.out.println("hatalı giriş");
        }
    }
}
