package diziler09.tekboyutludiziler;

public class EnKucukElemanBulma {

    public static void main(String[] args) {
        // Tanımlanan bir dizinin en küçük elemanını bulan minimum fonksiyonu

        int a[] = {3,44,33,6,7};
        System.out.println("Dizinin en küçülk elemanı : " + minimum(a));
    }
    public static int minimum(int arr[]){
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(min > arr[i]) {  // arr[0] ile tek tek diğer elemanlar ile karşılaştırır
                min = arr[i];

            }
        }
        return min;
    }
}
