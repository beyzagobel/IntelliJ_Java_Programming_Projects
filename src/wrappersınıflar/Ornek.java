package wrappersınıflar;

//import java.lang.System   system için sınıf

public class Ornek {
    public static void main(String[] args) {
        /* Sarıcı Sınıflar, primitive tiplerin nesne olarak kullanılmasını sağlarlar.--

        byte->Byte
        short->Short
        int->Integer
        long->Long
        float->Float
        double->Double
        char->Character
        boolean->Boolean

         */
// sadece int compareTo metodu vardır dierğleri içinde kullanak istiyorsa önce int dönüştürmek gerekir

        // short ve byte da böyle yazmak zorundayız.
        Short s1=new Short((short)5);
        System.out.println(s1);
        Short s= 5;
        System.out.println(s.toString());  // 4
       // System.out.println(s.compareTo(4));  hata verir
        System.out.println(s.compareTo(s1));  //
        Integer i1=s.intValue();
        System.out.println(i1.compareTo(7));   // -1


        Byte b=5;
        System.out.println(b.toString()); // 5
        System.out.println(b.compareTo((byte)7));   // hata vermez ama compareTo metoduda tam olarak uygulanamaz 7-5 işleminin uygular

        Integer i=new Integer(5);
        System.out.println(i.toString());
        System.out.println(i.compareTo(8));

        Long l= new Long(5);

        System.out.println(l.toString());
        Integer i2=l.intValue();
        System.out.println(i2.compareTo(3));  // ya da direk olarak
        System.out.println(i2.compareTo(5));

        Float f=new Float(0.434f);  // ya da
        Float f2=0.34435f;  // ya da
        Float f3;
        f3=0.3565f;

        Double d=new Double(0.355);

        Boolean bo=new Boolean(true);

        Character c=new Character('s');






    }
}
