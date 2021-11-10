package diziler09.cokboyutludiziler;

public class IkiMatrisinToplami {

    public static void main(String[] args) {

        // matrislerin oluşturulması
        int a [][] = {{1,3,4},{3,4,5}};
        int b[][] = {{1,3,4},{3,4,5}};

        // iki matrisin toplamını tutacak diğer matris değişkeni
        int c[][] = new  int[2][3];  // 2 satır 3 sütunlu

        // matris toplamını gerçekleştirecek döngü
        for(int i = 0 ; i <  2 ; i ++ ){
            for(int  j = 0 ; j < 3 ; j ++){
                c[i][j] = a[i][j] + b[i][j] ;
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
Çıktı :
2 6 8
6 8 10
 */
