package kalıtım.overriding_static;

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


}

