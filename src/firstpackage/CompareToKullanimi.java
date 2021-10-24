package firstpackage;

public class CompareToKullanimi {
    public static void main(String[] args) {
        // Integer tipindeki nesneleri karşılaştırır.
        // karşılaştırdığımız veri eldeki veriden büyükse -1, eşitse 0, küçükse 1 basar ekrana

        Integer i=5;
        System.out.println(i.compareTo(4));
        System.out.println(i.compareTo(5));
        System.out.println(i.compareTo(6));

        System.out.println(Integer.compare(2,4));
        System.out.println(Integer.compare(5,1));

    }
}
