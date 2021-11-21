package java_programlamaya_giris_01;

public class StackHeapOrnek {

    /*
     * Stack : Metodlar ve yerek primitive değişkenler bu bellek bölgesined tutulur.
     * Heap : Nesneler ve global değişkenler bu bellek bölgesinde tutulur.

     ÖRNEK :
     * sayi1 , sayi2 , sayi3 , carpan , t , nesne1 değişkenlerinin hangi bellek bölgelesinde tutulur? Açıklayınız.
     */

    int sayi1;

    StackHeapOrnek nesne1 = new StackHeapOrnek();

    public void carp(int  sayi2){
        int sayi3=sayi2*2;
    }

    public void carp(double carpan, StackHeapOrnek t){

    }



}

/*
 * sayi1  : sınıf seviyesinde tanımlandığı için GLOBAL DEĞİŞKEN bu yüzden de HEAP de tutulur.
 * sayi2  : metod değişkeni olduğu için STACK de tutulur.
 * sayi3  : metod içinde tanımlandığı için STACK de tutulur.
 * carpan : metod değişkeni olduğu için STACK de tutulur.
 * t      : BellekBolgesi2 sınıfından doğma bir değişken olduğu için referansı stack de, değeri HEAP de tutulur.
 * nesne1 : tüm nesneler HEAP de tutulur.
 */





