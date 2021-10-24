package firstpackage;

public class ToStringKullanimi {
    public static void main(String[] args) {

        // toString() metodu  nesnelerin metin karşılıklarını ekrana basar

        Integer i=5;
        System.out.println(i.toString());
        Double d=0.5;
        System.out.println(d.toString());

        float f=.23f;
        System.out.println(Float.toString(f));

        // buradaki veri tipleri sarıcı sınıf olmak zorundadır çünkü toString methodu nesnelerde kullanılabilir.


    }
}
