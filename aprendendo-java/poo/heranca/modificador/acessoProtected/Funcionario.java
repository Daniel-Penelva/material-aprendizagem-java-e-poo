package heranca.modificador.acessoProtected;

//Funcionário é uma Pessoa Física
public class Funcionario extends PessoaFisica {

	/**OBS. Vão herdar as propriedades nome e cidade da Classe Pessoa e as propriedades cpf e rg da classe PessoaFisica. */
	
	// Atributos especificos de Funcionario
	protected String cargo;
	protected Double salario;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
