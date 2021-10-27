package metodlar;

public class ToplamaIslemi {
    public static void main(String[] args) {
        int sonuc1=topla(3,5);   // burada iki paraetreli olan topla metoduna gider
        int sonuc2=topla(3,5,7);   // burada 3 parametreli olan topla metoduna gider
        System.out.println(sonuc1);
        System.out.println(sonuc2);
    }
    public static int topla(int sayi1,int sayi2){
        return  sayi1+sayi2;
    }
    public  static int topla(int sayi1,int sayi2,int sayi3){
        return sayi1+sayi2+sayi3;
    }

    /* Fakat ya daha çok parametreli toplama işlemi yapıcaksak ?
    O zaman çok fazla metod değişkneni mi tanımlicaktık ? tabiki hayır .
    Bunun için Değişken Sayıda Parametre Aln Metodları kullanacağız.
     */

}
