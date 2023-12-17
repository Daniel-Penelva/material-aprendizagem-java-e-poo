package metodos.com.parametros;

public class ProgramaPrincipalConta {

	public static void main(String[] args) {

		var conta = new Conta();

		System.out.println("Conta do Daniel");
		conta.cliente = "Daniel";
		conta.saldo = 15_600.00; // Ou 15600.00

		// Exibir saldo
		conta.exibirSaldo();

		// Exibir saque
		conta.sacarDinheiro(1000); 

		conta.exibirSaldo();

		// Exibir deposito
		conta.depositarDinheiro(2000);

		conta.exibirSaldo();
		
		/*------------------------------------------------*/
		
		var contaDestino = new Conta();
		
		contaDestino.cliente = "Biana";
		contaDestino.saldo = 12400.50;
		
		// Exibir Saldo
		contaDestino.exibirSaldo();
		
		// Exibir Transferência de Biana para Daniel
		contaDestino.transferePara(conta, 1000);
		
		// Exibir Contas Daniel e Biana
		contaDestino.exibirSaldo();
		conta.exibirSaldo();
	}

}
