package lista02.exercicio05;

import java.util.Scanner;
import lista02.exercicio04.Imovel;
import lista02.exercicio04.Novo;
import lista02.exercicio04.Velho;

public class TesteEx04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor, adicional, desconto;
        int tipo;
        Imovel im = null;
        do {
            System.out.println("Entre com o tipo do imóvel:");
            System.out.println("1 - Novo");
            System.out.println("2 - Velho");
            System.out.printf("Opção: ");
            tipo = input.nextInt();
        } while (tipo != 1 && tipo != 2);
        switch(tipo) {
            case 1: {
                System.out.printf("Entre com o valor do imóvel novo: ");
                valor = input.nextDouble();
                System.out.printf("Entre com o valor adicional do imóvel novo: ");
                adicional = input.nextDouble();
                im = new Novo(valor, adicional);
                break;
            }
            case 2: {
                System.out.printf("Entre com o valor do imóvel velho: ");
                valor = input.nextDouble();
                System.out.printf("Entre com o valor desconto do imóvel velho: ");
                desconto = input.nextDouble();
                im = new Velho(valor, desconto);
                break;
            }
        }
        im.imprimePreco();
    }

}
