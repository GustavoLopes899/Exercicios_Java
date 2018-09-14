package lista02.exercicio05;

import lista02.exercicio01.AssistenteAdministrativo;
import lista02.exercicio01.AssistenteTecnico;

public class TesteEx01 {
    
    public static void main(String[] args) {
        AssistenteAdministrativo aa = new AssistenteAdministrativo();
        aa.setNome("Gustavo");
        aa.setMatricula(1251);
        System.out.printf("Nome: %s\nMatricula: %d\n", aa.getNome(), aa.getMatricula());
        
        System.out.println();
        
        AssistenteTecnico at = new AssistenteTecnico();
        at.setNome("Júlio");
        at.setMatricula(625);
        System.out.printf("Nome: %s\nMatricula: %d\n", at.getNome(), at.getMatricula());
    }

}
