package polimorfizm.ornek1;

public class Animal {
    private String name;
    private String sound;
    private String tur;
    private String infoText;



    Animal (String name,String sound){
        this.name = name ;
        this.sound = sound ;
        this.tur = null ;
        setInfoText(tur);
    }

    Animal (String name, String sound,  String info){
        this.name = name ;
        this.sound = sound ;
        this.tur = info ;
        setInfoText(info);
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public String getInfoText() {
        return infoText;
    }

    public void setInfoText(String info){
        this.infoText = " Benim ismin : " + getName() + " Çıkardığım ses : " + getSound() + " Türüm : " + info ;
    }

    public String animalInfo(){
        return "Hayvan Bilgileri : " + getInfoText() ;
    }
}
