package java_programlamaya_giris_01;

public class DegiskenTurleri {

    String ad;     // GLOBAL DEĞİŞKEN
    int yas;       // GLOABAL DEĞİŞKEN

    public static void main(String[] args) {

        /*
         * Değişken Türleri 2 'ye ayrılır :
         * 1- Yerel Değişkenler :
         * Metodların parametresi veya gövdesinde tanımlı olan,
         * Metod yürütümü bittiğinde yaşam döngüsü sona eren,
         * Sadece metod içinde erişim sağlanabilen
         * değişkenlerdir.

         * 2- Global Değişkenler :
         * Sınıf seviyesinde tanımlanan,
         * Sınıftan tanımlanan nesne var olduğu sürece yaşam döngüsü devam eden değişkenlerdir.
         * Sınıfın içinden her yerden erişim sağlanabilir.

         */


        int a;          // YEREL DEĞİŞKEN
        char c='s';     // YEREL DEĞİŞKEN



        DegiskenTurleri nesneolustu = new DegiskenTurleri();
        String ad1 = nesneolustu.ad;   // bu şekilde global değişkene nesne üzerinden erişilebilir.

    }
    public static int topla(int a,int b){    // a ve b değişkeni YEREL DEĞİŞKEN
        int topla=a+b;      // topla değişkeni YEREL DEĞİŞKEN
        return topla;
    }
}
