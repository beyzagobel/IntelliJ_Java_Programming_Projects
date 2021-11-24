package sınıflar_ve_nesneler10;

public class StringlerdeEsitlik {
    public static void main(String[] args) {

        String str1 = new String("deneme");
        String str2 = new String("deneme");

        System.out.println(str1 == str2);   // false

        /*
         * str1 == str2 işleminin false çıkmasının nedeni ;
         * == operatörü str1 ve str2 nesnelerinin referans ettiği bellek alanlarının kontrolünü yapar ve
         * bu iki nesne heap de farklı bellek alanlarını referans ettiği için false döndürür.
         * Biz bu iki nesnenin bellek bölgelerini değilde içeriklerinin kontrolünü yapmasını sağlamamız için
         * String() sınıfının heap içinde bulunan String Constant Pool (SCP) 'un intern() metodunu çağırılarak bu iki nesnenin içeriklerini karşılaştırma yaparız.
         */

        String internedString1 = str1.intern();
        String internedString2 = str2.intern();
        System.out.println(internedString1 == internedString2);   // true
    }
}
/*
ÇIKTI :

false
true

 */
