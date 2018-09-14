package lista02.exercicio05;

import lista02.exercicio02.Cachorro;
import lista02.exercicio02.Gato;
import lista02.exercicio02.Miseravel;
import lista02.exercicio02.Pobre;
import lista02.exercicio02.Rica;

public class TesteEx02 {
    
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Totó");
        System.out.println(cachorro.caminha());
        System.out.println(cachorro.late());
        
        Gato gato = new Gato("Bella");
        System.out.println(gato.caminha());
        System.out.println(gato.mia());
        System.out.println();
        
        Rica rica = new Rica();
        Pobre pobre = new Pobre();
        Miseravel miseravel = new Miseravel();
        
        rica.fazCompras();
        pobre.trabalha();
        miseravel.mendiga();
        
        
    }

}
