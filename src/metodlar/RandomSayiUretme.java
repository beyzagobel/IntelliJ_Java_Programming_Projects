package metodlar;

import java.util.Random;

public class RandomSayiUretme {
    public static void main(String[] args) {
        // java.util  paketinin içinde bulunan random sınıfı kullanılır
        Random random=new Random();
        int sayi=random.nextInt();
        System.out.println(sayi);
    }
}
