package sınıflar_ve_nesneler10;

public class Tanım {

    public Tanım(){
        this(5);
    }  // varsayılan yapıcı metod

    public Tanım(int i){

    }

    public static void main(String[] args) {

        /*
         * Yalnızca main() metodu bulunduran sınflar yürütülebilir durumdadır.
         * new anahtar sözcüğü ile sınıflardan nesneler türetilir.
         * Her sınıfın parametresiz , geri dönüş tipi void sınıf ismiyle aynı isimli VARSAYILAN YAPICI METODU vardır.
         * Diğer özelleştirilmiş metodlar elle oluşturulmalıdır.
         * Özelleştirilmiş herhangi bir yapıcı metod tanımlandıktan sonra, varsayılan yapıcı metod da kullanılmak istenirse tanımlanması gerekir.
         * Yapıcı metod ; aynı sınıf içerisinden this() metodu ile, sınıftan türeyen alt sınıfın yapıcı metodları super() metodu ile çağırıabilir.
         * Alt sınıftan super() çağrısı yapılacaksa , alt sınıfın yapıcı metodu içerisinindeki ilk komutu olmalıdır.
         * Yapıcı metodlar kalıtım yoluyla diğer sınıflara geçmezler.
         *
         *
         */

        Tanım tanim = new Tanım();  // özelleştirilmiş yapıcı bir metod var ve varsayılan yapıcı metod tanımlanmamış ise hata alınır.


    }
}
