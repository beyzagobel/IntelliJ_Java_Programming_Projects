package kalıtım.ornek5;

public class Siyam extends Kedi{

    public Siyam(int param){  // 1
        super(param+1);    // 2 ile üst sınıfın yapıcısına gidilir
        System.out.println("Siyam yapıcısı , param : " + param);
    }

    public static void main(String[] args) {

        Siyam siyam = new Siyam(1);
    }
}

/*
ÇIKTI :

Hayvan yapıcısı , param : 3
Kedi yapıcısı , param : 2
Siyam yapıcısı , param : 1


 */