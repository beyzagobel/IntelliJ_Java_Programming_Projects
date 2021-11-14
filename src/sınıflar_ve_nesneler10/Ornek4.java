package sınıflar_ve_nesneler10;

public class Ornek4 {

    // Encapsulation kurallarına göre set ve get metodunu kullanılmıştır.
    private String adSoyad;
    private int yas;

    public String getAdSoyad(){
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad){
        this.adSoyad = adSoyad;
    }
    public int getYas(){
        return yas;
    }
    public void setYas(int yas){
        this.yas = yas;
    }

    public static void main(String[] args) {
        Ornek4 ornek4 = new Ornek4();
        ornek4.setAdSoyad("beyza gobel");
        ornek4.setYas(23);
        System.out.println("Ad-Soyad : " + ornek4.getAdSoyad());
        System.out.println("Yas : " + ornek4.getYas());


    }

}
