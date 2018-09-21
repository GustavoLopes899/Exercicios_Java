package aula12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Agenda {

    private ArrayList<Contatinho> agenda = new ArrayList();
    private final String filename = "agenda.txt";
    private File f = new File(filename);

    public void addContatinho() throws ContatinhoException {
        Scanner input = new Scanner(System.in);
        Contatinho c = new Contatinho();
        String nome, email, telefone, categoria;
        System.out.println("Entre com os dados do contato:");
        System.out.printf("Nome: ");
        c.setNome(nome = input.nextLine());
        if (nome.contains("#")) {
            throw new ContatinhoException();
        }
        System.out.printf("Email: ");
        c.setEmail(email = input.nextLine());
        if (email.contains("#")) {
            throw new ContatinhoException();
        }
        System.out.printf("Telefone: ");
        c.setTelefone(telefone = input.nextLine());
        if (telefone.contains("#")) {
            throw new ContatinhoException();
        }
        System.out.printf("Categoria: ");
        c.setCategoria(categoria = input.nextLine());
        if (categoria.contains("#")) {
            throw new ContatinhoException();
        }
        this.agenda.add(c);
    }

    public void lerContatinho(String nome) {
        FileReader fr;
        BufferedReader br;
        String dados;
        Contatinho c;
        if (!f.exists()) {
            System.out.println("Não foi possível abrir o arquivo da agenda.");
            return;
        }
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while((dados = br.readLine()) != null) {
                if(dados.toLowerCase().startsWith(nome.toLowerCase())) {
                    String[] contato = dados.split("#");
                    c = new Contatinho();
                    c.setNome(contato[0]);
                    c.setEmail(contato[1]);
                    c.setTelefone(contato[2]);
                    c.setCategoria(contato[3]);
                    c.informacoes();
                    return;
                }
            }
            System.out.println("Contato não encontrado!");
        } catch (IOException ex) { 
            System.out.println("Erro ao abrir o arquivo.");
        }
    }

    public void ordenarLista() {
        ContatinhoComparator c = new ContatinhoComparator();
        Collections.sort(agenda, c);
        for (Contatinho cont : this.agenda) {
            cont.informacoes();
        }
    }

    public void salvarLista() {
        FileWriter fw;
        try {
            if (!f.exists()) {
                f.createNewFile();
                System.out.printf("Arquivo %s criado com sucesso!\n", f.getName());
            }
            fw = new FileWriter(f);
            for (Contatinho c : this.agenda) {
                fw.write(c.getNome() + "#" + c.getEmail() + "#" + c.getTelefone() + "#" + c.getCategoria() + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            System.out.println("Erro ao acessar/criar o arquivo!");
        }
    }

}
