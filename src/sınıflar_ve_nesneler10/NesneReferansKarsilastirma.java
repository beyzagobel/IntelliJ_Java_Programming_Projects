package sınıflar_ve_nesneler10;

public class NesneReferansKarsilastirma {

    String isim ;
    int yas ;

    NesneReferansKarsilastirma(String isim, int yas){
        this.isim = isim;
        this.yas = yas ;

    }

    public static void main(String[] args) {
        /*
         * Nesneler için değişkenler, nesnelerin referans ettiği bellek adreslerini tutarlar.
         *  == operatörü, nesnelere uyulandığında  referans ettikleri bellek alanlarını karşılaştırır.
         * = operatörü ise nesnelerin referans ettiği bellek adreslerinin atamasını yapar.
         * Primitive'ler için değer karşılaştırması yaparlar.
         */

        NesneReferansKarsilastirma nesne1 = new NesneReferansKarsilastirma("Ali",23);
        NesneReferansKarsilastirma nesne2 = new NesneReferansKarsilastirma("Ali",23);

        System.out.println(nesne1 == nesne2);  //  false

        nesne2 = nesne1 ;

        System.out.println(nesne1 == nesne2);  // true
    }
}
