package kalıtım.ornek6;

public class AkademikPersonal extends Personal {

    private String akademikUnvan ;

    public AkademikPersonal(String isim, String soyisim){
        // super();  // varsayılan yapıcı varsa onu çalıştırır biz yazmayız

        super("ali","veli");  // der isek bizim tanımladığımız yapıcı metoda gider
        System.out.println("SubClass yapıcı metodu");
    }

    public static void main(String[] args) {
        AkademikPersonal akademikPersonal = new AkademikPersonal("beyza","gobel");

    }

}

/*

ÇIKTI :

SuperClass yapıcı metodu
SubClass yapıcı metodu


 */
