package string_metotlari_05;

public class EqualsIgnoreCaseEqualsOrnek {
    public static void main(String[] args) {

        // String  bir değerin eşitliklerine babalım

        String isim="beyza";

        if(isim.equals("beyza")){
            System.out.println(isim+" kelimesi equals metoduna göre beyza'ya eşittir. ");
        }
        if (isim.equals("BEYZA")){
            System.out.println(isim+" kelimesi equals metoduna göre BEYZA'ya eşittir. ");
        }
        else if(!isim.equals("BEYZA")){
            System.out.println(isim+" kelimesi equals metoduna göre BEYZA'ya eşit değildir. ");

        }
        if(isim.equalsIgnoreCase("BEYZA")){
            System.out.println(isim+" kelimesi equalsIgnoreCase metoduna göre BEYZA'ya eşittir. ");
        }


    }

}

/*
Çıktı :

beyza kelimesi equals metoduna göre beyza'ya eşittir.
beyza kelimesi equals metoduna göre BEYZA'ya eşit değildir.
beyza kelimesi equalsIgnoreCase metoduna göre BEYZA'ya eşittir.

 */
