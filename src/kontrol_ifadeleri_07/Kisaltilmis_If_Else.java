package kontrol_ifadeleri_07;

public class Kisaltilmis_If_Else {

    public static void main(String[] args) {
        /*
         * if ve else koşullarını tek satırda birleştirmek mümkündür.
         * DEĞİŞKEN = KOŞUL ? DEĞER_1 : DEĞER_2;
         */

        // 1. kısım uzun hali
        int a = 2;
        int b = 4;
        int min;

        if(a<b){
            min = a ;
            System.out.println(min);;
        }else{
            min = b ;
            System.out.println(min);;
        }

        // 2. kısım kısaltılmış hali

        int min2 = a < b ? a : b ;
        // " eğer a'nın değeri b'nin değerinden küçük ise min = a , değilse min =b olucak " demektir
        System.out.println(min);




    }
}
