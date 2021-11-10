package diziler.cokboyutludiziler;

public class MatrisIslemleri {

    public static void main(String[] args) {

        int [][] matris = new int[2][3];
        matris[0][1] = 5;

        for(int i = 0 ; i < 2 ; i ++){

            for(int  j = 0 ; j < 3 ; j ++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.println("\n");

        }



    }
}
