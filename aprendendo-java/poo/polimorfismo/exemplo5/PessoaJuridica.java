package polimorfismo.exemplo5;

//Pessoa Jur�dica � uma Pessoa
public class PessoaJuridica extends Pessoa {
	
	/**OBS. V�o herdar as propriedades nome e cidade da Classe Pessoa */

	// Atributos especificos da PessoaJuridica
	private String razaoSocial;
	private String cnpj;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
