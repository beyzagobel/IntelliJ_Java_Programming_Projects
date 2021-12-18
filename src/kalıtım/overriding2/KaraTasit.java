package kalıtım.overriding2;

public class KaraTasit extends Tasit{
    private int tekerlekSayisi;

    public KaraTasit (int tekerlekSayisi){
        this.tekerlekSayisi = tekerlekSayisi ;
    }

    public int getTekerlekSayisi() {
        return tekerlekSayisi;
    }

    public String bilgiVer(){
        return super.bilgiVer() + " - KaraTasiti" ;
    }
}
