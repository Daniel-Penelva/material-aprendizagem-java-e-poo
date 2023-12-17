package exception.exemplo3.excecao.personalizada;

@SuppressWarnings("serial")
public class SenhaInvalidaException extends Exception {

	public SenhaInvalidaException(String mensagem) {
		super(mensagem);
	}

}