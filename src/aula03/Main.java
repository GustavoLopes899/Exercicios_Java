package aula03;

public class Main {
    
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Gustavo");
        e.setDepartament("NTI");
        e.setAdmissionDate("01/08/2018");
        e.setRg("477407912");
        e.setSalary(521.01);
        e.setRaise(1000);
        e.annualSalary();
    }

}
