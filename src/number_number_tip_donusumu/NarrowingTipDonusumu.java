package number_number_tip_donusumu;
public class NarrowingTipDonusumu {

    public static void main(String[] args) {
        // Narrowing : daha büyük bit türü daha küçük bir türe dönüştürmek DARALTMA
        // double>float>long>int>char>short>byte
        // tip dönüşümü açıkca belli edilmelidir = explicit (açık) tip dönüşümü


        double d=1.2;
        float f=(float)d;

        long l=4;
        int i=(int)l;

        char c='g';
        short s=(short)c;

        byte b= (byte)s;


    }
}
