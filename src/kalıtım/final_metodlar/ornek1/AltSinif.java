package kalıtım.final_metodlar.ornek1;

public class AltSinif extends AtaSinif {

    public int i = 3 ;

    // public void yaz(){}  //yapılamaz çünkü FİNAL METODLAR OVERRİDE EDİLEMEZ

    public void yaz(String s){}  // parametresi olduğu için artık bu başka bir metoddur o yüzden hata vermez

    public static void main(String[] args) {

        AltSinif altSinif = new AltSinif();
        System.out.println(altSinif.i);
    }
}
