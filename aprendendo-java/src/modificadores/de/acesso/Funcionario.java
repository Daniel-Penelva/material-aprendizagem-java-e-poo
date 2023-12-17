package modificadores.de.acesso;

public class Funcionario {
	
	private String nome;
	private String funcao;
	
	/* Para acessar as propriedades de modificadores de acesso private é necessário que ocorra o encapsulamento que controle o acesso, a flexibilidade para 
	 * modificar a implementação interna da classe sem afetar o código externo, e a capacidade de adicionar lógica adicional, se necessário.*/
	
	public void exibirDadosProtegidosFuncionario(String nome, String funcao) {
		System.out.println("Nome professor(a) é " + nome + " e sua função é " + funcao);
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
