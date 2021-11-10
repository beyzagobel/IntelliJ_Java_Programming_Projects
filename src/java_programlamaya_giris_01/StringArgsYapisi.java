package java_programlamaya_giris_01;

public class StringArgsYapisi {
    public static void main(String[] args) {

         /* COMMAND LİNE ARGUMENTS
        * Java'da args, yani main metodunun tipi olan, sağlanan komut satırı argümanlarını, String nesnelerinin tek boyutlu bir dizisidir.
        * Bir derleyici adıdır, herhangi bir şey olabilir.
        *  terminaldeki programa yazılabilen, bir boşlukla ayrılmış bir Dizeler topluluğudur.
        * String, Java, int, long, float, double, byte, shot, char gibi tüm ilkel veri tiplerini destekleyen veri türüdür.

        *  Bu String tipindeki args dizisine eleman eklemek istersek;
        *   1-Run > Edit Configurations > Program arguments > kısmına verilerimizi yazabiliriz.

         */

        // Örnek 1:  kamut satırı argümanlarıma; 1 2 0.5 8 0.35 verdim
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }  // bu şekilde döngü ile her türlü args dizisinin elamanlarını yazdırabiliriz veya tek bir indexe erişim için;

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        System.out.println(args[4]);

        /*
       * Komut satırına yazılan her parametre String tipindedir.
       * Eğer ki tip dönüşümü yapmak istersek String sınıfının parse metodu kullanılarak tip dönüşümü yapılabilir.
         */

        // öRNEK 2: kamut satırı argümanlarıma; 1 2 0.5 8 0.35 verdim

        System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));         // 3
        System.out.println(Float.parseFloat(args[1])+Float.parseFloat(args[2]));         // 2.5
        System.out.println(Double.parseDouble(args[2])+Double.parseDouble(args[4]));     // 0.85




    }
}
