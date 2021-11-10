package donguler_08;

public class LabeledForBreakOrnegi {

    public static void main(String[] args) {
        aa:  // etiket, hatırlatıcı , uyarı noktasaı
           for(int i = 1 ; i <= 3 ; i ++){
               bb:  // etiket, hatırlatıcı, uyarı noktası
                  for(int j= 1 ; j <= 3 ; j++){
                      if(i == 2 && j == 2){
                          break aa;  // döngüyü kır ve aa noktasına git demektir
                      }
                      System.out.println(i + " "+j);
                  }

           }
    }
// aa nooktasıda ana for döngüsünden çıkmak için konulmuş bir etikettir.
    /*
    Çıktı :
    1 1
    1 2
    1 3
    2 1
     */
}
