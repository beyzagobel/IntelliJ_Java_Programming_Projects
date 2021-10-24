package string_number_tip_donusumleri;

public class ParseMethodu {
    public static void main(String[] args) {
        // string ifadeleri number ifadelere dönüştürmek için parse metodu kullanılır.

 //       int sayi=Integer.parseInt("metin");
//        System.out.println(sayi);
// bu iki paragraf derleme hatası vermez fakat çalışma zamanı hatası verir çünkğü böyle birşey mantıken olamaz

        String s="12";
        int metinInt=Integer.parseInt(s);
        System.out.println(metinInt);

        // yada direk

        System.out.println(Integer.parseInt(s));

        double d=Double.parseDouble(s);
        System.out.println(d);
        float f=Float.parseFloat(s);
        short so=Short.parseShort(s);
        long l=Long.parseLong(s);
        byte b=Byte.parseByte(s);



    }
}
