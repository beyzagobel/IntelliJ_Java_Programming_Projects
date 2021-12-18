package polimorfizm.static_dinamik_bağlanma;

public class Main {

    public static void main(String[] args) {

        Car car = new Car() ;
        Car bmw = new BMW();  // polimorfizm  her bmw bir car 'dır.

        System.out.println(car.getCarBrand("mercedes"));
        System.out.println(car.getCarBrand("ford",1960));
        System.out.println(bmw.getCarBrand("bmw"));

        Features.isElectricCar(car);
        Features.isElektricCar(bmw);


    }
}
