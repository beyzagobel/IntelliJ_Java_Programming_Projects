package polimorfizm.ornek1;

public class Main {

    public static void main(String[] args) {

        Animal dog1 = new Dog("Hardal");
        Animal dog2 = new Dog("Karabaş","Kangal");

        Animal cat1 = new Cat("Tekir");
        Animal cat2 = new Cat("Minnoş","Van Kedisi");

        System.out.println(dog1.animalInfo());
        System.out.println(dog2.animalInfo());

        System.out.println(cat1.animalInfo());
        System.out.println(cat2.animalInfo());


    }

}

/*
Çıktı :

Hayvan Bilgileri :  Benim ismin : Hardal Çıkardığım ses : HAv HAv Türüm : Köpek
Hayvan Bilgileri :  Benim ismin : Karabaş Çıkardığım ses : HAv HAv Türüm : Kangal
Hayvan Bilgileri :  Benim ismin : Tekir Çıkardığım ses : Miyav Türüm : Kedi
Hayvan Bilgileri :  Benim ismin : Minnoş Çıkardığım ses : Miyav Türüm : Van Kedisi

 */
