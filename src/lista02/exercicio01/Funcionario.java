package lista02.exercicio01;

public class Funcionario {

    private String nome;
    private double salario;

    public void addAumento(double aumento) {
        if (aumento <= 0) {
            throw new IllegalArgumentException("Valor incorreto.");
        }
        this.salario += aumento;
    }

    public double ganhoAnual() {
        double ganhoAnual = 12 * this.salario;
        return ganhoAnual;
    }

    public void informacoes() {
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Salário: R$%.2f\n", this.salario);
        System.out.printf("Ganho anual: R$%.2f\n", this.ganhoAnual());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
