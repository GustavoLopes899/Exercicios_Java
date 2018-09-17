package lista03.exercicio01;

import java.util.Scanner;

public class TesteEx01 {
    
    final static int tam = 3;
    
    public static void main(String[] args) {
        AreaCalculavel forma[] = new AreaCalculavel[tam];
        Scanner input = new Scanner(System.in);
        int opcao;
        for (int i = 0; i < tam; i++) {
            do {
                System.out.println("Qual forma você deseja criar?");
                System.out.println("1 - Círculo");
                System.out.println("2 - Quadrado");
                System.out.println("3 - Retângulo");
                System.out.printf("Opção: ");
                opcao = input.nextInt();
            } while (opcao < 0 || opcao > 3);
            switch (opcao) {
                case 1: {
                    double raio;
                    do {
                        System.out.printf("Qual o valor do raio: ");
                        raio = input.nextDouble();
                    } while (raio < 0);
                    forma[i] = new Circulo(raio);
                    break;
                }
                case 2: {
                    double lado;
                    do {
                        System.out.printf("Qual o valor do lado do quadrado: ");
                        lado = input.nextDouble();
                    } while (lado < 0);
                    forma[i] = new Quadrado(lado);
                    break;
                }
                case 3: {
                    double altura, base;
                    do {
                        System.out.printf("Qual o valor da altura do retângulo: ");
                        altura = input.nextDouble();
                        System.out.printf("Qual o valor da base do retângulo: ");
                        base = input.nextDouble();
                    } while (altura < 0 || base < 0);
                    forma[i] = new Retangulo(altura, base);
                    break;
                }
            }
        }
        for (int i = 0; i < tam; i++) {
            forma[i].calcularArea();
        }
    }

}
