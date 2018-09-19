package lista05.exercicio03;

public class Exercicio03 {
    
    public static void main(String[] args) {
        CadastroAluno c = new CadastroAluno();
        Aluno a1 = new Aluno(1, "Gustavo", "Computação", 6.6);
        Aluno a2 = new Aluno(2, "Ricardo", "Biologia", 9.5);
        Aluno a3 = new Aluno(3, "Júlia", "Ed. Física", 5.3);
        Aluno a4 = new Aluno(4, "Roberta", "Filosofia", 4.7);
        Aluno a5 = new Aluno(5, "Guilherme", "Matemática", 7.2);
        
        c.adicionarAluno(a2);
        c.adicionarAluno(a5);
        c.adicionarAluno(a1);
        c.adicionarAluno(a3);
        c.adicionarAluno(a4);
        
        c.ordenarAlunos();
        c.imprimirAlunos();
    }

}
