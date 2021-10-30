package number_string_tip_donusumleri;

public class StringMethodu {
    public static void main(String[] args) {

        // toString() metodu uygulayarak farklı veri tiplerini metinsel ifadelere dönüştürülür

        int i=1;
        double d=0.2;
        float f=0.3f;
        short s=4;
        byte b=5;

        Character c;
        c = 'g';
        String metinChar=c.toString();  // bu şekildede nesne üzerinden erişilerek tip dönüşümü yapılabilir.  //  üye method
        System.out.println(metinChar);


        String metinInt=Integer.toString(i); // sınıf üzerinden erişim  // static metod
        System.out.println(metinInt);

        String metinDouble=Double.toString(d);
        System.out.println(metinDouble);

        String metinFloat=Float.toString(f);
        System.out.println(metinFloat);

        String metinShort=Short.toString(s);
        System.out.println(metinShort);

        String metinByte=Byte.toString(b);
        System.out.println(metinByte);




    }
}
