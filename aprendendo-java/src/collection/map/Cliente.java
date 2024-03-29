package collection.map;

public class Cliente {
	private String nome;
	private String sobrenome;

	public Cliente() {
		super();
	}

	public Cliente(String nome, String sobrenome) {
		setNome(nome);
		setSobrenome(sobrenome);
	}

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

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}
	
}
