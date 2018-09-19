package lista05.exercicio04;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ConjuntoDePalavras {

    private Set<String> set = new HashSet();

    public void inserePalavras() {
        Scanner input = new Scanner(System.in);
        String s;
        while (true){
            System.out.printf("Digite a palavra a ser adicionada (ou digite 0 para finalizar): ");
            s = input.nextLine();
            if (s.equals("0")) {
                break;
            }
            this.set.add(s);
        }
    }

    public boolean contemTodas(String s) {
        boolean contem = false;
        int i = 0;
        String split[] = s.split(" ");
        for (String ss : split) {
            i++;
            if (!this.getSet().contains(ss)) {
                return contem;
            }
        }
        if (i == this.getSet().size()) {
            contem = true;
        }
        return contem;
    }

    public Set<String> getSet() {
        return set;
    }
    
}
