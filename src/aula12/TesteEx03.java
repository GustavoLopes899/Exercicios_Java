package aula12;

import java.util.Scanner;

public class TesteEx03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Agenda agenda = new Agenda();
        boolean acabou = false;
        while (!acabou) {
            agenda.addContatinho();
            System.out.printf("Deseja adicionar outro contato? Digite (nao) para finalizar ou ENTER para continuar: ");
            String resposta = input.nextLine();
            if(resposta.equalsIgnoreCase("nao")) {
                acabou = true;
            }
        }
        agenda.ordenarLista();
        agenda.salvarLista();
    }

}
