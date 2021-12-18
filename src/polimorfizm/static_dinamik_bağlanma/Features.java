package polimorfizm.static_dinamik_bağlanma;

public class Features {

    public static void isElectricCar (Car car){
        System.out.println("Car");
    }
    public static void isElektricCar(Car bmw){    // overloading
        System.out.println("BMW");
    }
}
