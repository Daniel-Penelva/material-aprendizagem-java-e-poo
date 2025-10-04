package exercicio17_agendamentoDeCompromissos;

public class Pessoa {

	private String nome;
	private String telefone;

	// Construtor
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	// Métodos Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
        return "Nome: " + nome + " | Telefone (" + telefone + ")";
    }
}
