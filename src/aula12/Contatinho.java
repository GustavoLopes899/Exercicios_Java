package aula12;

public class Contatinho {
    
    private String nome, email, telefone, categoria;
    
    public void informacoes() {
        System.out.printf("Nome: %s\n", this.getNome());
        System.out.printf("Email: %s\n", this.getEmail());
        System.out.printf("Telefone: %s\n", this.getTelefone());
        System.out.printf("Categoria: %s\n", this.getCategoria());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
