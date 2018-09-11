package lista01.exercicio01;

public class Empresa {

    private String nome;
    private int codidoDepto;
    private String cnpj;
    private Departamento deptos[];

    public Empresa() {
        this.deptos = new Departamento[10];
        this.codidoDepto = 0;
    }

    public void setDeptos(Departamento depto) {
        this.deptos[codidoDepto] = depto;
        codidoDepto++;
    }
    
    public void imprimeDeptos() {
        System.out.printf("Departamentos da empresa %s\n", this.getNome());
        for(int i = 0; i < this.deptos.length; i++) {
            if (this.deptos[i] != null) {
                System.out.printf("Código: %d\n", i);
                System.out.printf("Nome: %s\n", this.deptos[i].getNome());
            } else {
                break;
            }
            System.out.println();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Departamento[] getDeptos() {
        return deptos;
    }

}
