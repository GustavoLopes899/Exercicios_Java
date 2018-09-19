package lista05.exercicio03;

public class Aluno {

    private int matricula;
    private String nome;
    private String curso;

    public Aluno(int matricula, String nome, String curso, double ira) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.ira = ira;
    }
    
    public void informacoes() {
        System.out.printf("Matricula: %d\n", this.getMatricula());
        System.out.printf("Nome: %s\n", this.getNome());
        System.out.printf("Curso: %s\n", this.getCurso());
        System.out.printf("IRA: %.2f\n", this.getIra());
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getIra() {
        return ira;
    }

    public void setIra(double ira) {
        this.ira = ira;
    }
    private double ira;

}
