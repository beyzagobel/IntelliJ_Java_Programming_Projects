package kalıtım.ornek4;

public class Kedi extends Hayvan{

    private String isim ;

    public Kedi(String isim){
        this.isim = isim ;
        System.out.println(isim + " isimli kedi nesnesi oluşturuldu.");
    }

    public static void main(String[] args) {

        Kedi kedi = new Kedi("Tekir");
    }
}

/*
ÇIKTI :

Hayvan nesnesi oluşturuldu
Tekir isimli kedi nesnesi oluşturuldu.

 */