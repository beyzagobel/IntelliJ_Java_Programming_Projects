package diziler09.cokboyutludiziler;

public class Ornek2 {

    public static void main(String[] args) {

        // iki boyutlu dizi tanımlama
        int arr[][] ={{1,2,3},{2,4,5},{4,4,5}};

        // diziyi yazdırma
        for(int i = 0 ; i < 3 ; i ++){
            for(int  j = 0 ; j < 3 ; j ++){
                System.out.print(arr[i][j]+" ");  // birinci satır elemanlarını birer boşluk ara ile yazdırır
                // println değil print
            }
            System.out.println();  // 2. satır elemanlarına geçerken bir satır boşlık bırakarak yazdırır.
        }
        
    }
}

/*
Çıktı :

1 2 3
2 4 5
4 4 5

 */
