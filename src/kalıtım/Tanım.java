package kalıtım;

public class Tanım {

    /*
     * extends anahtar sözcüğü ile bir sınıf diğer bir sınıftan miras alır.
     * Her sınıf sadece 1 tane sınıftan türeyebilir. Java 'da çoklu kalıtım için interface kullanıılır.
     * Alt sınıf, ata sınıfın private olmayan bütün metod ve değişkenlerine erişebilir.
     * YAPICI METODLAR KALITIMLA AKTARILAMAZ.
     * Gerektiği durumlarda kalıtsal olarak ata sınıftan aktarılan metodlar yeniden alt sınıfta tanımlanabilir (method overriding) FİNAL METODLAR HARİÇ !
     * A, B 'den türemiş ise ; A, B'nin alt sınıfıdır.
     * A -> Subclass
     * B -> Superclass
     * Kalıtım = is - a ilişkisi vardır.
     *
     * Complier, kapalı olarak TÜM YAPICI METODLAR İÇERİSİNE ilk komutta ata sınıfın varsayılan yapıcısını super() çağrısı ile çağırır.
     * Bir yapıcı metod içinde açık olarak super() çağrısı yapılacak ise mutlaka bu çağrı ilk komutta olmalıdır.
     * super() çağrısı, ata sınıfın ilgili yapıcısı ile parametreler bakımından eşleşmelidir.
     * this : Çağrıldığı sınıfı işaret eder. this() : Mevcut sınıfın yapıcısını çağırır.
     *
     * Alt sınıf ata sınıfın private alanlarına erişemez. Private metodlar override edilemez
     bu yüzden ata sıınıftaki private metod alt sınıftada tanımlanırsa  ata sınıf böyle bir sınıfı hiç tanımlamamış gibi değerlendirir.
     * Static metodlar alt sınıfa aktarılır fakat OVERRİDE EDİLEMEZ.
     */

}
