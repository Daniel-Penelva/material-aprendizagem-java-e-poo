package exercicio13_calculadora;

public class Calculadora {

	protected double numero1;
	protected double numero2;

	// Construtor
	public Calculadora(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	// Métodos Getters e Setters
	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public double somar() {
		double resultado = numero1 + numero2;
		return resultado;
	}

	public double subtracao() {
		double resultado = numero1 - numero2;
		return resultado;
	}

	public double multiplicacao() {
		double resultado = numero1 * numero2;
		return resultado;
	}

	public double divisao() {
		if (numero2 <= 0) {
			return -1;
		} else {
			double resultado = numero1 / numero2;
			return resultado;
		}
	}

}
