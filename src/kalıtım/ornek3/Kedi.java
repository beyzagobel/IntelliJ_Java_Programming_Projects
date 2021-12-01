package kalıtım.ornek3;

public class Kedi extends Hayvan{


    public Kedi(){
        System.out.println("İsimsiz kedi nesnesi oluşturuldu.");
    }

    public static void main(String[] args) {
        Kedi kedi = new Kedi(); // derleyici ilk olarak varsa miras alınan sınıfın yapıcı metodunu çağırır.
    }
}
/*
ÇIKTI :

Hayvan nesnesi oluşturuldu.
İsimsiz kedi nesnesi oluşturuldu.

 */