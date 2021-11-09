package donguler;

import java.util.Scanner;

public class DoWhileDongusu {

    // while döngüsünden farkı, do bloğununu en az bir kez çalışması garanti edilir.
    // while içindeki koşul ifadesi sağlandığı sürece do bloğu çalıştırılır.

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String giris=null;
        do{
            System.out.println("Göndermek istediğiniz mesaj : ");
            giris=scanner.nextLine();
        }while(!giris.equalsIgnoreCase("Son"));
    }
}
