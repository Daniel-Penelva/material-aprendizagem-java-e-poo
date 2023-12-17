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
