package kalıtım.instance_of;

public class Personal {
 /*
  * instanceof operatörü, nesnesin ilgili sınıfa ait bir örnek olup olmadığını kontrol eder.
  * Kalıtım aranır.
  */
    public static void main(String[] args) {
        Personal personal = new Personal();
        Akademisyen akademisyen = new Akademisyen();
        Ogrenci ogrenci = new Ogrenci();

        System.out.println(personal instanceof Personal);       // TRUE
        System.out.println(akademisyen instanceof Personal);    // TRUE
        // System.out.println(ogrenci instanceof Personal);        FALSE

        System.out.println(akademisyen.getClass() == Akademisyen.class);  // TRUE
    }
}
