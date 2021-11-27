package java_proje_ornekleri;

import java.util.Scanner;

public class OgrenciKayit {

    private String ad ;
    private int kisaSinav1;
    private int kisaSinav2;
    private int araSinav ;
    private int finalNot ;
    private double toplamPuan ;
    private char not ;

    public void veriGir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci adını giriniz :");
        ad = scanner.nextLine();

        System.out.println("Kısa sınav 1, Kısa sınav 2 notlarınızı giriniz :");
        kisaSinav1 = scanner.nextInt();
        kisaSinav2 = scanner.nextInt();

        System.out.println("Arasınav ve final notlarınızı giriniz : ");
        araSinav = scanner.nextInt();
        finalNot  = scanner.nextInt() ;
    }

    public void ciktiYaz(){
        System.out.println("İsim : " + ad);
        System.out.println("Toplampuan ve not :" + toplamPuan + " " + not);
    }

    public void setToplam(){
        toplamPuan = 0.25 * (kisaSinav1 + kisaSinav2) / 2.0 + 0.5 * finalNot + 0.25 * araSinav ;
    }

    public void setNot(){

        if(toplamPuan >= 90.0)
            not = 'A';
        else if(toplamPuan >= 80.0)
            not = 'B';
        else if (toplamPuan >= 70.0)
            not = 'C';
        else if(toplamPuan >= 60.0)
            not = 'D';
        else
            not = 'F';
    }

    public static void main(String[] args) {
        OgrenciKayit ogrenci = new OgrenciKayit();
        ogrenci.veriGir();
        ogrenci.setToplam();
        ogrenci.setNot();
        ogrenci.ciktiYaz();
    }
}
