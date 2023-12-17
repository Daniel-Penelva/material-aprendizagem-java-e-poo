package verificar.instancia.exemplo1;

public class Pessoa extends Humano {
	
	// Atributos específicos da classe Pessoa
	private String nome;
	private int idade;

	public Pessoa() {

	}

	public Pessoa(String cabeca, String tronco, String membro, String nome, int idade) {
		super(cabeca, tronco, membro);
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
