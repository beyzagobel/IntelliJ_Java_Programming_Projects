package sınıflar_ve_nesneler10;

public class Ornek5 {
    private String adSoyad;
    private int yas;

    public Ornek5(String adSoyad,int yas){
        this.adSoyad = adSoyad;
        this.yas = yas;
    }
    public String getAdSoyad(){
        return adSoyad;
    }

    public int getYas(){
        return yas;
    }

    /*
     * System.out.print/println metotlarına bir nesneyi parametre vermek, o nesnenin toString() metodunu çağırmak anlamına gelir.
     * Ogrenci sınıfındaki toString() metodu yeniden tanımlanır (overriding) .
     */

    public String toString(){
        return this.getAdSoyad() + " " + this.getYas();
    }
    public static void main(String[] args) {
        Ornek5 ornek5 = new Ornek5("beyza gobel", 23);
        System.out.println(ornek5);

    }
}
