package aula05;

public class CamaroteInferior extends Vip implements InterfaceIngresso {

    private String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public void tipoIngresso() {
        System.out.println("Ingresso camarote inferior");
    }

}
