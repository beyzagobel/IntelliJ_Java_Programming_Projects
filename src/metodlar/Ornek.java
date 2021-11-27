package metodlar;

public class Ornek {

    /*
     * Değişkenlerin orjinal değeri metod içinde değişemezler.
     */

    private int sayi ;

    public Ornek(int sayi){
        this.sayi = sayi ;
    }   // yapıcı metod

    public int SayiDegistir(int sayi){
        sayi++ ;   // yerel değişken olan sayi'nın değeri değişti
        System.out.println(sayi);  // 6
        Metod2();  // aynı sınıftan olduğu için direk çağırım yaılılabilir ya da this anahtar kelimeside kullanılabilir.
        this.Metod2();
        return sayi ;

    }

    public void Metod2(){
        System.out.println("Merhaba");
    }

    public static void main(String[] args) {

        Ornek nesne1 = new Ornek(5);  // nesne1'in sayi değişkeninin değeri = 5

        nesne1.SayiDegistir(nesne1.sayi);

        System.out.println(nesne1.sayi);   // 5 değeri değişmedi

    }
}
