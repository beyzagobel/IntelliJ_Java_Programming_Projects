package firstpackage;

public class EscapeCharacters {
    public static void main(String[] args) {

        System.out.println("Dersin adı:\'Java Programlama\'");   //  Dersin adı:'Java Programlama'
        System.out.println("Dersin adı:\"Java programlama\"");   //  Dersin adı:"Java programlama"
        System.out.println("Dersin adı:\\Java Programlama\\");   //  Dersin adı:\Java Programlama\
        System.out.println("Dersin adı:\bJava Programlama\b");   //  Dersin adıJava Programlam        BACKSPACE
        System.out.println("Dersin adı:\rJava Programlama\r");   //  Java Programlama                 SATIR BAŞI
        System.out.println("Dersin adı:\tJava Programlama");     // Dersin adı: Java Programlama      TAB BOŞLUK
        System.out.println("Dersin adı:\nJava Programlama\n");   // Dersin adı:                       BİR SATIR AŞAĞI
                                                                 //Java Programlama
        System.out.println("Dersin adı:\fJava Programlama\f");   //  Dersin adı:Java Programlama   FORM
    }
}
