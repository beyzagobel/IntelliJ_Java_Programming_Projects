package polimorfizm.ornek1;

public class Dog extends Animal{

    Dog(String name){
        super(name,"HAv HAv");
        super.setInfoText("Köpek");
    }
    Dog(String name, String tur) {
        super(name,"HAv HAv", tur);
    }

    @Override
    public String animalInfo() {
        return super.animalInfo();
    }
}
