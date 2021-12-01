package kalıtım.ornek1;

public class AkademikPersonal extends Personal {

    private String akademikUnvan ;

    public String getAkademikUnvan (){
        return akademikUnvan ;
    }
    public void setAkademikUnvan(String akademikUnvan){
        this.akademikUnvan = akademikUnvan ;
    }

    public void yazdir(){
        System.out.println("Ben "+ getAkademikUnvan() + " " + getIsim() + " " + getSoyisim());
    }


    public AkademikPersonal() {
        // super();  kapalı olarak üst sınıfın yapıcısını çağırır ve ilk olarak orası okunur
        System.out.println("Default Constracter SubClass");
    }

    public static void main(String[] args) {

        Personal personal = new Personal();  // personal sınıfının yapıcısı çalıştı
        personal.setIsim("Ali");
        personal.setSoyisim("Veli");
        personal.yazdir();


        AkademikPersonal akademikPersonal = new AkademikPersonal();  // kalıtım ile aldığı personal sınıfının yapıcısı çalıştı
        akademikPersonal.setIsim("Ahmet");
        akademikPersonal.setSoyisim("Mehmet");
        akademikPersonal.setAkademikUnvan("Doç. Dr. ");
        akademikPersonal.yazdir();



    }
}

/*
ÇIKTI :

Default Constracter SuperClass
Ben Ali Veli
Default Constracter SuperClass
Default Constracter SubClass
Ben Doç. Dr.  Ahmet Mehmet

 */