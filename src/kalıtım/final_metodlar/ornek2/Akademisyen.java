package kalıtım.final_metodlar.ornek2;

public class Akademisyen extends  Insan{

    public String yuru(){  // yazılabilir çünkügeri dönüş tipi farklıdır override işlemi değildir

        System.out.println("Akademisye.yuru çağrıldı. ");
        return "Akademisye.yuru çağrıldı. ";
    }
}
