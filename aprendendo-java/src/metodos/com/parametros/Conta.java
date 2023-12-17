package metodos.com.parametros;

public class Conta {

	String cliente;
	double saldo;

	void exibirSaldo() {
		System.out.println("Cliente " + cliente + " seu saldo � de R$ " + saldo);
	}

	void sacarDinheiro(double valor) {
		
		System.out.println(" Voc� fez um saque de R$ " + valor);
		saldo = saldo - valor;
	}

	void depositarDinheiro(double valor) {
		System.out.println(" Voc� fez um deposito de R$ " + valor);
		saldo += valor;
	}

	void transferePara(Conta destino, double valor) {
		
		System.out.println(" Voc� fez uma transfer�ncia de R$ " + valor);
		this.sacarDinheiro(valor);
		destino.depositarDinheiro(valor);
	}
}
