package kontrol_ifadeleri_07;

import java.util.Scanner;

public class DoWhileOrnek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String giris = null;
        do  {
            System.out.println("Girmek istediğiniz mesaj : ");
            giris = scanner.nextLine();

        }while(!giris.equalsIgnoreCase("Son"));
    }
}
