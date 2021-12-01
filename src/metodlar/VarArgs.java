package metodlar;

public class VarArgs {

    /* DEĞİŞKEN SAYIDA ARGÜMAN ALABİLEN METODLAR
     *  Değişken uzunluklu bir argüman, üç nokta (...) ile birlikte gösterilir.
     * örn  static void Test(int ...i)
     * Bu sözdizimi, derleyiciye Test() metodunu 0 veya faha çok argümanla çağrılabileceği anlamındadır.
     * Sonuç olarak, i, kapalı bir biçimde int[] tipğinde biz dizi olarak deklare edilir.
     * Bir metot, değişken uzunluklu bir parametrenin yanı sıra “normal” parametrelere de sahip olabilir.
     * Ancak değişken uzunluklu parametre, metot tarafında deklare edilen son parametre olmalıdır.
     * örn : int dolt(int a, int b, double c, int ...vals)
     * Bir metodda sadece bir tane varargs parametresi bulunabilir o da son parametre olmak zorundadır.
     */

    static void Test(int ...v){
        System.out.println("Number of args : " + v.length + " Contents : ");

        for(int i: v){  // int[] dizisinin değerlerini döndürür
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        Test();
        Test(5);
        Test(1,2,3);
// Değişken sayıda argümanla çağırabiliriz.

    }
}
