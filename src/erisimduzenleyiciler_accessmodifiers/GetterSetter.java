package erisimduzenleyiciler_accessmodifiers;

public class GetterSetter {

    // Private elemanlara başka sınıftan erişemeyeceğimizi söylemiştik.
    // Java da private elemanları okuyabilmek için getter, yazabilmek için setter metodları kullanılır.

    private String ad;
    private String soyAd;

    public String getAd(){
        return ad;
    }

    public void setAd(String ad){
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public static void main(String[] args) {
        GetterSetter n1 = new GetterSetter();

        n1.setAd("Fatma");
        System.out.println(n1.getAd());

        n1.setSoyAd("Demir");
        System.out.println(n1.getSoyAd());
    }
}

