package builder.exemplo2;

import java.math.BigDecimal;

public class Produto {

	// Atributos do Produto
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal valor;
	private String cor;
	private String altura;
	private String largura;
	private String comprimento;

	/* Neste construtor, a idéia é inicializar os atributos da classe Produto com os valores configurados no Builder, por exemplo:
	 * this.id = builder.id;: Está atribuindo o valor da propriedade id do objeto Builder para a propriedade id do objeto Produto. Isso copia o 
	 * valor configurado no Builder para o objeto final.*/
	private Produto(Builder builder) {
		super();
		this.id = builder.id;
		this.nome = builder.nome;
		this.descricao = builder.descricao;
		this.valor = builder.valor;
		this.cor = builder.cor;
		this.altura = builder.altura;
		this.largura = builder.largura;
		this.comprimento = builder.comprimento;
	}

	// Métodos Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getLargura() {
		return largura;
	}

	public void setLargura(String largura) {
		this.largura = largura;
	}

	public String getComprimento() {
		return comprimento;
	}

	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}

	// Classe interna Builder
	public static class Builder {

		private Long id;
		private String nome;
		private String descricao;
		private BigDecimal valor;
		private String cor;
		private String altura;
		private String largura;
		private String comprimento;

		// Construtor Builder recebendo dois valores como parâmetro, id e nome.
		public Builder(Long id, String nome) {
			this.id = id;
			this.nome = nome;
		}

		// Métodos que fazem parte da classe interna Builder e é utilizado para configurar os atributos dos objetos que serão construídos.
		public Builder descricao(String descricao) {
			this.descricao = descricao;
			return this;
		}

		public Builder valor(BigDecimal valor) {
			this.valor = valor;
			return this;
		}

		public Builder cor(String cor) {
			this.cor = cor;
			return this;
		}

		public Builder altura(String altura) {
			this.altura = altura;
			return this;
		}

		public Builder largura(String largura) {
			this.largura = largura;
			return this;
		}

		public Builder comprimento(String comprimento) {
			this.comprimento = comprimento;
			return this;
		}

		public Produto build() {
			return new Produto(this);
		}
	}
}
