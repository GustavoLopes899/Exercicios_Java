package aula01_vetor;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        final int tam = 3;
        Scanner input = new Scanner(System.in);
        int age[] = new int[tam];
        float average = 0;
        for (int i = 0; i < tam; i++) {
            System.out.printf("Enter with age: ");
            age[i] = input.nextInt();
        }
        for (int i = 0; i < tam; i++) {
            average += age[i];
        }
        average = average/tam;
        System.out.printf("Average age: %.2f\n", average);
    }

}
