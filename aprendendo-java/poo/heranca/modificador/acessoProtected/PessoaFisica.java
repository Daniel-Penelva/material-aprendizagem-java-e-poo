package heranca.modificador.acessoProtected;

// Pessoa Fisica é uma Pessoa
public class PessoaFisica extends Pessoa {

	/**OBS. Vão herdar as propriedades nome e cidade da Classe Pessoa */
	
	// Atributos especificos da PessoaFisica
	protected String cpf;
	protected String rg;

	// métodos getters e setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
}
