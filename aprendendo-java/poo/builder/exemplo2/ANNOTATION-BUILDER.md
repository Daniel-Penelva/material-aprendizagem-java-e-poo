# Builder

Em Java, o termo "builder" refere-se a um padrão de projeto conhecido como "Builder Pattern". O Builder é usado para construir objetos complexos passo a passo. Ele é particularmente útil quando um objeto possui muitos atributos opcionais e deseja criar uma instância desse objeto de maneira clara e fácil de entender.

A ideia básica por trás do padrão Builder é ter uma classe interna (conhecida como "Builder") que contém os métodos para configurar os atributos do objeto final. A classe principal geralmente tem um construtor privado e um método estático que retorna uma instância do Builder. O Builder é usado para configurar os atributos desejados e, finalmente, construir o objeto principal.

O padrão Effective Java’s Builder tem como base o conceito de interface fluente, onde os métodos podem ser encadeados e chamados como se estivesse escrevendo um texto. No caso do builder, a ideia é construir um objeto básico com os atributos obrigatórios e depois ir chamando outros métodos para os atributos opcionais de forma encadeada. Veja como fica a classe Produto com o padrão builder implementado.

```java
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
```

A principal mudança foi a criação de uma classe interna chamada Builder para construir instâncias da classe Produto. O construtor da classe produto foi deixado com privado, dessa forma só é possível construir uma instância de produto por meio da classe interna Builder.

A classe Builder possui todos os atributos de produto e um construtor para um produto básico que recebe o id e o nome. Além disso, cada método para os demais atributos (descricao, valor, cor, etc) retorna o próprio builder, tornando possível as chamadas encadeadas. 

Para construir uma instância da classe Produto é necessário chamar o método build(), que chama o construtor privado da classe Produto passando o builder com os atributos de produto. O construtor da classe Produto apenas obtém os dados do builder.

Veja agora como fica a criação de um produto básico e de um produto com outros atributos.

```java
package builder.exemplo2;

import java.math.BigDecimal;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		Produto produtoBasico = new Produto.Builder(1L, "Camiseta Básica").build();
		System.out.println("Camisa Básica - Id: " + produtoBasico.getId() + " :: Nome: " + produtoBasico.getNome());
		
		System.out.println("\n\n");

		Produto produtoBasicoComCor = new Produto.Builder(1L, "Camiseta Básica")
				.cor("Azul")
				.build();
		
		System.out.println("Camisa Básica com cor - Id: " + produtoBasicoComCor.getId() + " :: Nome: " + produtoBasicoComCor.getNome() + 
				" :: Cor: " + produtoBasicoComCor.getCor());
		
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */

		Produto produtoBasicoComCorDescricao = new Produto.Builder(1L, "Camiseta Básica")
				.cor("Azul")
				.descricao("Camiseta de Algodão")
				.build();
		
		System.out.println("Camisa Básica com cor e descrição - Id: " + produtoBasicoComCorDescricao.getId() + " :: Nome: " + produtoBasicoComCorDescricao.getNome() + 
				" :: Cor: " + produtoBasicoComCorDescricao.getCor() + " :: Descrição: " + produtoBasicoComCorDescricao.getDescricao());
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		Produto produtoCamisaCompleto = new Produto.Builder(1L, "Camiseta Básica")
				.descricao("Camisa Regata de algodão")
				.valor(new BigDecimal("45.54"))
				.cor("Branco")
				.altura("40")
				.largura("30")
				.comprimento("69")
				.build();
		
		System.out.println("Camisa completa - Id: " + produtoCamisaCompleto.getId() + " :: Nome: " + produtoCamisaCompleto.getNome() + 
				" :: Cor: " + produtoCamisaCompleto.getCor() + " :: Descrição: " + produtoCamisaCompleto.getDescricao() + 
				" :: Valor: " + produtoCamisaCompleto.getValor() + " :: Altura: " + produtoCamisaCompleto.getAltura() + 
				" :: Largura: " + produtoCamisaCompleto.getLargura() + " :: Comprimento: " + produtoCamisaCompleto.getComprimento());

	}

}
```

A construção do objeto ficou muito mais simples, com uma escrita natural, além de tornar o código menos poluído e menos propenso a erros na construção dos objetos.

Além disso, o código fica mais flexível. É possível adicionar novas funcionalidades no builder, por exemplo um método validate() que, antes de construir o objeto, valida os dados e pode lançar uma exceção do tipo IllegalStateExeception caso haja alguma inconsistência nos dados.