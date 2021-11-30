package kalıtım.ornek7;

public class AltSinif extends UstSinif{

    public AltSinif(){
        System.out.println("Alt sınıfın default kurucu metodu");
    }

    public AltSinif(int i){
        // super();  vardır bu yüzden üst sınıfın parametresiz kurucu metoda gider
        System.out.println("Alt sınıfın parametreli kurucu metodu");
    }

    public static void main(String[] args) {
        AltSinif nesne = new AltSinif();   // 1
        AltSinif nesne2 = new AltSinif(4);   // 2
    }
}

/*

ÇIKTI :

Üst sınıfın default kurucu metodu     // 1
Alt sınıfın default kurucu metodu     // 1
Üst sınıfın default kurucu metodu     // 2
Alt sınıfın parametreli kurucu metodu  // 2


 */
