package lista02.exercicio01;

public class Assistente extends Funcionario {
    
    private int matricula;
    
    @Override
    public void informacoes() {
        System.out.printf("Número de matricula: %d\n", matricula);
        super.informacoes();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
