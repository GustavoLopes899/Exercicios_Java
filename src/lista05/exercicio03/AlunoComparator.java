package lista05.exercicio03;

import java.util.Comparator;

public class AlunoComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Aluno a1 = (Aluno) o1;
        Aluno a2 = (Aluno) o2;
        return a1.getMatricula() - (a2.getMatricula());
    }

}
