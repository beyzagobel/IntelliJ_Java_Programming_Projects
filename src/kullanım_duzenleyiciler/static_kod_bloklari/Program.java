package kullanım_duzenleyiciler.static_kod_bloklari;

public class Program {

    public static void main(String[] args) {
        Yazar[] yazarlar = YazarIslemleri.getYazarlar();

        for(Yazar y : yazarlar){
            System.out.println(y.getBilgi());
        }
    }
}
