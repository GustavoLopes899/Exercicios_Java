package lista05.exercicio05;

import lista05.exercicio03.Aluno;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMapaAluno {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Aluno> mapa = new HashMap();
        Aluno a1 = new Aluno(1, "Gustavo", "Computação", 6.6);
        Aluno a2 = new Aluno(2, "Ricardo", "Biologia", 9.5);
        Aluno a3 = new Aluno(3, "Júlia", "Ed. Física", 5.3);
        Aluno a4 = new Aluno(4, "Roberta", "Filosofia", 4.7);
        Aluno a5 = new Aluno(5, "Guilherme", "Matemática", 7.2);
        mapa.put(a1.getMatricula(), a1);
        mapa.put(a2.getMatricula(), a2);
        mapa.put(a3.getMatricula(), a3);
        mapa.put(a4.getMatricula(), a4);
        mapa.put(a5.getMatricula(), a5);
        System.out.printf("Entre com a matrícula de um aluno: ");
        int matricula = input.nextInt();
        if (mapa.containsKey(matricula)) {
            Aluno temp = mapa.get(matricula);
            temp.informacoes();
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }

}
