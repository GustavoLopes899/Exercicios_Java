package aula08;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero;
        boolean done = false;
        while (!done) {
            try {
                System.out.printf("Entre com um número: ");
                numero = input.nextDouble();
                double quadrado = pow(numero, 2);
                System.out.printf("Quadrado de %.2f é %.2f\n", numero, quadrado);
                done = true;
            } catch (Exception e) {
                System.err.println("Opa, acho que você se enganou, tente novamente...");
                input.next();
            }
        }
    }

}
