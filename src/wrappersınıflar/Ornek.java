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

        // short ve byte da böyle yazmak zorundayız.

        Short s1=new Short((short)5);
        System.out.println(s1); //5  ya da

        Short s2= 4;
        System.out.println(s2.toString());  // 4 ya da

        Short s3=(short)5;  //  3 şekilde de tanımlanabilir.

       // System.out.println(s.compareTo(4));  hata verir

        System.out.println(s2.compareTo(s1));  // ya da

        Integer i1=s2.intValue();
        System.out.println(i1.compareTo(7));   // -1


        Byte b=5;
        System.out.println(b.toString()); // 5

        System.out.println(b.compareTo((byte)7));   // hata vermez ama compareTo metoduda tam olarak uygulanamaz 7-5 işleminin uygular yani yapılamaz

        Integer i=new Integer(5);
        System.out.println(i.toString());
        System.out.println(i.compareTo(8));

        Long l= new Long(5);

        System.out.println(l.toString());
        Integer i2=l.intValue();
        System.out.println(i2.compareTo(3));  // ya da direk olarak

        /* int hariç diğer sarıcı sınıflarda compareTo metodunu kullanmka istersek 2 yöntem var;
        1-> intValue metodu ile nesneyi inte çevirip sonra compareTo ya tabi tutucaz
            Double d=new Double(0.23);
            Integer i=d.intValue();
            System.out.println(i.compareTo(5));
        2-> ya da iki aynı tipte veri olacak ve compareTo metodunun içine nesne yazılacak sayı kabul etmez
            Short sayi=new Short((short)5);
            Short sayi2=new Short((short)7);
            System.out.println(sayi.compareTo(sayi2));
         */



        Float f=new Float(0.434f);  // ya da
        Float f2=0.34435f;  // ya da
        Float f3;
        f3=0.3565f;

        Double d=new Double(0.355);

        Boolean bo=new Boolean(true);

        Character c=new Character('s');






    }
}
