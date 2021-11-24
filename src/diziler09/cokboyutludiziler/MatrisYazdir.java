package diziler09.cokboyutludiziler;

public class MatrisYazdir {

    public static void main(String[] args) {
        Integer [][] matris = {{3,2,5},{3,4,5},{4,7,2}};
        System.out.println(matris.length);
        matrisYazdir(matris);
    }

    public static  void matrisYazdir(Integer [][] matris){
        for(int i = 0 ; i < matris.length ; i ++){
            for(int j = 0 ; j < matris[i].length ; j++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }
    }

}
