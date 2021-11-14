package sınıflar_ve_nesneler10;

import java.util.Objects;

public class NesnelerdeEsitlik {

    public String cpu;
    public String memory;
    public  String disk;
    public String ekran;

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return  true;
        if(obj == null || getClass() != obj.getClass()) return false ;

        NesnelerdeEsitlik diger = (NesnelerdeEsitlik) obj ;
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
         * Normalde override edilmemeiş equals metodu nesneler üzerinde referans karşılaştırması yapar.
         * Bu metod override edilerek sınıfın tüm alanları(fields) üzerinde eşitlik şartı aranır.
         * Object sınıfında bulunan hashCode metodu ise ilgili nesneye yönelk hash temelli tekil bir değer üretir.
         * Nesne eşitlik kontrolü yapılırken hem equals hem de hashCode metodları override edilmesi gerekir.
         */

        NesnelerdeEsitlik  b1 = new NesnelerdeEsitlik();
        b1.cpu ="A";
        b1.memory ="B";
        b1.disk ="C";
        b1.ekran ="D";

        NesnelerdeEsitlik b2 = new NesnelerdeEsitlik();
        b2.cpu = "A";
        b2.memory = "B";
        b2.disk = "C";
        b2.ekran = "D";

        System.out.println(b1.equals(b2));    // true


    }
}
