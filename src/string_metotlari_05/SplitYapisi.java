package string_metotlari_05;

public class SplitYapisi {
    public static void main(String[] args) {
        String str= "bilgisayar mühendisliği";
        String[] str2 = str.split("i");

        for(String s : str2){  // for each yapısı
            System.out.println(s);
        }
    }
}
