package java_proje_ornekleri;

import java.util.Scanner;

public class BankaHesabi {

    private  double hesapBakiyesi ;

    public void setHesapBakiyesi(double hesapBakiyesi){
        this.hesapBakiyesi = hesapBakiyesi ;
    }
    public double getHesapBakiyesi(){
        return hesapBakiyesi ;
    }
    public double paraCek(double cekilenMiktar){

        cekilenMiktar = hesapBakiyesi - cekilenMiktar ;
        if(cekilenMiktar< 0.0){
            System.out.println("Yetersiz bakiye ! ");
        }
        else
            hesapBakiyesi = cekilenMiktar ;

        return  hesapBakiyesi ;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankaHesabi hesap = new BankaHesabi();

        double hesapBakiyesi, cekilecekTutar ;

        System.out.println("Hesabınızdaki para : ");
        hesapBakiyesi = scanner.nextDouble();

        hesap.setHesapBakiyesi(hesapBakiyesi);

        System.out.println("Cekilecek para : ");
        cekilecekTutar = scanner.nextDouble();

        hesap.paraCek(cekilecekTutar);

        System.out.println("Yeni bakiye : " + hesap.getHesapBakiyesi());

    }
}
