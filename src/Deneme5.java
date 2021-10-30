public class Deneme5 {
    public static void main(String[] args) {

    }
    public static void matrisYazdir(Integer[][] matris){
        for(int i=0;i<matris.length;i++){   // kaç satır var
            for(int j=0;j<matris[0].length;j++){   // ilk satırındaki sutün sayıyı
                System.out.println(matris[i][j]+" ");
            }
            System.out.println();
        }
    }
}
