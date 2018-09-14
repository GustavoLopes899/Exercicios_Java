package lista02.exercicio04;

public class Velho extends Imovel {
    
    private double desconto;
    
    public Velho(double preco, double desconto) {
        super(preco);
        if (desconto <= 0) {
            System.out.println("Valor incorreto.");
        } else {
            this.setPreco(this.getPreco() - desconto);
        }
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

}
