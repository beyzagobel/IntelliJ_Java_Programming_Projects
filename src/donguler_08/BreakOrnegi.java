package donguler_08;

public class BreakOrnegi {

    public static void main(String[] args) {
        // Döngünün dışına çıkmak için kullanılır.

        for(int i=0; i<7; i++){

            if(i == 5)
                break;    // i = 5 olduğu zaman döngü sonlanır
            System.out.println(i);
        }
    }
}
