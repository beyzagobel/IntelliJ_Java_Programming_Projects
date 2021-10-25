package string_metotlari;

import java.util.Locale;

public class ToUpperCaseMetodu {
    public static void main(String[] args) {
        Locale localeTR =new Locale("tr","TR");
        System.out.println("bilgisayar".toUpperCase());
        System.out.println("bilgisayar".toUpperCase(localeTR));


    }
}
