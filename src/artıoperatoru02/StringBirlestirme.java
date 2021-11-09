package artıoperatoru02;

public class StringBirlestirme {
    public static void main(String[] args) {

        // + KARAKTER DİZİLERİNİ BİRLEŞTİRİR

        String ad,soyad;
        ad="Beyza";
        soyad="Gobel";

        String adSoyad1,adSoyad2;
        adSoyad1=ad+soyad;
        adSoyad2=ad+" "+soyad;

        System.out.println(adSoyad1);
        System.out.println(adSoyad2);

        String epostaKullaniciAdi="byzgbll";
        String epostaUzantisi="gmail.com";
        String eposta=epostaKullaniciAdi+"@"+epostaUzantisi;

        System.out.println(eposta);

    }
}
