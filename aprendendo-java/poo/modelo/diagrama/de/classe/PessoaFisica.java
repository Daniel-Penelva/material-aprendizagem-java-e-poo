package modelo.diagrama.de.classe;

// Pessoa Fisica � uma Pessoa
public class PessoaFisica extends Pessoa {

	/**OBS. V�o herdar as propriedades nome e cidade da Classe Pessoa */
	
	private String cpf;
	private String rg;

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
