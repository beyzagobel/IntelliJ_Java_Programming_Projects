package abstractsiniflar.gercek_hayat_ornek;

public class SecondFirmEmployee extends Employee{
    private static final int CONST_ALES = 2;
    private static final int CONST = 10000;

    @Override
    public float calculateSalary() {
        return CONST * (CONST_ALES * 0.75f);
    }

    public static void main(String[] args) {
        SecondFirmEmployee firstFirmEmployee = new SecondFirmEmployee();
        firstFirmEmployee.setId(1);
        firstFirmEmployee.setName("Ahsen");
        firstFirmEmployee.setSurname("Demir");
        firstFirmEmployee.setJobtitle("JavaScript Uzmanı");

        System.out.println(firstFirmEmployee.getName()+ " " + firstFirmEmployee.getSurname());
        System.out.println(firstFirmEmployee.getJobtitle());
        System.out.println(firstFirmEmployee.calculateSalary() + "₺");
    }


}
