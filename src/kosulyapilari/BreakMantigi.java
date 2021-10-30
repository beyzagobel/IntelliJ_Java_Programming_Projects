package kosulyapilari;

public class BreakMantigi {
    public static void main(String[] args) {
        // break komutu kullanılmadığı zaman ki programın çalışma mantığına dikkat edilmeli.
        int x=1;
        switch (x){
            default:
                System.out.println("Default ");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
        }
    }
}

//

/*
Çıktı :
1
2
 */
