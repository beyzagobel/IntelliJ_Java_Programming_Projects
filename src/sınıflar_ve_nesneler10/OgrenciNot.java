package sınıflar_ve_nesneler10;

public class OgrenciNot {
    private int odevNotu;
    private int vizeNotu;
    private int finalNotu;
    private String adSoyad;
    private double genelOrtalama;

    public String getAdSoyad(){
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad){
        this.adSoyad=adSoyad;
    }
    public int getOdevNotu(){
        return odevNotu;
    }
    public void setOdevNotu(int odevNotu){
        this.odevNotu=odevNotu;
        this.genelOrtalama = Double.valueOf(odevNotu);
        System.out.println("Genel Ortalama : " + this.genelOrtalama);
    }
    public int getVizeNotu(){
        return vizeNotu;
    }
    public void setVizeNotu(int vizeNotu){
        this.vizeNotu=vizeNotu;
        this.genelOrtalama = (this.odevNotu + this.vizeNotu) / 2.0d;
        System.out.println("Genel Ortalama : " + this.genelOrtalama);
    }
    public int getFinalNotu(){
        return finalNotu;
    }
    public void setFinalNotu(int finalNotu){
        this.finalNotu=finalNotu;
        this.genelOrtalama =( this.odevNotu + this.vizeNotu + this.finalNotu) / 3.0d;
        System.out.println("Genel Ortalama : " + this.genelOrtalama);
    }
    public double getGenelOrtalama(){
        return genelOrtalama;
    }
    public static void main(String[] args) {
        /*
         * Ödev, vize ve final notuna göre bir öğrencinin notunun hesaplandığını kabul edelim.
         * Sisteme önce ödev, sonra vize ve en son final notunun girildiğini varsayalım.
         * Notlar elle tamsayı olarak girilecektir. Klavyeden girişe ihtiyaç yoktur.
         * OgrenciNot isimli bir sınıf geliştirilecek her notun ve genel ortalamasının saklanmasını sağlayın.
         * Oğrenciler isim ve soyisimsiz oluşturulamaz olsun.
         * Her notun girişinden genel ortalama düzenlenip, konsola yazılsın.
         * ilgili sınıfı kodlayın.
         */

        OgrenciNot not = new OgrenciNot();
        not.setOdevNotu(45);
        not.setVizeNotu(55);
        not.setFinalNotu(60);





    }
}
