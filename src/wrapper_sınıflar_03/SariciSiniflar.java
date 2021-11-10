package wrapper_sınıflar_03;

public class SariciSiniflar {
    public static void main(String[] args) {
        /* Sarıcı Sınıflar, primitive tiplerin nesne olarak kullanılmasını sağlarlar.--
         * Böylece sarıcı sınıfların metodlarından yararlanabiliriz.
         * java.lang paketi içindedirler, import etmemize gerek yoktur.
         * Object sınınfa tanımlı 3 ana Wrapper(Sarıcı) Sınıf bulunur. :
         * 1- Number -> Byte , Short , Integer , Long , Float , Double
         * 2- Boolean
         * 3- Character

        byte->Byte
        short->Short
        int->Integer
        long->Long
        float->Float
        double->Double
        char->Character
        boolean->Boolean

         */


        Integer i1 = new Integer(5);
        System.out.println(i1);                     // 5
        System.out.println(i1.toString());          // 5
        System.out.println(i1.floatValue());        //

        Integer i2=6;
        System.out.println(2);              // 6

        Byte b=5;
        System.out.println(b.toString()); // 5


        Integer i=new Integer(5);
        System.out.println(i.toString());
        System.out.println(i.compareTo(8));

        Long l= new Long(5);

        System.out.println(l.toString());
        Integer i5=l.intValue();
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
