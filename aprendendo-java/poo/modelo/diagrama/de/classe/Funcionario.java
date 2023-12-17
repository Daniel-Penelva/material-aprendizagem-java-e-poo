package modelo.diagrama.de.classe;

//Funcion�rio � uma Pessoa F�sica
public abstract class Funcionario extends PessoaFisica {

	/** OBS. V�o herdar as propriedades nome e cidade da Classe Pessoa e as propriedades cpf e rg da classe PessoaFisica.*/

	private Double salario;

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String cpf, Double salario) {
		setNome(nome);
		setCpf(cpf);
		setSalario(salario);
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	// Declara��o de m�todo abstrato.
	public abstract double calcularSalario();

}
