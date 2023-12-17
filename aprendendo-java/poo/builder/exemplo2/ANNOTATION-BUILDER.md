# Builder

Em Java, o termo "builder" refere-se a um padr�o de projeto conhecido como "Builder Pattern". O Builder � usado para construir objetos complexos passo a passo. Ele � particularmente �til quando um objeto possui muitos atributos opcionais e deseja criar uma inst�ncia desse objeto de maneira clara e f�cil de entender.

A ideia b�sica por tr�s do padr�o Builder � ter uma classe interna (conhecida como "Builder") que cont�m os m�todos para configurar os atributos do objeto final. A classe principal geralmente tem um construtor privado e um m�todo est�tico que retorna uma inst�ncia do Builder. O Builder � usado para configurar os atributos desejados e, finalmente, construir o objeto principal.

O padr�o Effective Java�s Builder tem como base o conceito de interface fluente, onde os m�todos podem ser encadeados e chamados como se estivesse escrevendo um texto. No caso do builder, a ideia � construir um objeto b�sico com os atributos obrigat�rios e depois ir chamando outros m�todos para os atributos opcionais de forma encadeada. Veja como fica a classe Produto com o padr�o builder implementado.

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

	/* Neste construtor, a id�ia � inicializar os atributos da classe Produto com os valores configurados no Builder, por exemplo:
	 * this.id = builder.id;: Est� atribuindo o valor da propriedade id do objeto Builder para a propriedade id do objeto Produto. Isso copia o 
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

	// M�todos Getters e Setters
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

		// Construtor Builder recebendo dois valores como par�metro, id e nome.
		public Builder(Long id, String nome) {
			this.id = id;
			this.nome = nome;
		}

		// M�todos que fazem parte da classe interna Builder e � utilizado para configurar os atributos dos objetos que ser�o constru�dos.
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

A principal mudan�a foi a cria��o de uma classe interna chamada Builder para construir inst�ncias da classe Produto. O construtor da classe produto foi deixado com privado, dessa forma s� � poss�vel construir uma inst�ncia de produto por meio da classe interna Builder.

A classe Builder possui todos os atributos de produto e um construtor para um produto b�sico que recebe o id e o nome. Al�m disso, cada m�todo para os demais atributos (descricao, valor, cor, etc) retorna o pr�prio builder, tornando poss�vel as chamadas encadeadas. 

Para construir uma inst�ncia da classe Produto � necess�rio chamar o m�todo build(), que chama o construtor privado da classe Produto passando o builder com os atributos de produto. O construtor da classe Produto apenas obt�m os dados do builder.

Veja agora como fica a cria��o de um produto b�sico e de um produto com outros atributos.

```java
package builder.exemplo2;

import java.math.BigDecimal;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		Produto produtoBasico = new Produto.Builder(1L, "Camiseta B�sica").build();
		System.out.println("Camisa B�sica - Id: " + produtoBasico.getId() + " :: Nome: " + produtoBasico.getNome());
		
		System.out.println("\n\n");

		Produto produtoBasicoComCor = new Produto.Builder(1L, "Camiseta B�sica")
				.cor("Azul")
				.build();
		
		System.out.println("Camisa B�sica com cor - Id: " + produtoBasicoComCor.getId() + " :: Nome: " + produtoBasicoComCor.getNome() + 
				" :: Cor: " + produtoBasicoComCor.getCor());
		
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */

		Produto produtoBasicoComCorDescricao = new Produto.Builder(1L, "Camiseta B�sica")
				.cor("Azul")
				.descricao("Camiseta de Algod�o")
				.build();
		
		System.out.println("Camisa B�sica com cor e descri��o - Id: " + produtoBasicoComCorDescricao.getId() + " :: Nome: " + produtoBasicoComCorDescricao.getNome() + 
				" :: Cor: " + produtoBasicoComCorDescricao.getCor() + " :: Descri��o: " + produtoBasicoComCorDescricao.getDescricao());
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		Produto produtoCamisaCompleto = new Produto.Builder(1L, "Camiseta B�sica")
				.descricao("Camisa Regata de algod�o")
				.valor(new BigDecimal("45.54"))
				.cor("Branco")
				.altura("40")
				.largura("30")
				.comprimento("69")
				.build();
		
		System.out.println("Camisa completa - Id: " + produtoCamisaCompleto.getId() + " :: Nome: " + produtoCamisaCompleto.getNome() + 
				" :: Cor: " + produtoCamisaCompleto.getCor() + " :: Descri��o: " + produtoCamisaCompleto.getDescricao() + 
				" :: Valor: " + produtoCamisaCompleto.getValor() + " :: Altura: " + produtoCamisaCompleto.getAltura() + 
				" :: Largura: " + produtoCamisaCompleto.getLargura() + " :: Comprimento: " + produtoCamisaCompleto.getComprimento());

	}

}
```

A constru��o do objeto ficou muito mais simples, com uma escrita natural, al�m de tornar o c�digo menos polu�do e menos propenso a erros na constru��o dos objetos.

Al�m disso, o c�digo fica mais flex�vel. � poss�vel adicionar novas funcionalidades no builder, por exemplo um m�todo validate() que, antes de construir o objeto, valida os dados e pode lan�ar uma exce��o do tipo IllegalStateExeception caso haja alguma inconsist�ncia nos dados.