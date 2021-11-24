package erisimduzenleyiciler_accessmodifiers;

public class Tanım {   // Sınıflar protected veya private olamazlar
    /*
     * Bir java ögesi (değişken, metod, sınıf, paket) tanımlanıken, o ögeye kimlerin erişebileceğini belirtme olanağı sunan belirteçlere denir.
     * 4 tane erişim belirleyici vardır :
     * public : Bütün sınıflar,programlar erişebilir. Nitelediği ögeler herkeze açıktır.
     * private : Alt sınıf da dahil başka hiçbir sınıf erişemez. Private ögelere yanlızca aynı sınıftaki kodlar erişeblilir. Kendi alt sınıfları bile erişemez.
     * protected : Alt sınıflar(farklı pakette olsalar bile) veya aynı pakettekiler erişebilir.
     * default : Aynı pakettekiler erişebilir.
     * private -> default -> protected -> public   = ERİŞİLEBİLİRLİK ARTAR
     * SINIF SEVİYESİNDE SADECE PUBLİC VE DEFAULT ERİŞİM DÜZENLEYİCİLERİ KULLANILABİLİR.
     */

    int a ;            // default erişim
    public int b ;
    private  int c ;

    void setc(int i){      // c ye değer atar
        c = i ;
    }

    int getc(){
        return  c ;    // c nin değeri döner
    }

    public static void main(String[] args) {

        Tanım tanım = new Tanım();

        // a ve be ye direk erişim sağlanabilir
        tanım.a = 10 ;
        tanım.b = 20 ;

        tanım.setc(100);  // c ye değer atamak ve erişmek için get ve set metodları kullanılabilir.
        tanım.c = 34;  // diyerek de erişilebilir

        System.out.println("a , b and c : " + tanım.a + " " + tanım.b + " " + tanım.getc());
    }



}

