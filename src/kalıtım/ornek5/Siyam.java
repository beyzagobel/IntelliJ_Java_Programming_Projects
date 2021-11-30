package kalıtım.ornek5;

public class Siyam extends Kedi{

    public Siyam(int param){  // 1
        super(param+1);    // 2
        System.out.println("Siyam yapıcısı , param : " + param);
    }
}
