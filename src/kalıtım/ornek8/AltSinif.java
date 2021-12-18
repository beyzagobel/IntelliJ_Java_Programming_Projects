package kalıtım.ornek8;

public class AltSinif extends UstSinif {

    private int topla(){
        return 3+5;
    }

    public static void main(String[] args) {

        AltSinif nesne = new AltSinif();
        int sayi = nesne.topla();
        System.out.println(sayi);

        UstSinif nesne2 = new UstSinif();
        // nesne2.topla();  hata verir.
        // Nedeni alt sınıfta, ata sınıfın private metodu tekrar tanımlandığı için complier ata sınıfta hiç böyle bir metod yokmuş gibi davranır.

    }
}

/*
ÇIKTI :
8

 */