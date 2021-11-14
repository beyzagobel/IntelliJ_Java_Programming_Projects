package sınıflar_ve_nesneler10;

public class NesnelerdeReferans {

    /*
     * Nesnelerde  = operatörü , nesnenin referans ettiği bellek adresinin atamasını yapar.
     *  == operatörü ise , nesnelerin referanslar ettiği bellek adreslerini karşılaştırır.
     */

        private  String ad;
        private  String soyAd;
        private int ogrenciNo;
        private int kredi;

    public NesnelerdeReferans(){}

    public NesnelerdeReferans(String ad, String soyAd, int ogrenciNo, int kredi){
            this.ad = ad;
            this.soyAd = soyAd;
            this.ogrenciNo = ogrenciNo;
            this.kredi = kredi;
        }

        public void setAd(String ad) {
            this.ad = ad;
        }
        public String getAd() {
            return  ad;
        }


        public static void main(String[] args) {

            NesnelerdeReferans ogrenci = new NesnelerdeReferans("Ali","Veli",1221,0);

            NesnelerdeReferans nesnelerdeReferans = new NesnelerdeReferans();

            System.out.println(ogrenci == nesnelerdeReferans);  // false

            nesnelerdeReferans = ogrenci ;   // ogrenci nesnesinin referans ettiği bellek adresini artık ogrenci2 nesneside referans eder.

            nesnelerdeReferans.setAd("Hakan");  // iki nesnede aynı yeri gösterdiği için nesnelerde yapılan değişiklik her iki nesneyide etkiler.

            System.out.println(ogrenci.getAd());

            System.out.println(ogrenci == nesnelerdeReferans);   // true
        }
    }


