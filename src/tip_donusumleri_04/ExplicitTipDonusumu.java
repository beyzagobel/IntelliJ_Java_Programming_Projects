package tip_donusumleri_04;
public class ExplicitTipDonusumu {

    public static void main(String[] args) {
        /*
         * Narrowing Casting - Daraltma : daha büyük  bir türü daha küçük boyutlu türe dönüştürme işlemidir.
         * double(64 bit) -> float(32 bit) -> long(64) bit -> int(32 bit) -> short(16 bit) -> byte(8 bit)
         * Tip dönüşümü açıkca belli edilmelidir.
         */



        double d = 1.2;
        float f1 = (float) d;

        float f2 = 3.45f ;
        long l1 = (long) f2 ;

        long l2 = 4 ;
        int i1 = (int) l2 ;

        int i2 = 5 ;
        short s1 = (short) i2 ;

        short s2 = 2 ;
        byte b = (byte) s2 ;






    }
}
