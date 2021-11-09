package donguler;

public class ForDongusuOrnek1 {
    public static void main(String[] args) {

        // - for döngüsü içinde tanımlanan değişkenler döngü haricinde kullanılamaz.

        for(int i=3;i<10;i++){
            System.out.println(i);
        }
        // System.out.println(i);   Conot resolve symbol 'i' şeklinde bir hata alınır çünkü 'i' değişkeni sadece döngü içinde kullanılabilir.

    }
}
