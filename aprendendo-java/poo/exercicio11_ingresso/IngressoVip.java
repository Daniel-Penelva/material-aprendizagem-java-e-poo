package exercicio11_ingresso;

public class IngressoVip extends Ingresso {

	private double valorAdicional;

	// Construtor
	public IngressoVip(double valor, double valorAdicional) {
		super(valor); // chama o construtor da classe base
		this.valorAdicional = valorAdicional;
	}

	// Método Getter e Setter
	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	// Método para calcular o valor do ingresso vip
	public double valorVIP() {
        return valor + valorAdicional;
    }

	// Método para imprimir o valor do ingresso vip
	public void imprimirValor() {
		double valorVIP = valor + valorAdicional;
		System.out.println("Valor do ingresso VIP: R$ " + String.format("%.2f", valorVIP()));
	}

}
