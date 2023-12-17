package exception.exemplo3.excecao.personalizada;

public class ExemploExcecaoPersonalizada {
	public static void main(String[] args) {
		
		try {
			validarIdade(-5);
			
		} catch (ValidacaoException e) {
			System.out.println("Erro de valida��o: " + e.getMessage());
		}
	}

	public static void validarIdade(int idade) throws ValidacaoException {
		if (idade < 0) {
			throw new ValidacaoException("A idade n�o pode ser negativa");
		}
		// L�gica adicional de valida��o
	}
}

//Criando classe de uma Exce��o de Valida��o
@SuppressWarnings("serial")
class ValidacaoException extends Exception {

	public ValidacaoException(String mensagem) {
		super(mensagem);
	}
}

/* Criando uma Exce��o de Valida��o (ValidacaoException)
 * Neste exemplo, ValidacaoException � uma classe de exce��o personalizada que estende Exception. O m�todo validarIdade lan�a essa exce��o se a idade 
 * fornecida for negativa.*/
