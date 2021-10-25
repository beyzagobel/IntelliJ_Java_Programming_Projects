import java.util.Scanner;

public class Deneme4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str;
        for(int i=0;i<3;i++){
            do {
                System.out.println("Türkiye'nin başklenti neresidir? ");
                str=scanner.nextLine();

            }while(str.equalsIgnoreCase("ankatra"));


        }


    }
}
