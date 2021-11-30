package kalıtım.ornek6;

public class Personal {

    private String isim ;
    private String soyisim ;


    public Personal(String isim, String soyisim){
        this.isim = isim ;
        this.soyisim = soyisim ;
        System.out.println("SuperClass yapıcı metodu");
    }
    public void setIsim(){
        this.isim = isim ;
    }
    public String getIsim(){
        return  isim;
    }
    public void setSoyisim(String isim){
        this.soyisim =  soyisim;
    }
    public String getSoyisim(){
        return soyisim;
    }
}
