package kalıtım.ornek1;

public class Personal {

    private String isim ;
    private String soyisim ;

    public String getIsim(){
        return isim;
    }
    public void setIsim(String isim){
        this.isim = isim ;
    }

    public String getSoyisim(){
        return soyisim;
    }
    public void setSoyisim(String soyisim){
        this.soyisim = soyisim ;
    }

   public Personal(){
       System.out.println("Default Constracter SuperClass");
    }
    public void yazdir (){
        System.out.println("Ben " + isim + " " + soyisim);
    }


}
