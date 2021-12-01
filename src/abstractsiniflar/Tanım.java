package abstractsiniflar;

public abstract class Tanım {

    /*
     * Abstract(soyut) sınıflardan nesne türetilemez.
     * Değişkenler ve gövdeli metodlar veya abstract (gövdesiz) metodşar barındırabilirler.
     * Soyut sınıflardan türeyen sınıfların soyut olmaması için bütün gövdesiz metodlar gövdeli hale getirilmelidir.
     * Java'da bir sınıf içerisinde abstract metod var ise o sınıf abstract sınıf olmak zorundadır.
     * Abstract bir metot oluşturularak her sınıf içerisinde bu metot farklı işlemleri yapacak şekilde tasarlanmıştır.
     * Aslında biz abstraction class tanımlayarak bu sınıfı extends eden sınıfların neleri @override etmesi gerektiği bilgisini vermiş olduk.
     * Abstraction ile esnek ve rahatlıkla değiştirilebilir kodlar yazılabilir.
     *  Kod tekrarlarının önüne geçileceği için ve her sınıfa özelleştirilmiş metotlar oluşturulabileceği için kolay projeler ortaya çıkacaktır.
     * Abstact sınıflar ve abstract metodlar “private” olarak tanımlanamazlar ama “public” ve “protected” olarak tanımlanabilirler.
     */

     abstract void deneme();
     public abstract void deneme2();
     protected abstract void deneme3();
    // private abstract void deneme4();   HATA! PRİVATE OLAMAZLAR

}
