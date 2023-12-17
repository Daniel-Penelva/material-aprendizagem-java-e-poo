package exception.exemplo4.excecao.personalizada;

public class CNPJInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public CNPJInvalidaException() {
		super("CNPJ Inválido!");
	}

}
