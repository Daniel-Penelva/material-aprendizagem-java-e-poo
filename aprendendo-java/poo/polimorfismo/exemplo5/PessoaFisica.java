package polimorfismo.exemplo5;

// Pessoa Fisica � uma Pessoa
public class PessoaFisica extends Pessoa {

	/**OBS. V�o herdar as propriedades nome e cidade da Classe Pessoa */
	
	// Atributos especificos da PessoaFisica
	private String cpf;
	private String rg;

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
