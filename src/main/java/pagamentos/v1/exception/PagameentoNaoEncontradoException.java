package pagamentos.v1.exception;

public class PagameentoNaoEncontradoException extends EntidadeNaoEncotrada {

    private static final long serialVersionUID = 5056511497878114311L;

    public PagameentoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }

    public PagameentoNaoEncontradoException(Long produtoId) {
        this(String.format("O Produto com o codigo %d não foi encontrada", produtoId));
    }
}
