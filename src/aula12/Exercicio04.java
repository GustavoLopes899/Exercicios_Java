package aula12;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Agenda agenda = new Agenda();
        System.out.printf("Entre com o nome do contato: ");
        String nome = input.nextLine();
        agenda.lerContatinho(nome);
    }

}
