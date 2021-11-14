package kullanım_duzenleyiciler;

public class FinalOrnek {

    final int i ;

    public FinalOrnek(int i){
        this.i = i ;
    }
    public void yazdir(){
//         i = 4;   // final olan i değişkeni sadece ilk tanımlandığı yerde veya yapıcı metodda ilk değer ataması yapılabilir.
        System.out.println(i);
    }

    public static void  main(String [] args){

        FinalOrnek nesne = new FinalOrnek(5);
        nesne.yazdir();

    }
}
