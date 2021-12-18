package kalıtım.overriding2;

public class MotorsuzKaraTasit extends KaraTasit{

    public MotorsuzKaraTasit(int tekerlekSayisi) {
        super(tekerlekSayisi);
    }

    public String bilgiVer(){
         return super.bilgiVer() + " - MotorsuzKaraTaşıtı ";
    }
}
