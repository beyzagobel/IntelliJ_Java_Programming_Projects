import java.util.Scanner;

public class ChatIstemci {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str=null;   // bellekter bir yeri göstermiyor
        do {
            System.out.println("Göndermek istediğiniz mesaj: ");
            str=scanner.nextLine();
// String str=scanner.nextLİne();   olamaz nedeni sadece do kapsamında olur ve while kapsamında kullanıldığı için hata verir. süslü parentezle alakalı
        }while(!str.equalsIgnoreCase("Son"));

    }
}
