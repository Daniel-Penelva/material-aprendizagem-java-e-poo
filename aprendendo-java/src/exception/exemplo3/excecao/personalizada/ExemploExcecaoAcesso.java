package exception.exemplo3.excecao.personalizada;

public class ExemploExcecaoAcesso {
	public static void main(String[] args) {
		
		try {
			verificarAcesso(false);
			
		} catch (AcessoNegadoException e) {
			System.out.println("Acesso negado: " + e.getMessage());
		}
	}

	public static void verificarAcesso(boolean temAcesso) throws AcessoNegadoException {
		if (!temAcesso) {
			throw new AcessoNegadoException("Usuário não tem permissão de acesso");
		}
		// Lógica adicional de verificação de acesso
	}
}

// Criando Classe de uma Exceção de Acesso Negado
@SuppressWarnings("serial")
class AcessoNegadoException extends Exception {
	public AcessoNegadoException(String mensagem) {
		super(mensagem);
	}
}

/* Criando uma Exceção de Acesso Negado (AcessoNegadoException)
 * Neste exemplo, AcessoNegadoException é uma classe de exceção personalizada que é lançada quando o acesso é negado.*/
