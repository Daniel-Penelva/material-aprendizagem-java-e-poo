package construtores;

public class Pessoa {

	private String nome;
	private String cpf;
	private int idade;
	private Cidade cidade;

	/* CONSTRUTORES */
	public Pessoa() {
		super(); // herda Object
		System.out.println("Construtor vazio");
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Pessoa(String nome, Cidade cidade) {
		this.nome = nome;
		this.cidade = cidade;
	}

	public Pessoa(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		setIdade(idade);
	}
	
	public Pessoa(String nome, String cpf, int idade, Cidade cidade) {
		this.nome = nome;
		this.cpf = cpf;
		setIdade(idade);
		this.cidade = cidade;
	}

	
	/**Explicando o c�digo abaixo:
	 *  Dentro do corpo do construtor, estou chamando o m�todo setCidade() para configurar a propriedade cidade da inst�ncia de Pessoa com o valor passado 
	 *  como argumento (o objeto Cidade recebido como par�metro).
	 *  Essencialmente, esse construtor oferece uma maneira conveniente de criar uma inst�ncia de Pessoa fornecendo diretamente um objeto Cidade. Em outras 
	 *  palavras, ao usar esse construtor, eu posso fazer algo assim:
	 *  
	 *  Cidade cidadeExemplo = new Cidade("S�o Paulo", "SP");
	 *  Pessoa pessoaComCidade = new Pessoa(cidadeExemplo);
	 * 
	 * Dessa forma, estou associando a inst�ncia de Cidade (nesse exemplo, "S�o Paulo") � inst�ncia de Pessoa que est� sendo criada. Isso � �til quando 
	 * deseja inicializar uma pessoa com uma cidade espec�fica no momento da cria��o do objeto.*/
	public Pessoa(Cidade cidade) {
		setCidade(cidade);
	}
	
	
	/* M�TODOS GETTERS E SETTERS */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCidade(String cidade) {
		this.cpf = cidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade <= 18) {
			this.idade = idade;
			System.out.println("Menor de idade!!!");
		} else if (idade >= 18 && idade <= 60) {
			this.idade = idade;
			System.out.println("Maior de idade!!!");
		} else {
			this.idade = idade;
			System.out.println("Aposentado!!!");
		}

	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

}
