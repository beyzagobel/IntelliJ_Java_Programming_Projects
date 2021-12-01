package abstractsiniflar.gercek_hayat_ornek;

public class FirstFirmEmployee extends Employee{

    private static final int Const_Ales = 2 ;
    private static final float Const_Uni = 0.3f ;
    private static final int Const = 10000 ;

    @Override
    public float calculateSalary() {
        return Const * (Const_Ales * Const_Uni) ;
    }

    public static void main(String[] args) {
        FirstFirmEmployee firstFirmEmployee = new FirstFirmEmployee();
        firstFirmEmployee.setId(1);
        firstFirmEmployee.setName("Beyza");
        firstFirmEmployee.setSurname("Gobel");
        firstFirmEmployee.setJobtitle("Java Developer");

        System.out.println(firstFirmEmployee.getName() + " " + firstFirmEmployee.getSurname());
        System.out.println(firstFirmEmployee.getJobtitle());
        System.out.println(firstFirmEmployee.calculateSalary() + " $ ");
    }
}
