package kalıtım.overriding_static;

public class Program {

    /*
     * Static metodlar override edilemez fakat farklı bir metod olarak kullanılabilirler.
     * Bu durumda ata sınıftaki metod saklanır.
     * Farklı iki metod olarak devam ederler.
     */

    public static void main(String[] args) {

        AltSinif nesne = new AltSinif();   // 1
        AtaSinif nesne2 = new AtaSinif(4);   // 2

        AltSinif.yazdir();

        AtaSinif.yazdir();


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
