package string_number_tip_donusumleri;

public class ParseMethodu {
    public static void main(String[] args) {

        // String ifadeleri, PRİMİTİVE number ifadelere dönüştürmek için ,Number Sınıflarının Parse metodları kullanılır.
        // PARSE(string) şeklinde yazılmalıdır.
        // int sayi=Integer.parseInt("metin")  Bu paragraf derleme hatası vermez fakat çalışma zamanı hatası verir çünkü böyle birşey mantıken olamaz

        String s="12";
        int metinInt=Integer.parseInt(s);  //s String ini Integer sınıfındaki parseInt metodunu kullanarak int dönüştür demektir  // üye metod
        System.out.println(metinInt);   // 12

        // yada direk

        System.out.println(Integer.parseInt(s));  // static metod direk sınıf üzerinden erişim

        double d=Double.parseDouble(s);
        System.out.println(d);

        float f=Float.parseFloat(s);
        System.out.println(f);

        short so=Short.parseShort(s);
        System.out.println(so);

        long l=Long.parseLong(s);
        System.out.println(l);

        byte b=Byte.parseByte(s);
        System.out.println(b);

        Integer zalim=new Integer(9);

        System.out.println(Long.parseLong(zalim.toString()));    // toString() metodu ile İNT olan zalim > STRİNG oldu > parseLong ile string tipindeki zalim  LONG oldu





    }
}
