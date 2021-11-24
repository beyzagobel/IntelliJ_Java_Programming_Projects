package sınıflar_ve_nesneler10;

public class Ornek2 {

    String adSoyad;
    int yas;

    public  Ornek2(){
        System.out.println("selam");
    }
    public Ornek2(String adSoyad,int yas){
        this();
        this.adSoyad = adSoyad;
        this.yas = yas;
    }
    public static void main(String[] args) {
        Ornek2 ornek2 = new Ornek2("beyza gobel",23);
        System.out.println(ornek2.adSoyad);
        System.out.println(ornek2.yas);
    }
}
