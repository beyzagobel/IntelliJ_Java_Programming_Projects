package artıoperatoru;

public class ByteShortChar_IntDonusum {
    public static void main(String[] args) {
        // TİP DÖNÜŞTÜRÜCÜ OLARAK + OPERATÖRÜ
        // short , char , byte 'ın önüne gelen + operatörü bu tipleri integer a çevirir.

        // byte short char -> İNT


        char c='a';   // çift tırnak kabul etmez char için tek tırnak kullanılır
        int i1= +c;

        System.out.println(i1);


        byte d=5;
        int i2= +d;
        System.out.println(i2);

        short s=6;
        int i3= +s;
        System.out.println(i3);




    }
}
