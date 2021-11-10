package string_metotlari_05;

public class IndexOfMetodu {
    public static void main(String[] args) {
        // String.indexOf(char character)
        // string ifadesindeki yazdığımız karakterin index değerini döndürür.
        // yazılan karakter yoksa -1 döndürür.

        String s1="selam benim adim beyzaim";
        String s2="Merhaba";
        System.out.println(s1.indexOf("b")); // 6 ilk gördüğü b harfinin indexi
        System.out.println("beyza".indexOf("z")); // 3

        System.out.println(s2.indexOf("haba")); // bu şekilde haba kelimesi var ise sadece h karakterinin index değerini döndürür //3
        System.out.println(s2.indexOf("hap"));// fakat öyle ir kelime yoksa -1 basar ekrana hata vermez  // -1

        String s3="selamınaleyküm";
        System.out.println(s3.indexOf(0)); // int ve STİRNG

    }
}
