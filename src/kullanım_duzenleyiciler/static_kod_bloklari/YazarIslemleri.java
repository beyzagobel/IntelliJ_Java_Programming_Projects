package kullanım_duzenleyiciler.static_kod_bloklari;

public class YazarIslemleri {

    private static Yazar[] yazarlar;  // Yazar sınıfı tipinde static bir dizi tanımlanır

    static {

        yazarlar = new Yazar[3];
        yazarlar[0] = new Yazar("Reşat Nuri", "Güntekin");
        yazarlar[1] = new Yazar("Necip Fazıl", "Kısakürek");
        yazarlar[2] = new Yazar("Halit Ziya", "Usaklıgil");

    }

    public static Yazar[] getYazarlar(){

        return YazarIslemleri.yazarlar;
    }
}
