package manipulacaoDeArquivosEPastas.bufferedWritePathFilesFileSystems;

public class Conta {

	private String cliente;
	private double saldo;
	
	public Conta() {

	}

	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}

	// Getters e Setters
	public String getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	// Métodos para manipular a conta
	public void exibeSaldo() {
		System.out.println(cliente + " seu saldo é de : " + saldo);
	}

	
	public void saca(double valor) {
		saldo = saldo - valor;
	}

	
	public void deposito(double valor) {
		saldo += valor;
	}

	
	// Transferi para uma conta de destino a partir do valor informado
	public void transferePara(Conta destino, double valor) {

		this.saca(valor);
		destino.deposito(valor);
	}

}
