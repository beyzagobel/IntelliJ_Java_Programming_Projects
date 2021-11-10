package tip_donusumleri_04;

public class ImplicitTipDonusumu1 {
    public static void main(String[] args) {
        // Widening Casting - Genişletme : Daha küçük bir türden daha büyük bir türe geçiş
        // byte -> short -> char -> int -> long -> float ->double
        // İmplicit (kapalı) tip dönüşümü gerçekleş, derleyici otomatik olarak tip dönüşümü yapar.

        byte b=1;  // 8 bit
        short s=b;  // 16 bit
        System.out.println(s);

        char c='a';   // 16 bit
        int i=c;     // 32 bit
        System.out.println(i);

        long l=3;    // 64 bit
        float f=l;    // 32 bit
        System.out.println(f);

        double d=f;   // 64 bit
        System.out.println(d);


    }
}
