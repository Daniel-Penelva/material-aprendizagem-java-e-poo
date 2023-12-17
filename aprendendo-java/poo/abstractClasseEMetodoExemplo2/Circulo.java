package abstractClasseEMetodoExemplo2;

public class Circulo extends Forma {

	private double raio;

	// Construtor
	public Circulo(double raio) {
		this.raio = raio;
	}

	// Implementa��o do m�todo abstrato
	@Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}

}
