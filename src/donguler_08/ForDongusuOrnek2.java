package donguler_08;

public class ForDongusuOrnek2 {
    public static void main(String[] args) {

        int i=1, j=4;

        for(j=9; i%3!=0; j-=2){   // i'nin 3'e bölümünden kalan 0 değil ise j'yi 2 azalt
            System.out.println(j);   // 9
            i++;
        }
        System.out.println(j);
        System.out.println(i);

    }
}
