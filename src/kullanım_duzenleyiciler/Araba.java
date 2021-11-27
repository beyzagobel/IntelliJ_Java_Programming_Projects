package kullanım_duzenleyiciler;

public class Araba {

    Integer vites;

    public void vitesArtir(Integer vites){
        vites = this.vites + vites ;
        System.out.println(vites);
    }

    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.vites = 1 ;
        araba.vitesArtir(2);
        System.out.println(araba.vites);
  //    System.out.println(vites);   diyemeyiz. Çünkü static bir metod olan MAİN() metodu içinde static olmayan bir değişkene yanlızca nesneler üzerinden erişim sağlanır.
    }
}
