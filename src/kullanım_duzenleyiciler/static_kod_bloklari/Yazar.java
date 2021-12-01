package kullanım_duzenleyiciler.static_kod_bloklari;

public class Yazar {

    /*
     * Static değişkenlerin ilk değerlerini kurucu içinde vermeye çalışmak yanlış olabilir.
     * Çünkü static değişkenleri hiç nesne oluşturulmamış olsa bile  kullanılabşlmektedir.
     * Bu bloklar bir kere program başında çalıştırılır.
     * Static kod blokları, Sınıf belleğe yüklendiği anda yürütülür yani ilgilli sınıfın yapıcı metod ve diğer başka metodlarından bile önce çalışır.
     */
    private String ad;
    private String soyad;

    public Yazar(String ad,String soyad){
        this.ad=ad;
        this.soyad=soyad;
    }
    public String getAd(){
        return ad;
    }
    public String getSoyad(){
        return soyad;
    }
    public String getBilgi(){
        return this.ad + " " + this.soyad;
    }

}
