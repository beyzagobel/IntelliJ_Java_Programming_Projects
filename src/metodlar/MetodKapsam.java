package metodlar;

public class MetodKapsam {

    static int sayi = 5 ;

    public static void main(String[] args) {

        System.out.println(sayi);
        kareAl(sayi + 1);
        System.out.println(sayi);
        sayi = 7 ;
        System.out.println(sayi);
        kareAl(sayi);
        System.out.println();
    }


    public static int kareAl(int sayi){

        System.out.println(sayi);
        return sayi * sayi ;
    }
}
