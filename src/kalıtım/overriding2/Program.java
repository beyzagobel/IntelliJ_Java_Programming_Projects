package kalıtım.overriding2;

public class Program {

    public static void main(String[] args) {
        Bisiklet bisiklet = new Bisiklet(2);
        System.out.println("Bisiklet ' in Bilgileri : " + bisiklet.bilgiVer());

        Tasit tasit = new Tasit();
        System.out.println("Taşıt 'ın bilgileri : " + tasit.bilgiVer());

        KaraTasit karaTasit = new KaraTasit(2);
        System.out.println("KaraTaşıt ' ın bilgileri : " + karaTasit.bilgiVer());
    }
}
/*
ÇIKTI :

Bisiklet ' in Bilgileri : Taşıt - KaraTasiti - MotorsuzKaraTaşıtı  - Bisiklet
Taşıt 'ın bilgileri : Taşıt
KaraTaşıt ' ın bilgileri : Taşıt - KaraTasiti

 */