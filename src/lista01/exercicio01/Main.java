package lista01.exercicio01;

public class Main {
    
    public static void main(String args[]) {
        Empresa emp = new Empresa();
        emp.setNome("Embrapa");
        emp.setCnpj("111.22.44.222\0001");
        
        Departamento d1 = new Departamento();
        d1.setNome("NTI");
        Departamento d2 = new Departamento();
        d2.setNome("SGP");
        Departamento d3 = new Departamento();
        d3.setNome("SIL");
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Gustavo");
        f1.setSalario(1000);
        Funcionario f2 = new Funcionario();
        f2.setNome("Lopes");
        f2.setSalario(2000);
        Funcionario f3 = new Funcionario();
        f3.setNome("Pereira");
        f3.setSalario(3000);
        Funcionario f4 = new Funcionario();
        f4.setNome("da");
        f4.setSalario(4000);
        Funcionario f5 = new Funcionario();
        f5.setNome("Silva");
        f5.setSalario(5000);
        Funcionario f6 = new Funcionario();
        f6.setNome("Teste");
        f6.setSalario(6000);
        
        d1.setFuncionarios(f1);
        d1.setFuncionarios(f2);
        d1.setAumento(0.10);
        
        d2.setFuncionarios(f3);
        d2.setFuncionarios(f4);
        d2.setAumento(0.20);
        
        d3.setFuncionarios(f5);
        d3.setFuncionarios(f6);
        d3.setAumento(0.30);
        
        d1.imprimirFuncionarios();
        d2.imprimirFuncionarios();
        d3.imprimirFuncionarios();
        
        emp.setDeptos(d1);
        emp.setDeptos(d2);
        emp.setDeptos(d3);
        
        emp.imprimeDeptos();
        
    }

}
