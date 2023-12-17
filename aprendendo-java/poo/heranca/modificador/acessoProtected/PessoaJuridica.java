package heranca.modificador.acessoProtected;

//Pessoa Jurídica é uma Pessoa
public class PessoaJuridica extends Pessoa {
	
	/**OBS. Vão herdar as propriedades nome e cidade da Classe Pessoa */

	// Atributos especificos da PessoaJuridica
	protected String razaoSocial;
	protected String cnpj;

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
