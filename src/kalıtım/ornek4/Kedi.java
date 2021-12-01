package kalıtım.ornek4;

public class Kedi extends Hayvan{

    private String isim ;

    public Kedi(String isim){
        this.isim = isim ;
        System.out.println(isim + " isimli kedi nesnesi oluşturuldu.");
    }

    public static void main(String[] args) {

        Kedi kedi = new Kedi("Tekir");
        System.out.println(kedi.yas);  // hayvan sınıfının değişkeni olan yas ddeğişkeni kedi nesnesi üzerinden erişilmiş
    }
}

/*
ÇIKTI :

Hayvan nesnesi oluşturuldu
Tekir isimli kedi nesnesi oluşturuldu.

 */