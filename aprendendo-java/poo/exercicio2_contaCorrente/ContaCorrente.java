package exercicio2_contaCorrente;

public class ContaCorrente {

	private String numeroConta;
	private String nomeCorrentista;
	private double saldo;

	// Construtores
	public ContaCorrente() {
	}

	public ContaCorrente(String numeroConta, String nomeCorrentista) {
		super();
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = 0.0; // valor default
	}

	public ContaCorrente(String numeroConta, String nomeCorrentista, double saldoInicial) {
		super();
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldoInicial;
	}

	// Métodos Getters e Setters
	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Método Alterar nome
	public void alterarNome(String novoNome) {
		if (novoNome != null && !novoNome.trim().isEmpty()) { // verifica se nome não é nulo e verifica que o nome NÃO seja vazio ou composta apenas por espaços.
			this.nomeCorrentista = novoNome;
			System.out.println("Nome do correntista alterado para: " + novoNome);
		} else {
			System.out.println("Nome inválido! Alteração não autorizada.");
		}
	}

	// Método para depósito
	public void deposito(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Déposito de R$ " + valor + " realizado com sucesso!");
		} else {
			System.out.println("Valor de depósito inválido");
		}
	}

	// Método para saque
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			this.saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso!");
		} else if (valor > saldo) {
			System.out.println("Saldo insuficiente para saque!");
		} else {
			System.out.println("Valor de saldo inválido!");
		}
	}
	
	// Método para imprimirDados
	public void imprimirDados() {
		System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Correntista: " + nomeCorrentista);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
	}

}
