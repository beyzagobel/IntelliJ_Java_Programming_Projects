package string_metotlari_05;

public class SubStringMetodu {
    public static void main(String[] args) {
        // string i belirtilen indexxlerdeki parçalara böler
        //str.substring(int beginIndex)  beginIndex den sonraki karakter kümesini alır
        // ya da str.subString(int beginIndex,endIndex) ilk parameterden son parametreye kadarki karakter kümesini alır

        String str="merhaba ben beyza göbel";
        System.out.println(str.substring(4)); // 4. index dahil sonraki tüm karakterler    // aba ben beyza göbel

        System.out.println(str.substring(4,8));  // 4.index dahil 8. index dahil değil   // aba
        System.out.println(str.substring(4,9));  // 4.index dahil 9. index dahil değil   // aba b

        String s1="Adana";
        String s2="ana";
        s1=s1.substring(2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);    //NEDEN FALSE ????

    }
}
