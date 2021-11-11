package string_metotlari_05;

public class EqualsDenemesi {
    public static  void main(String [] args) {
        String birinci = "BEYZA";
        String ikinci = "DEU";
        String ucuncu = "deu";
        System.out.println(birinci.equals(birinci));
        System.out.println(birinci.equals(ikinci));
        System.out.println(ikinci.equalsIgnoreCase(ucuncu));
        System.out.println(ikinci.equals(ucuncu.toUpperCase()));
    }
}

/*

Çıktı :

true
false
true
true

 */