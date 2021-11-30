package interface1;

public class DortIslem implements IDortIslem {


    public double topla(double a, double b) {
        return a + b ;
    }
    public double cikar(double a, double b) {
        return a - b ;
    }
    public double carp(double a, double b) {
        return a * b ;
    }
    public double bol(double a, double b) {
        return a / b ;
    }

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();

        System.out.println(dortIslem.PI);   // nesne üzerinden erişim
        System.out.println(IDortIslem.PI);   // interface üzerinden erişim
        System.out.println(PI);    //  direk erişim
        System.out.println(DortIslem.PI);  // interface üzerinden erişim

        double toplam = dortIslem.topla(4.45,5.347);  // static olmayan ve abstract olan topla metoduna erişmek için sadece nesne üzerinden erişim sağlanır.
        System.out.println(toplam);

        //  IDortIslem.topla(1.2,2.3);  yapılamaz
        //  DortIslem.tople(1.2,2.3) ;  yapılamaz
        // topla (1.2,2.3) ;   yapılamaz



    }
}
