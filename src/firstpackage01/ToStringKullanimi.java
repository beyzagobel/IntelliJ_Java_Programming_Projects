package firstpackage01;

public class ToStringKullanimi {
    public static void main(String[] args) {

        /*
        4 şekilde toString methodunu kullanabiliiriz
         */

        Integer i=5;
        String s= Integer.toString(i);   // üye method  üzerinden
        System.out.println(s);

        Byte b= 5;
        System.out.println(b.toString());   // üye method üzerinden

        System.out.println(Double.toString(0.34));   // Sarıcı sınıflar üzerinden

        Float f=new Float(0.34f);
        System.out.println(f.toString());

        Short s2=new Short((short)6);
        System.out.println(s2.compareTo(Short.parseShort(s)));   // string olduğu için parse metodu kullanılabilr
        // s2=6 ve s=5 6>6 olduğu için 1 değeri döner


    }
}
