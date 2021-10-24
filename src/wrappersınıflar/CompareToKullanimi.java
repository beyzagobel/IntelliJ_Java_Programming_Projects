package wrappersınıflar;

public class CompareToKullanimi {
    public static void main(String[] args) {

        // Sarıcı sınıflar ve String sınıfı compareTo() metodunu implamente eder
        // karşılaştırdığımız veri eldeki veriden büyükse -1, eşitse 0, küçükse 1 ekrana basılır

        Integer integer=new Integer(5);
        System.out.println(integer.compareTo(4));   // üye(instante) metod
        System.out.println(integer.compareTo(5));   // üye(instante) metod
        System.out.println(integer.compareTo(6));   // üye(instante) metod

        // ya da direk nesne kullanılmadan static olarak herhangi iki sayının karşılaştırılması yapılabilir

        System.out.println(Integer.compare(2,4));   // static metod
        System.out.println(Integer.compare(5,1));

        // Integer tipi dışındaki diğer sarıcı sınıflardada kullanmak için bazı yöntemler vardır;

        Byte b=new Byte((byte)5);
        Short s1=new Short((short)7);
        String s2=new String("12");
        String s3=new String("123");

        System.out.println(b.compareTo(s1.byteValue()));  //s1 i byte a dönüştür ve b ile karşılaştır

        System.out.println(b.compareTo(Byte.parseByte(s2)));   // s2 string ini byte a dönüştür ve b ile karşılaştır
        System.out.println(s1.compareTo(Short.parseShort(s2)));   // s2 string ini short a çevir ve s1 ile karşılaştır
        System.out.println(s2.compareTo(s3));   // -1 gelir

    }
}
