package string_metotlari_05;

public class StringUzunlukBulma {
    public static void main(String[] args) {
        // bir stringin uzunluğunu bulurken length() metodunu ve lastIndexOf() metodunu kullanabiliriz:

        String str="merhaba ben beyza";
        System.out.println(str.length());  // bu klasik olan length metodudur 1 den saymaya başlar  // 17


        int length2=str.lastIndexOf('a')+1;  // index 0 dan saymaya başladığı için 1 artırılır
        System.out.println(length2);   // 17
    }
}
