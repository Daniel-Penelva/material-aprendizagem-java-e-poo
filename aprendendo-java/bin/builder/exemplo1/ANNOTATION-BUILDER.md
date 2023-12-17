# Builder

Em Java, o termo "builder" refere-se a um padrão de projeto conhecido como "Builder Pattern". O Builder é usado para construir objetos complexos passo a passo. Ele é particularmente útil quando um objeto possui muitos atributos opcionais e deseja criar uma instância desse objeto de maneira clara e fácil de entender.

A ideia básica por trás do padrão Builder é ter uma classe interna (conhecida como "Builder") que contém os métodos para configurar os atributos do objeto final. A classe principal geralmente tem um construtor privado e um método estático que retorna uma instância do Builder. O Builder é usado para configurar os atributos desejados e, finalmente, construir o objeto principal.

O padrão Effective Java’s Builder tem como base o conceito de interface fluente, onde os métodos podem ser encadeados e chamados como se estivesse escrevendo um texto. No caso do builder, a ideia é construir um objeto básico com os atributos obrigatórios e depois ir chamando outros métodos para os atributos opcionais de forma encadeada. Veja como fica a classe Carro com o padrão builder implementado.

```java
package builder.exemplo1;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private boolean arCondicionado;
	private boolean centralMultimidia;
	
	/* Neste construtor, a idéia é inicializar os atributos da classe Carro com os valores configurados no Builder, por exemplo:
	 * this.marca = builder.marca;: Está atribuindo o valor da propriedade marca do objeto Builder para a propriedade marca do objeto Carro. Isso copia o 
	 * valor configurado no Builder para o objeto final.*/

	private Carro(Builder builder) {
		this.marca = builder.marca;
		this.modelo = builder.modelo;
		this.ano = builder.ano;
		this.arCondicionado = builder.arCondicionado;
		this.centralMultimidia = centralMultimidia;
	}

	// Métodos Getters e Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public boolean getCentralMultimidia() {
		return centralMultimidia;
	}

	public void setCentralMultimidia(boolean centralMultimidia) {
		this.centralMultimidia = centralMultimidia;
	}

	// Classe interna (Builder)
	public static class Builder {

		// Tem que adicionar os mesmos atributos que estão na Classe Carro
		private String marca;
		private String modelo;
		private int ano;
		private boolean arCondicionado;
		private boolean centralMultimida;

		// Construtore Builder com todas as propriedades
		public Builder(String marca, String modelo, int ano) {
			this.marca = marca;
			this.modelo = modelo;
			this.ano = ano;
		}

		// Métodos que fazem parte da classe interna Builder e é utilizado para configurar os atributos dos objetos que serão construídos.
		public Builder comArCondicionado(boolean arCondicionado) {
			this.arCondicionado = arCondicionado;
			return this;
		}

		public Builder comCentralMultimidia(boolean centralMultimidia) {
			this.centralMultimida = centralMultimidia;
			return this;
		}

		public Builder comCentralMultimidiaEArCondicionado(boolean centralMultimidia, boolean arCondicionado) {
			this.centralMultimida = centralMultimidia;
			this.arCondicionado = arCondicionado;
			return this;
		}

		// Ambos os métodos abaixo fazem a mesma coisa que é retornar um objeto Carro com base nas configurações feitas usando a classe interna Builder.
		public Carro construir() {
			return new Carro(this);
		}

		public Carro build() {
			return new Carro(this);
		}

	}
}
```

A principal mudança foi a criação de uma classe interna chamada Builder para construir instâncias da classe Carro. O construtor da classe Carro foi deixado com privado, dessa forma só é possível construir uma instância do carro por meio da classe interna Builder.

A classe Builder possui todos os atributos do carro e um construtor para um carro básico que recebe o marca, modelo e ano. Além disso, cada método para os demais atributos (arCondicionado e centralMultimida) retorna o próprio builder, tornando possível as chamadas encadeadas. 

Para construir uma instância da classe Carro é necessário chamar o método build(), que chama o construtor privado da classe CArro passando o builder com os atributos de carro. O construtor da classe Carro apenas obtém os dados do builder.

Veja agora como fica a criação de um carro básico e de um carro com outros atributos.

```java
package builder.exemplo1;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		// Carro com arcondicionado
		Carro carro1 = new Carro.Builder("Toyota", "Corolla", 2010).comArCondicionado(true).construir();

		// Imprimir valores
		System.out.println("Marca: " + carro1.getMarca());
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Ano: " + carro1.getAno());
		System.out.println("Tem ar condicionado? " + carro1.getArCondicionado());
		
		System.out.println("\n\n");
		
		
		// Carro com central multimidia
		Carro carro2 = new Carro.Builder("Honda", "Civic", 2010).comCentralMultimidia(true).build();
		
		// Imprimir valores
		System.out.println("Marca: " + carro2.getMarca());
		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Ano: " + carro2.getAno());
		System.out.println("Tem Central Multimídia? " + carro2.getCentralMultimidia());
		
		
		System.out.println("\n\n");
		
		// Carro com central multimidia
		Carro carro3 = new Carro.Builder("Ford", "Camaro", 2010)
				.comCentralMultimidia(true)
				.comArCondicionado(true)
				.construir();
				
		// Imprimir valores
		System.out.println("Marca: " + carro3.getMarca());
		System.out.println("Modelo: " + carro3.getModelo());
		System.out.println("Ano: " + carro3.getAno());
		System.out.println("Tem Central Multimídia? " + carro3.getCentralMultimidia());
		System.out.println("Tem Ar Condicionado? " + carro3.getCentralMultimidia());

	}
}
```

A construção do objeto ficou muito mais simples, com uma escrita natural, além de tornar o código menos poluído e menos propenso a erros na construção dos objetos.

Além disso, o código fica mais flexível. É possível adicionar novas funcionalidades no builder, por exemplo um método validate() que, antes de construir o objeto, valida os dados e pode lançar uma exceção do tipo IllegalStateExeception caso haja alguma inconsistência nos dados.