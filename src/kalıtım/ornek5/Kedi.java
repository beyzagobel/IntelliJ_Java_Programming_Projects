package kalıtım.ornek5;

public class Kedi extends Hayvan{

    public Kedi(int param){  // 2
        super(param+1);  // 3
        System.out.println("Kedi yapıcısı , param : " + param);
    }

}
