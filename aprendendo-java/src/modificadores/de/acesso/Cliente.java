package modificadores.de.acesso;

public class Cliente {
	
	public String nome;
	public int idade;
	
	public void exibirDadosCliente(String nome, int idade) {
		System.out.println("Seu nome é " + nome + " e sua idade é " + idade);
	}

}
