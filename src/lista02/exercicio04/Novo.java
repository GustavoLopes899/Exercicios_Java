package lista02.exercicio04;

public class Novo extends Imovel {

    private double adicional;

    public Novo(double preco, double adicional) {
        super(preco);
        this.adicional = adicional;
        if (adicional <= 0) {
            throw new IllegalArgumentException("Valor incorreto.");
        }
        this.setPreco(this.getPreco() + adicional);
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

}
