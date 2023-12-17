# Builder

Em Java, o termo "builder" refere-se a um padr�o de projeto conhecido como "Builder Pattern". O Builder � usado para construir objetos complexos passo a passo. Ele � particularmente �til quando um objeto possui muitos atributos opcionais e deseja criar uma inst�ncia desse objeto de maneira clara e f�cil de entender.

A ideia b�sica por tr�s do padr�o Builder � ter uma classe interna (conhecida como "Builder") que cont�m os m�todos para configurar os atributos do objeto final. A classe principal geralmente tem um construtor privado e um m�todo est�tico que retorna uma inst�ncia do Builder. O Builder � usado para configurar os atributos desejados e, finalmente, construir o objeto principal.

O padr�o Effective Java�s Builder tem como base o conceito de interface fluente, onde os m�todos podem ser encadeados e chamados como se estivesse escrevendo um texto. No caso do builder, a ideia � construir um objeto b�sico com os atributos obrigat�rios e depois ir chamando outros m�todos para os atributos opcionais de forma encadeada. Veja como fica a classe Carro com o padr�o builder implementado.

```java
package builder.exemplo1;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private boolean arCondicionado;
	private boolean centralMultimidia;
	
	/* Neste construtor, a id�ia � inicializar os atributos da classe Carro com os valores configurados no Builder, por exemplo:
	 * this.marca = builder.marca;: Est� atribuindo o valor da propriedade marca do objeto Builder para a propriedade marca do objeto Carro. Isso copia o 
	 * valor configurado no Builder para o objeto final.*/

	private Carro(Builder builder) {
		this.marca = builder.marca;
		this.modelo = builder.modelo;
		this.ano = builder.ano;
		this.arCondicionado = builder.arCondicionado;
		this.centralMultimidia = centralMultimidia;
	}

	// M�todos Getters e Setters
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

		// Tem que adicionar os mesmos atributos que est�o na Classe Carro
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

		// M�todos que fazem parte da classe interna Builder e � utilizado para configurar os atributos dos objetos que ser�o constru�dos.
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

		// Ambos os m�todos abaixo fazem a mesma coisa que � retornar um objeto Carro com base nas configura��es feitas usando a classe interna Builder.
		public Carro construir() {
			return new Carro(this);
		}

		public Carro build() {
			return new Carro(this);
		}

	}
}
```

A principal mudan�a foi a cria��o de uma classe interna chamada Builder para construir inst�ncias da classe Carro. O construtor da classe Carro foi deixado com privado, dessa forma s� � poss�vel construir uma inst�ncia do carro por meio da classe interna Builder.

A classe Builder possui todos os atributos do carro e um construtor para um carro b�sico que recebe o marca, modelo e ano. Al�m disso, cada m�todo para os demais atributos (arCondicionado e centralMultimida) retorna o pr�prio builder, tornando poss�vel as chamadas encadeadas. 

Para construir uma inst�ncia da classe Carro � necess�rio chamar o m�todo build(), que chama o construtor privado da classe CArro passando o builder com os atributos de carro. O construtor da classe Carro apenas obt�m os dados do builder.

Veja agora como fica a cria��o de um carro b�sico e de um carro com outros atributos.

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
		System.out.println("Tem Central Multim�dia? " + carro2.getCentralMultimidia());
		
		
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
		System.out.println("Tem Central Multim�dia? " + carro3.getCentralMultimidia());
		System.out.println("Tem Ar Condicionado? " + carro3.getCentralMultimidia());

	}
}
```

A constru��o do objeto ficou muito mais simples, com uma escrita natural, al�m de tornar o c�digo menos polu�do e menos propenso a erros na constru��o dos objetos.

Al�m disso, o c�digo fica mais flex�vel. � poss�vel adicionar novas funcionalidades no builder, por exemplo um m�todo validate() que, antes de construir o objeto, valida os dados e pode lan�ar uma exce��o do tipo IllegalStateExeception caso haja alguma inconsist�ncia nos dados.