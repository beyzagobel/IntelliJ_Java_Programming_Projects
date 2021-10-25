package string_metotlari;

public class ReplaceMetodu {
    public static void main(String[] args) {

        // String.replace(char oldChar,char newChar)
// String metodlarına static olarak erişilemez String.reaplace() diyemeyiz.

        System.out.println("benim adim beyza göbel".replace("beyza","Beyza"));  // burada verdiğimiz string teki beyza kelimesini Beyza olarak düzeltti
        System.out.println();

        // yada tanımlanan string üüzerinden değişim yapılır

        String str=new String();
        str="Merhaba benim adim Beyza göbel.";
        System.out.println(str.replace("göbel","Göbel"));

        System.out.println(str.replace("b","B"));  // tüm b leri B yapar
    }
}
