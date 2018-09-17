package aula08;

public class SaldoException extends Exception {
    
    @Override
    public String getMessage() {
        return "Erro no valor inserido, tente novamente.";
    }

}
