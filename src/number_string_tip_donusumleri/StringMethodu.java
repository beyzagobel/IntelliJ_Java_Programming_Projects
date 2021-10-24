package number_string_tip_donusumleri;

public class StringMethodu {
    public static void main(String[] args) {

        // toString() metodu uygulayarak farklı veri tiplerini metinsel ifadelere dönüştürülür

        int i=1;
        double d=0.2;
        float f=0.3f;
        short s=4;
        byte b=5;

     //   Float float=0.45;   böyle bir atama yapamazsın



        Character c;
        c = 'g';
        String metinChar=c.toString();  // bu şekildede nesne üzerinden erişilerek tip dönüşümü yapılabilir.  //  üye method
        System.out.println(metinChar);


        String metinInt=Integer.toString(i);   // sınıf üzerinden erişim  // static metod
        String metindouble=Double.toString(d);
        String metinfloat=Float.toString(f);
        String metinshort=Short.toString(s);
        String metinbyte=Byte.toString(b);

        System.out.println(metinInt);
        System.out.println(metindouble);
        System.out.println(metinfloat);
        System.out.println(metinshort);
        System.out.println(metinbyte);

    }
}
