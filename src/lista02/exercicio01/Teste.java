package lista02.exercicio01;

public class Teste {
    
    public static void main(String[] args) {
        Assistente a1 = new Assistente();
        a1.setMatricula(1);
        a1.setNome("Teste");
        a1.setSalario(5000);
        a1.informacoes();
        System.out.println();
        
        AssistenteAdministrativo a2 = new AssistenteAdministrativo();
        a2.setMatricula(2);
        a2.setNome("Gustavo");
        a2.setTurno("dia");
        a2.setSalario(850);
        a2.setAdicionalNoturno(150);
        a2.informacoes();
        System.out.println();
        
        AssistenteTecnico a3 = new AssistenteTecnico();
        a3.setMatricula(3);
        a3.setNome("Lopes");
        a3.setSalario(750);
        a3.setBonusSalarial(250);
        a3.informacoes();
        System.out.println();
    }

}
