package exception.exemplo3.excecao.personalizada;

public class ExemploExcecaoPersonalizada {
	public static void main(String[] args) {
		
		try {
			validarIdade(-5);
			
		} catch (ValidacaoException e) {
			System.out.println("Erro de validação: " + e.getMessage());
		}
	}

	public static void validarIdade(int idade) throws ValidacaoException {
		if (idade < 0) {
			throw new ValidacaoException("A idade não pode ser negativa");
		}
		// Lógica adicional de validação
	}
}

//Criando classe de uma Exceção de Validação
@SuppressWarnings("serial")
class ValidacaoException extends Exception {

	public ValidacaoException(String mensagem) {
		super(mensagem);
	}
}

/* Criando uma Exceção de Validação (ValidacaoException)
 * Neste exemplo, ValidacaoException é uma classe de exceção personalizada que estende Exception. O método validarIdade lança essa exceção se a idade 
 * fornecida for negativa.*/
