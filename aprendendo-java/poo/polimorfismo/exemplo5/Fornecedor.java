package polimorfismo.exemplo5;

import java.util.List;

//Fornecedor é uma Pessoa Jurídica
public class Fornecedor extends PessoaJuridica {

	/**OBS. Vão herdar as propriedades nome e cidade da Classe Pessoa e as propriedades cnpj e razao social da classe PessoaFisica. */
	
	// Atributos especificos de Fornecedor
	private List<String> produtosFornecidos;

	public List<String> getProdutosFornecidos() {
		return produtosFornecidos;
	}

	public void setProdutosFornecidos(List<String> produtosFornecidos) {
		this.produtosFornecidos = produtosFornecidos;
	}

}
