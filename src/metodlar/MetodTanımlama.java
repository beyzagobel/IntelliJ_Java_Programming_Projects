package metodlar;

public class MetodTanımlama {

    public static void main(String[] args) {
        /* Metod : Komutlar barındırabilen yürütme birimleridir.
        nitelikleri :
        1- geri dönüş tipi : Object , short, int , double , float , boolean , char , byte ve void
        2- metod adı
        3- metod parametreleri : parametre sayısı ve parametre tipleri
        4- erişim kontrolü
         */

        int sayi1 = 4, sayi2 = 5;
        int toplam = topla(sayi1, sayi2);
        System.out.println(toplam);
    }


        public static int topla(int giris1,int giris2){
            return giris2+giris2;
        }
}