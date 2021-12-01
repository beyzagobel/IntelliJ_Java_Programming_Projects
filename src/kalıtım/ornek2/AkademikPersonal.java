package kalıtım.ornek2;

public class AkademikPersonal extends Personal {

    public AkademikPersonal(){
        // super();   bir üst sınıfın yapıcısı çağrılır
        System.out.println("Akademisyen yapıcısı çalıştı.");
    }

    public static void main(String[] args) {
        AkademikPersonal akademisyen = new AkademikPersonal();

    }
}

/*
ÇIKTI :

İnsan yapıcısı çalıştı.
Personal yapıcısı çalıştı.
Akademisyen yapıcısı çalıştı.

 */