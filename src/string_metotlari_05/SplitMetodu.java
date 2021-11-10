package string_metotlari_05;

public class SplitMetodu {
    public static void main(String[] args) {
        // String değerleri verilen parametreye göre parçalara ayırır. parametre olara kalt parçalara ayıracak değeri alır

        String str="Bilgisayar Mühendisligi";

        System.out.println(str.split(" "));  // boşluğu göründe parçala demektir

        System.out.println(str.split("i"));
    }
}
