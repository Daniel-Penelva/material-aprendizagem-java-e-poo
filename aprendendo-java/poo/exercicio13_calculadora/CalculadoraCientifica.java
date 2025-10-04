package exercicio13_calculadora;

public class CalculadoraCientifica extends Calculadora {

	public CalculadoraCientifica(double numero1, double numero2) {
		super(numero1, numero2);
	}

	// Método para potencia
	public double potencia() {
		double resultado = Math.pow(numero1, numero2);
		return resultado;
	}

	// Método para Raiz Quadrada
	public double raizQuadrada() {
		double resultado = Math.sqrt(numero1);
		return resultado;
	}

}
