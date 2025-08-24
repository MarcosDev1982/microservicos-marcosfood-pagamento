package pagamentos.v1.exception;

public class NegocioExcepetion extends RuntimeException {

    private static final long serialVersionUID = 7211091583257941155L;

    public NegocioExcepetion(String mensagem) {
        super(mensagem);
    }

    public NegocioExcepetion (String mensagem, Throwable causa){
        super(mensagem, causa);
    }

}
