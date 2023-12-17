package modificadores.de.acesso;

public class Gerente {
	
	protected String nome;
	protected String funcao;
	
	protected void exibirDadosProtegidosGerente(String nome, String funcao) {
		System.out.println("Nome do gerente é " + nome + " e sua função é " + funcao);
	}

}
