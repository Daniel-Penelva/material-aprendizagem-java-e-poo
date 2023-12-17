package abstractClasseEMetodoExemplo2;

public class Circulo extends Forma {

	private double raio;

	// Construtor
	public Circulo(double raio) {
		this.raio = raio;
	}

	// Implementação do método abstrato
	@Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}

}
