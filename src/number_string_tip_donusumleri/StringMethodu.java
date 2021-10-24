package number_string_tip_donusumleri;

public class StringMethodu {
    public static void main(String[] args) {
        int i=1;
        double d=0.2;
        float f=0.3f;
        short s=4;
        byte b=5;

        Character c='g';
        String metinChar=c.toString();  // bu şekildede tip dönüşümü yapılabilir.  // nesne üzerinden üye method

        String metinInt=Integer.toString(i);   // sınıf üzerinden erişim
        String metindouble=Double.toString(d);
        String metinfloat=Float.toString(f);
        String metinshort=Short.toString(s);
        String metinbyte=Byte.toString(b);

    }
}
