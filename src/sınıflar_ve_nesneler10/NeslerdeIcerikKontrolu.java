package sınıflar_ve_nesneler10;

import java.util.Objects;

public class NeslerdeIcerikKontrolu {

    private String cpu;
    private String memory;
    private  String disk;
    private String ekran;

    /*
     Override Edilmemiş equals() metodu :

     public boolean equals (Object obj){
          return (this == obj) ;
     }

     */

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return  true;
        if(obj == null || getClass() != obj.getClass()) return false ;
        NeslerdeIcerikKontrolu diger = (NeslerdeIcerikKontrolu) obj ;
        return Objects.equals(cpu,diger.cpu) &&
                Objects.equals(memory,diger.memory) &&
                Objects.equals(disk,diger.disk) &&
                Objects.equals(ekran,diger.ekran) ;

    }

    @Override
    public int hashCode() {
        return  Objects.hash(cpu,memory,disk,ekran);
    }

    public static void main(String[] args) {

        /*
         * Nesnelerde nesnesinin referansını değilde içerik eşitliğini kontrolü için Object sınıfında sunulan equals metodu override edilmelidir.
         * Normalde override edilmememiş equals metodu nesneler üzerinde referans karşılaştırması yapar.
         * Bu metod override edilerek sınıfın tüm alanları(fields) üzerinde eşitlik şartı aranır.
         * Object sınıfında bulunan hashCode metodu ise ilgili nesneye yönelk hash temelli tekil bir değer üretir.
         * Nesne eşitlik kontrolü yapılırken hem equals hem de hashCode metodları override edilmesi gerekir.
         */

        NeslerdeIcerikKontrolu b1 = new NeslerdeIcerikKontrolu();
        b1.cpu ="A";
        b1.memory ="B";
        b1.disk ="C";
        b1.ekran ="D";

        NeslerdeIcerikKontrolu b2 = new NeslerdeIcerikKontrolu();
        b2.cpu = "A";
        b2.memory = "B";
        b2.disk = "C";
        b2.ekran = "D";

        // iki nesnenin = operatörü ile aynı belleğe ataması yapılmadan referanslarının değilde içeriklerinin kontrolü sağlanır.

        System.out.println(b1.equals(b2));    // true


    }
}
