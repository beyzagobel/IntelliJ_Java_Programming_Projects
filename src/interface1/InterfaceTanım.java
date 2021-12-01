package interface1;

public interface InterfaceTanım {

    int degisken = 5  ; // değişkenler tanımladığı yerde ilk ataması yapılmalıdır. public static final özelliktedir yazmaya gerek yoktur.

    double metod();  // metodlar bu şeklide gövdesiz olarak tanımlanır. implement edilen sınıf tarafından gövdelenir.


    /*
     * Javada çoklu kalıtım interface (arayüz) ler ile sağlanır.
     * Tanımlı olan bütün değişkenler public, static ve final 'dır. Yani sabit (constant) yapıdadır.
     * BÜTÜN METDOLAR PUBLİC VE ABSTACT 'TIR. Private veya protected olamazlar.
     * Metodların gövdesi boştur. (abstract / gövdesiz metod)
     * Interface 'i implemente eden somut sınıflar, interface'deki bütün metodları tanımlamalıdı yani gövdeli hale getirmelidir.
     * Interface 'ler birbirinden türeyebilir.
     * Interface 'deki değişlenlere Interface.degişken_adi yada direk degisken_adi şeklinde erişebiliriz static değişkenler olduğu için.
     *
     */

}
