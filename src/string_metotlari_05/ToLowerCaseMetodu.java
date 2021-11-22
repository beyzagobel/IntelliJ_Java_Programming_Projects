package string_metotlari_05;

import java.util.Locale;

public class ToLowerCaseMetodu {

    public static void main(String[] args) {

        String str = "HAKKI";

        Locale localeTR =new Locale("tr","TR");

        System.out.println(str.toLowerCase(localeTR));    // hakkı

        System.out.println("bilgisayar".toUpperCase(localeTR));   // bilgisayar



    }
}
