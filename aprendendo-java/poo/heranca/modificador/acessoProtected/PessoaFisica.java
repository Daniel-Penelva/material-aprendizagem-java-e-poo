package heranca.modificador.acessoProtected;

// Pessoa Fisica � uma Pessoa
public class PessoaFisica extends Pessoa {

	/**OBS. V�o herdar as propriedades nome e cidade da Classe Pessoa */
	
	// Atributos especificos da PessoaFisica
	protected String cpf;
	protected String rg;

	// m�todos getters e setters
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
