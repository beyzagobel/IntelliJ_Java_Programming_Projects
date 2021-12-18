package kalıtım.overriding2;

public class Bisiklet extends MotorsuzKaraTasit{

    public Bisiklet(int tekerlekSayisi) {
        super(tekerlekSayisi);
    }

    public String bilgiVer(){
        return super.bilgiVer() + " - Bisiklet " ;
    }
}
