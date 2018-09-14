package lista02.exercicio04;

public class Imovel {
    
    private String endereco;
    private double preco;
    
    public Imovel(double preco) {
        this.preco = preco;
    }
    
    public void imprimePreco() {
        System.out.printf("Valor do imovel: R$%.2f\n", this.getPreco());
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
