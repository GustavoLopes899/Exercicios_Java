package aula01_matriz;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        final int tam = 3;
        Scanner input = new Scanner(System.in);
        int matrix[][] = new int[tam][tam];
        int even = 0, odd = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Enter with a value to matrix[%d][%d] = ", i, j);
                matrix[i][j] = input.nextInt();
                if (matrix[i][j]%2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

}
