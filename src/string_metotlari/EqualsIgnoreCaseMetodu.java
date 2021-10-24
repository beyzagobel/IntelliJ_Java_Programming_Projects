package string_metotlari;

public class EqualsIgnoreCaseMetodu {
    public static void main(String[] args) {
        // equals gibi eşitlik kontrolü yapar farkları
        // BÜYÜK-KÜÇÜK HARFE DUYARLI DEĞİLDİR.

        String s1="Beyza";
        String s2="beyZa";
        System.out.println(s1.equals(s2));  // FALSE
        System.out.println(s1.equalsIgnoreCase(s1));  // TRUE
    }
}
