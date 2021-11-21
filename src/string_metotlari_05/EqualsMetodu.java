package string_metotlari_05;

public class EqualsMetodu {
    public static void main(String[] args) {

        // eşitlik kontrolü yapar.
        // bu fonksiyon BÜYÜK-KÜÇÜK HARFE DUYARLIDIR.

        String s1="beyza";

        String s2="BeyZa";

        System.out.println(s1.equals(s2));

        System.out.println(s1.equals("beyza"));

        System.out.println("beyza".equals("gobel"));

        System.out.println(" ".equals(" "));

        // string sınıfının metodu olduğu için her türlü string ile kullanılır.
        // çıktı olarak false veya true verir.
        // karşılştırma yaptığı içim parantez içine string bir ifade yazmak zorundayız

    }
}
