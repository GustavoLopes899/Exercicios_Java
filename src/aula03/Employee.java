package aula03;

public class Employee {
    
    private String name;
    private String departament;
    private double salary;
    private String admissionDate;
    private String rg;

    public Employee() {
        
    }

    public void setRaise(double raise) {
        if (raise <= 0) {
            throw new IllegalArgumentException("Incorrect raise.");
        }
        this.salary += raise;
    }
    
    public void annualSalary() {
        System.out.printf("Annual Salary: R$%.2f\n", this.salary * 12);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Incorrect value.");
        }
        this.salary = salary;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

}
