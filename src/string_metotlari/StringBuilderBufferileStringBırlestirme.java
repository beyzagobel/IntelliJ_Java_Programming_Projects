package string_metotlari;

public class StringBuilderBufferileStringBırlestirme {
    public static void main(String[] args) {
        // StrignBuffer multi-thread programlarda yani daha büyük projelrede kullanılır
        // StringBuilder daha simple rpojelrede kullanılır ve daha hızlıdır.

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Ali");
        stringBuilder.append("Veli");
        String adSoyad=stringBuilder.toString();
        System.out.println("Ad-Soyad : "+adSoyad);

        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("Ali");
        stringBuffer.append("Veli");
        String adSoyad2=stringBuffer.toString();
        System.out.println("Ad-Soyad : "+adSoyad2);


    }
}
