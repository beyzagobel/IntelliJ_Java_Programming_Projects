public class Deneme6 {
    public static void main(String[] args) {

        String s1 = "Adana";
        String s2 ="ana";

        String s3 = new String("beyza");
        String s4 = new String("beyza");

        System.out.println(s3 == s4);         // FALSE   bellek kontolü yapar
        System.out.println(s3.equals(s4));   // TRUE     içerik kontrolü yapar

        String s3intern= s3.intern();  // == operatörü artık içrik kontrolü yapar
        String s4interne=s4.intern();  // == operatörü artık içrik kontrolü yapar

        System.out.println(s3intern == s4interne);   // TRUE

        s1 = s1.substring(2);

        System.out.println(s1.equals(s2));  // içerijk kontrolü yapar  TRUE
        System.out.println(s1 == s2);   // referans kontrolü yapar     FALSE

        System.out.println(s1);   // ana

        System.out.println(s2);  // ana

        System.out.println(s1==s2);   //  aynı alanları göstermediği içi FALSE

        s1 = s2 ;  // aynı bellek alanını gösterirler

        System.out.println( s1 == s2);    // TRUE

        String b ="";
        String c = null;

        System.out.println(b);    // BİŞ SATIR BOŞLUK BIRAKIR
        System.out.println(c);   // NULL

        String s5 = "java";
        String s6 = "java";

        System.out.println(s5 == s6);   // TRUE
        System.out.println(s5.equals(s6));   // TRUE


    }
}
