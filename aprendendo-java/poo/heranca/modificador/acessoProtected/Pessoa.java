package heranca.modificador.acessoProtected;

public class Pessoa {

	protected String nome;
	protected Cidade cidade; // Rela��o unidirecional - uma pessoa mora em uma cidade

	// Metodos Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
