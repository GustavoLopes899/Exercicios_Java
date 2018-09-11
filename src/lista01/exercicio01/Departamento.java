package lista01.exercicio01;

public class Departamento {

    private int codigoFunc;
    private String nome;
    private Funcionario funcionarios[];

    public Departamento() {
        this.funcionarios = new Funcionario[100];
        this.codigoFunc = 0;
    }

    public void setAumento(double aumento) {
        for (Funcionario func : funcionarios) {
            if (func != null) {
                func.setSalario(func.getSalario() + func.getSalario() * aumento);
            } else {
                break;
            }
        }
    }

    public void imprimirFuncionarios() {
        System.out.printf("Funcionários do departamento: %s\n", this.getNome());
        for (int i = 0; i < this.getFuncionarios().length; i++) {
            if (this.funcionarios[i] != null) {
                System.out.printf("Código: %d\n", i);
                System.out.printf("Nome: %s\n", this.funcionarios[i].getNome());
                System.out.printf("Salário: R$%.2f\n", this.funcionarios[i].getSalario());
            } else {
                break;
            }
            System.out.println();
        }
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario funcionarios) {
        this.funcionarios[this.codigoFunc] = funcionarios;
        this.codigoFunc++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
