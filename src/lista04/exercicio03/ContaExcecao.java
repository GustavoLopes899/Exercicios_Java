package lista04.exercicio03;

public class ContaExcecao extends Exception {
    
    @Override
    public String getMessage() {
        return "Saldo insuficiente";
    }
    
}
