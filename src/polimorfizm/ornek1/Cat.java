package polimorfizm.ornek1;

public class Cat extends  Animal{


    Cat(String name){
        super(name,"Miyav");
        super.setInfoText("Kedi");
    }
    Cat(String name, String tur) {
        super(name,"Miyav", tur);
    }

    @Override
    public String animalInfo() {
        return super.animalInfo();
    }
}
