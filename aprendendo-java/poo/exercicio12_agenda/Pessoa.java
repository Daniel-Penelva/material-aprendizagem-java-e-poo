package exercicio12_agenda;

public class Pessoa {

	private String nome;
	private int idade;
	private float altura;

	// Construtor
	public Pessoa(String nome, int idade, float altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	// Métodos Getters e Setters
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

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	// Método para imprimir dados da pessoa
    public void imprimirPessoa() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura + "m");
    }
}
