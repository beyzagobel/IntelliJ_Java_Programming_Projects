package number_number_tip_donusumu;

public class WideningTipDonusumu {
    public static void main(String[] args) {
        // widening(genişletme): daha küçük bir türden daha büyük bir türe geçiş
        // byte>short>char>int>long<float>double
        // genişletme de otomatik tip dönüşümü gerçekleşir = implicit (kapalı) tip dönüşüm

        byte b=1;  // 8 bit
        short s=b;  // 16 bit

        char c='a';   // 16 bit
        int i=c;     // 32 bit

        long l=3;    // 64 bit
        float f=l;    // 32 bit

        double d=f;   // 64 bit



    }
}
