package modificadores.de.acesso;

public class Cliente {
	
	public String nome;
	public int idade;
	
	public void exibirDadosCliente(String nome, int idade) {
		System.out.println("Seu nome � " + nome + " e sua idade � " + idade);
	}

}
