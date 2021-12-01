package kalıtım.ornek7;

public class AtaSinif {

    public AtaSinif(){
        System.out.println("Üst sınıfın default kurucu metodu");
    }

    public AtaSinif(int i){
        System.out.println("Üst sınıfın parametreli kurucu metodu");
    }
    private static void yazdir(){
        System.out.println("static ata sınıf metodu");
    }
}
