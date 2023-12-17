package modificadores.de.acesso;

public class Funcionario {
	
	private String nome;
	private String funcao;
	
	/* Para acessar as propriedades de modificadores de acesso private � necess�rio que ocorra o encapsulamento que controle o acesso, a flexibilidade para 
	 * modificar a implementa��o interna da classe sem afetar o c�digo externo, e a capacidade de adicionar l�gica adicional, se necess�rio.*/
	
	public void exibirDadosProtegidosFuncionario(String nome, String funcao) {
		System.out.println("Nome professor(a) � " + nome + " e sua fun��o � " + funcao);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
}
