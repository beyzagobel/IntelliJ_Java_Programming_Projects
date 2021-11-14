package sınıflar_ve_nesneler10;

public class Ornek6 {

    // private değişkenlere sadece tanımlı olduğu sınıf içinden erişim sağlanır
    private String ad;
    private int yas;

    public Ornek6(){
        ad = "Beyza";
        yas = 5;
    }

    public static void main(String[] args) {

        Ornek6 nesne = new Ornek6();

        System.out.println(nesne.ad);
        System.out.println(nesne.yas);

    }
}
