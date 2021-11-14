package sınıflar_ve_nesneler10;

public class Ornek3 {
    private String adSoyad;
    private int yas;

    public Ornek3(String adSoyad,int yas){
        this.adSoyad = adSoyad;
        this.yas = yas;
    }

    public static void main(String[] args) {
        Ornek3 ornek3 = new Ornek3("beyza gobel",23);
        System.out.println("Ad-Soyad : "+ornek3.adSoyad);
        System.out.println("Yas : " + ornek3.yas);
    }
}
