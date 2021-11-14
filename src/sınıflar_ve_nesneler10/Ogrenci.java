package sınıflar_ve_nesneler10;

public class Ogrenci {
    private String isim;
    private String soyisim;


    public Ogrenci(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setsoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("ali","veli");
        System.out.println(ogrenci.getIsim() + " " + ogrenci.getIsim());

    }
}