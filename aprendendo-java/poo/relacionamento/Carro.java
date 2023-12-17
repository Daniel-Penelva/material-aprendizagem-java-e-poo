package relacionamento;

public class Carro {

	String modelo;
	int velocidadeMaxima;
	double segundoZeroACem;

	// Criando o relacionamento unidirecional do Carro com o Motor (Frase: Carro tem um motor) 
	Motor motor;

	public Carro() {
		super();
	}

	
	public Carro(String modelo, int velocidadeMaxima, double segundoZeroACem) {

		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundoZeroACem = segundoZeroACem;
	}

	
	public Carro(String modelo, int velocidadeMaxima, double segundoZeroACem, Motor motor) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundoZeroACem = segundoZeroACem;
		this.motor = motor;
	}
}
