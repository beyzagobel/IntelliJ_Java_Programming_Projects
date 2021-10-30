package kosulyapilari;

public class SwitchKontrolu {
    public static void main(String[] args) {

        /*
        - Kontrol değişkenine bağlı olarak birden fazla kod bloğuunun yürütülmesini sağlayam kontroldür.
        - break komutuyla karşılaşıncaya kadar yürütme değer kod bloklarıyla devam eder.
        - Değişken tiperi byte, short, char, inti enum veya String olmalıdır
        - Hiçbir değer kontrol ifadesi sağlanmasında default kod bloğu işletilir.
        */

        int i=5;
        switch (i){
            case 1:
                System.out.println("Değer : 1");
                break;
            case 4:
                System.out.println("Değer : 4");
                break;
            default:
                System.out.println("Değer hiçbir şartla eşleştirilemedi. ");
                break;
        }
    }
}
