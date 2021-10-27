package metodlar;

public class ScopeOrnek {
    static int sayi=5;
    public static void main(String[] args) {
        System.out.println(sayi);                    //  1.adım:  5
        System.out.println(kareAl(sayi+1));     //3.adım: 36
        System.out.println(kareAl(sayi));           // 5.adım: 25
        System.out.println(sayi);                   // 6.adım: 5
    }

    public  static int kareAl(int sayi){
        System.out.println(sayi);              // 2.adım: 6    // 4.adım:  5
        return sayi*sayi;
    }
}
