package kalıtım.overriding_static;

public class AtaSinif {

    public AtaSinif(){

        System.out.println("Üst sınıfın default kurucu metodu");
    }

    public AtaSinif(int i){

        System.out.println("Üst sınıfın parametreli kurucu metodu");
    }

    public static void yazdir(){

        System.out.println("Ata sınıf statis yazdır metodu");
    }
}
