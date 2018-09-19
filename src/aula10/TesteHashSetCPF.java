package aula10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TesteHashSetCPF {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> cpfs = new HashSet();
        final int tam = 3;
        boolean done;
        for (int i = 0; i < tam; i++) {
            done = false;
            while (!done) {
                System.out.printf("Digite um cpf [%d de %d]: ", i+1, tam);
                String cpf = input.nextLine();
                if (cpf.matches("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}")) {
                    System.out.println("CPF válido");
                    cpfs.add(cpf);
                    done = true;
                } else {
                    System.out.println("CPF inválido, tente novamente...");
                }
            }
        }
        for (String cpf : cpfs) {
            System.out.printf("CPF: %s\n", cpf);
        }
    }

}
