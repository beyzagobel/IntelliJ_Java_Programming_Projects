package kalıtım.ornek7;

public class AltSinif extends AtaSinif {

    public AltSinif(){

        // super();
        System.out.println("Alt sınıfın default kurucu metodu");
    }

    public AltSinif(int i){

        // super();  vardır bu yüzden üst sınıfın parametresiz kurucu metoda gider biz tanımlama yapmaz isek;
        // super(5); der isek üst sınıfın int değer alan kurucu metoduna gider
        System.out.println("Alt sınıfın parametreli kurucu metodu");
    }

     public static void yazdir(){
        System.out.println("alt sınıf static yazdir metodu");
    }

    public static void main(String[] args) {
        AltSinif nesne = new AltSinif();   // 1
        AltSinif nesne2 = new AltSinif(4);   // 2

        yazdir();

        nesne2.yazdir();  // yine alt sınıfın yazdir metdou çalışır.


    }
}

/*

ÇIKTI :

Üst sınıfın default kurucu metodu     // 1
Alt sınıfın default kurucu metodu     // 1
Üst sınıfın default kurucu metodu     // 2
Alt sınıfın parametreli kurucu metodu  // 2
alt sınıf static yazdir metodu


 */
