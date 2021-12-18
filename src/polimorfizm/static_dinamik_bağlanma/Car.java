package polimorfizm.static_dinamik_bağlanma;

public class Car {

    public String getCarBrand(String name){   // overriding
        return name;
    }

    public String getCarBrand(String name, int year){    // overloading
        return name + " " + year ;
    }
}
