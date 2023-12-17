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
			throw new AcessoNegadoException("Usu�rio n�o tem permiss�o de acesso");
		}
		// L�gica adicional de verifica��o de acesso
	}
}

// Criando Classe de uma Exce��o de Acesso Negado
@SuppressWarnings("serial")
class AcessoNegadoException extends Exception {
	public AcessoNegadoException(String mensagem) {
		super(mensagem);
	}
}

/* Criando uma Exce��o de Acesso Negado (AcessoNegadoException)
 * Neste exemplo, AcessoNegadoException � uma classe de exce��o personalizada que � lan�ada quando o acesso � negado.*/
