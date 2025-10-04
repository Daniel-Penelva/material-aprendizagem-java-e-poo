package exercicio11_ingresso;

public class Ingresso {

	protected double valor;

	// Construtor
	public Ingresso(double valor) {
		this.valor = valor;
	}

	// Método Getter e Setter
	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	// Método Imprimir Valor normal do ingresso
	public void imprimirValor() {
		System.out.println("Valor do ingresso: R$ " + String.format("%.2f", valor));
	}

}
