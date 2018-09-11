package aula01_vetor;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String args[]) {
        final int tam = 3;
        Scanner input = new Scanner(System.in);
        String names[] = new String[tam];
        for (int i = 0; i < tam; i++) {
            System.out.printf("Enter with a name: ");
            names[i] = input.nextLine();
        }
        for (int i = 0; i < tam; i++) {
            System.out.printf("Name[%d] = %s\n", i, names[i]);
        }
    }
    
}
