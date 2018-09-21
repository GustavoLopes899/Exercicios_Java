package aula12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File f;
        int numero;
        try {
            System.out.printf("Entre com um número inteiro: ");
            numero = input.nextInt();
            String filename = String.format("Tabuada_%d.txt", numero);
            f = new File(filename);
            FileWriter fw = new FileWriter(f);
            if (!f.exists()) {
                f.createNewFile();
                System.out.printf("Arquivo %s criado.\n", f.getName());
            }
            fw.write("Tabuada do número " + numero + ":\n");
            for (int i = 1; i <= 10; i++) {
                String linha = String.format("%d * %d = %d\n", numero, i, numero * i);
                fw.write(linha);
            }
            fw.close();
            System.out.println("Tabuada salva com sucesso!");
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Número inválido.");
        } catch (IOException ex) {
            System.out.println("Arquivo indisponível.");
        }
    }

}
