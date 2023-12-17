package modelo.diagrama.de.classe;

public class Estado {

	private String nome;
	private String uf;

	// Construtor Padrão - video 4 parte 1 - 53 minutos
	public Estado() {
		// o super está oculto
	}

	// Construtor Sobrecarregado
	public Estado(String nome, String uf) {
		setNome(nome);
		setUf(uf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	// Treinando toString
	@Override
	public String toString() {
		return "Estado [nome=" + nome + ", uf=" + uf + "]";
	}

}