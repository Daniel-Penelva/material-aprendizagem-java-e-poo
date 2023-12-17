package exception.exemplo3.excecao.personalizada;

public class ProgramaPrincipalSenhaInvalida {

	public static void main(String[] args) {

		try {
			autenticarSenha("123");
			
		} catch (SenhaInvalidaException e) {
			System.out.println(e.getMessage());
		}

	}

	// Bloco Static
	static void autenticarSenha(String senha) throws SenhaInvalidaException {
		if ("123".equals(senha)) // ou senha.equals("123")
		{
			System.out.println("Autenticada");
		} else {
			throw new SenhaInvalidaException("Senha Incorreta");
		}
	}
}
