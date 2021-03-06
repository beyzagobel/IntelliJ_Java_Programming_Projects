package java_programlamaya_giris_01;

public class JavadaVeriTipleri {

    public static void main(String[] args) {

        /*
        Javada Veri Tipleri - 3 tanedir:
         * İlkel (Primitive) Veri Tipleri : byte, short, int, long, float, double, char, boolean - 8 tane
         * Referans Veri Tipleri : Referans tiplerde, değişkenlerin adresleri tutulur. "new" anahtar sözcüğü ile oluşturulur.
           Array(dizi) , Interface , Class(String) - 3 tane
         * Null Veri Tipi : (Boş Değer) bir değişkenin herhangi bir yeri işaret etmemesi veya hiçbir değer tutmamasıdır.
          “0” ile null aynı değildir ve farklı şekilde davranırlar.

          NOT : GLOBAL VE STATİC DEĞİŞKENLER VARSAYILAN DEĞER ALIRLAR.
                YEREL DEĞİŞKENLER İSE KULLANILMADAN ÖNCE MUTLAKA DEĞER ATANMALIDIR. AKSİ TAKTİRDE PROGRAM DERLENMEZ.
         */

        // Primitiveler

        byte myByte=126;
        short myShort=327;
        int myInt=1058;
        long myLong=12042;
        float myFloat= 42.8f;
        double myDouble=8.58;
        char myChar='A';
        boolean myBoolean=true;

        // Referans Veri Tipleri (String ile sınırlı):

        String nesne1="Merhaba !";

        JavadaVeriTipleri nesne2= new JavadaVeriTipleri();   // sınftan nesne türetme

        int [] dizi = new int[5];    // dizi tanımlama

        // Null Veri Tipi

        String ad= null;

        if(ad==null){
            System.out.println("ad değişkeninin veri tipi null 'dır.");
        }


    }

}
