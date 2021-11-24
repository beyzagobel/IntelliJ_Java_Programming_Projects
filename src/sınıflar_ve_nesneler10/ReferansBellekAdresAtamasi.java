package sınıflar_ve_nesneler10;

public class ReferansBellekAdresAtamasi {

    // =  operatörü nesnelerde referans etiiği bellek adresinin atamasını yapar.

    String isim ;

    public ReferansBellekAdresAtamasi(){}
    public ReferansBellekAdresAtamasi(String isim){
        this.isim = isim ;
    }


    public static void main(String[] args) {

        ReferansBellekAdresAtamasi nesne1 = new ReferansBellekAdresAtamasi("ali");
        ReferansBellekAdresAtamasi nesne2 = new ReferansBellekAdresAtamasi("veli");

        System.out.println(nesne1.isim);  // ali
        System.out.println(nesne2.isim);  // veli

        System.out.println(nesne1 == nesne2);  // aynı bellek alanlarını göstermediği için FALSE

        nesne2 = nesne1 ;  // nesne1 in gösterdiği bellek adresini nesne2 de göstersin demektir.

        System.out.println(nesne1.isim);  // ali
        System.out.println(nesne2.isim);  // ali

        nesne1.isim = "ahmet" ;  // nesne1 'in isim değişkeninin değeri değişince nesne1 'in referans ettiği bellek adresine sahip nesne2 'in isim değişkeninin değeride değişir.

        System.out.println(nesne1.isim);   // ahmet
        System.out.println(nesne2.isim);   // ahmet

        System.out.println(nesne1 == nesne2);  // true
    }
}
