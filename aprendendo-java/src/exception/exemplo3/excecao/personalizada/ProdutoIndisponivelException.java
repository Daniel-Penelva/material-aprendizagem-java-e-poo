package exception.exemplo3.excecao.personalizada;

@SuppressWarnings("serial")
public class ProdutoIndisponivelException extends RuntimeException {
	
	public ProdutoIndisponivelException(String mensagem) {
		super(mensagem);
	}
}