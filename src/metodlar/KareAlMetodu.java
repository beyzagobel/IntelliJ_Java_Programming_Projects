package metodlar;

public class KareAlMetodu {
    public static void main(String[] args) {
        System.out.println(kareAl(5));   // 25
        int x=6;
        System.out.println(kareAl(x));   // 36
        System.out.println(kareAl(x)*2);   // 72
        System.out.println("x = "+x);   // x = 6
    }
    public static int kareAl(int sayi){
        return  sayi*sayi;
    }
}
