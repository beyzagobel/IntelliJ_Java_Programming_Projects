package metodlar;

import java.util.Random;

public class RandomSayiUretme {
    public static void main(String[] args) {
        // java.util  paketinin içinde bulunan Random sınıfı kullanılır.
        // 0'dan başlamak üzere (parametre hariç) belirtilen parametre hariç rastgele sayı üretir

        Random random=new Random(4);
        int sayi=random.nextInt();
        System.out.println(sayi);

        boolean b=random.nextBoolean();  // rastgele boolean değer üretir
        System.out.println(b);

        double d=random.nextDouble();   // 0 ile 1 arasında double tipinde sayı üretir
        System.out.println(d);

        float f=random.nextFloat();    // 0 ile 1 arasında float sayı üretir
        System.out.println(f);

    }
}
