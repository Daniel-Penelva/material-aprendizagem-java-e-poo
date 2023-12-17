package exception.exemplo4.excecao.personalizada;

public class CPFInvalidaException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public CPFInvalidaException() {
		super("CPF inválido!");
	}

}
