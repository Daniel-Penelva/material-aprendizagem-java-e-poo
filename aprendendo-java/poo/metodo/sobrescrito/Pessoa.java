package metodo.sobrescrito;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + "]";
	}
	
	// Sobrescrevendo ToString
	public String toString2() {
		return "Nome: " + nome + " :: Sobrenome: " + sobrenome + " :: idade: " + idade;
	}

}
