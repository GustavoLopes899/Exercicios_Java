package lista04.exercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir!");
        boolean done = false;
        int x, y;
        while (!done) {
            try {
                System.out.printf("Informe o primeiro valor: ");
                x = teclado.nextInt();
                System.out.printf("Informe o segundo valor: ");
                y = teclado.nextInt();
                double r = (x / y);
                System.out.printf("O resultado da divisão é: %.2f\n", r);
                done = true;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido, tente novamente...");
                teclado.next();
            } catch (ArithmeticException ex) {
                System.out.printf("Não é possível dividir por 0.\n");
            }
        }
    }

}
