package string_metotlari;

public class StringDizisiEkranaYazdırma {
    public static void main(String[] args) {
        String str="Programlama";

        for(int i=0;i<=str.lastIndexOf('a');i++){
            System.out.println(str.charAt(i));
        }

        for(int i=0;i<=str.length()-1;i++){   // length 1'den başladığı için ve charAt metodu 0'dan başladığı için 1 çıkarılır
            System.out.println(str.charAt(i));
        }

        // iki for döngüsüde aynı işlemi yapmaktadır.
    }
}
