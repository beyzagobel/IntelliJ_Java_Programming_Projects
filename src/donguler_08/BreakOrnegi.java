package donguler_08;

public class BreakOrnegi {

    public static void main(String[] args) {
        // Döngü sonlandırılmasında kullanılır.

        for(int i=0; i<7; i++){

            if(i == 5)
                break;    // i = 5 olduğu zamana program sonlanır
            System.out.println(i);
        }
    }
}
