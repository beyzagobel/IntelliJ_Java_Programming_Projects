package wrapper_sınıflar_03;

public class SariciSiniflarinCompareMetodu {
    public static void main(String[] args) {

        /*
         * Sarıcı sınıflar, compareTo() metodunu implamente eder ve karşılaştırma yapar.
         * Karşılaştırdığımız veri eldeki veriden büyükse -1, eşitse 0, küçükse 1 ekrana basılır.

         */

        // örnek 1 :
        Integer i=new Integer(5);
        System.out.println(i.compareTo(4));   // nesne üzerinden erişim : üye(instante) metod
        System.out.println(i.compareTo(5));   // üye(instante) metod
        System.out.println(i.compareTo(6));   // üye(instante) metod

        // örnek 2: direk nesne kullanılmadan static olarak herhangi iki sayının karşılaştırılması yapılabilir.

        System.out.println(Integer.compare(2,4));          // Sınıf üzerinden erişim : static metod
        System.out.println(Integer.compare(5,1));
        System.out.println(Character.compare('a','b'));

        // örnek 3: Integer tipi dışındaki diğer sarıcı sınıflardada kullanmak için bazı yöntemler vardır;

        Long l1 = new Long(567);
        Long l2 = new Long(24);
        Double d1 = new Double(45.35);
        Double d2 = new Double(4.23);
        Float f = new Float(3.34);

        System.out.println(d1.compareTo(d2));
        System.out.println(Double.compare(d1,d2));

        // örnek 4 : farklı tipteki 2 değişkeni number sınıfının metodu olan Value() ile tip dönüşümü yaparak karşılaştırma yapabiliriz.

        System.out.println(l2.compareTo(d2.longValue()));   // önce d2 değişkenini long'a dönüşütür, sonra compareTo metdou ile long tipindeki l2 değişkeni ile karşılaştır.

        // örnek 5 : sarıcı sınıf kullanmadan compare metodu ile değişkenleri karşılaştırabiliriz.

        float f1 = 2.34f;
        float f2 = 5.334f;

        System.out.println(Double.compare(f1,f2));

        // örnek 6 : 2 farklı tipteki değişkeni sarıcı sınıfların metodu olan parse ile tip dönüşümü kullanılarak karşılaştırma yapalım.

        double d = 3.535;
        Float f3 = new Float(243.24);
        String str="2344";

        System.out.println(Double.compare(d,Double.parseDouble(str)));

        System.out.println(f3.compareTo((float)d));

        // örnek 7 : bir sarıcı sınıf nesnesi ile bir değeri karşılaştırma

        System.out.println(f3.compareTo(5.56f));

    }
}
