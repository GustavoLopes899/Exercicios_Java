package lista05.exercicio03;

import java.util.ArrayList;
import java.util.Collections;

public class CadastroAluno {

    private ArrayList<Aluno> alunos = new ArrayList();

    public void adicionarAluno(Aluno aluno) {
        if (aluno != null) {
            this.alunos.add(aluno);
        } else {
            System.out.println("Aluno inválido!");
        }
    }

    public void ordenarAlunos() {
        AlunoComparator c = new AlunoComparator();
        Collections.sort(alunos, c);
    }
    
    public void imprimirAlunos() {
        for (Aluno a : alunos) {
            a.informacoes();
        }
    }

}
