package kalıtım.overloading;

public class Overloading2 {

    static void puanHesapla(String isim,int puan){
        System.out.println(isim + " adlı yarışmacının " + puan + " puanı vardır.");
    }

    static void puanHesapla(int puan){
        System.out.println("İsimsiz yarışmacının puanı " + puan );
    }

    static void puanHesapla(String isim){
        System.out.println(isim + " isimli yarışmacının puanı bulunamadı. ");
    }
    public static void main(String[] args) {
        puanHesapla("Kaya");
        puanHesapla(75);
        puanHesapla("Kaya",100);
    }
}
/*
Çıktı :

Kaya isimli yarışmacının puanı bulunamadı.
İsimsiz yarışmacının puanı 75
Kaya adlı yarışmacının 100 puanı vardır.

 */