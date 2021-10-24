package string_metotlari;

public class LastIndexOfMetodu {
    public static void main(String[] args) {

        String s1="selam benim adim beyzaim";
        String s2="merhaba";

        System.out.println(s1.lastIndexOf("im")); // cümlnenin en sonundaki im kelimesinin ilk indexi olan i'nin indexini ekrana getirir // 22
        System.out.println(s1.lastIndexOf('i')); // 22 en son gördüğü i' indexi
        System.out.println(s1.lastIndexOf('S')); // hata vermez S olmadığı için -1 döndürür

        System.out.println(s2.lastIndexOf("a")); // 6 en son gördüğü a' nın index değeri


    }
}
