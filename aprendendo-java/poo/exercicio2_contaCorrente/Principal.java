package exercicio2_contaCorrente;

import java.util.Scanner;

public class Principal {
	/*
	 * Enunciado: Crie uma classe para implementar uma ContaCorrente. A classe deve
	 * possuir os seguintes atributos: número da conta, nome do correntista e saldo.
	 * Os métodos são os seguintes: alterarNome, depósito e saque; No construtor,
	 * saldo é opcional, com valor default zero e os demais atributos são
	 * obrigatórios.
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ContaCorrente cc = new ContaCorrente();
		int continuar;

		do {

			System.out.println("Menu");
			System.out.println("1. Cadastrar dados conta corrente");
			System.out.println("2. Alterar nome correntista");
			System.out.println("3. Depositar");
			System.out.println("4. Sacar");
			System.out.println("5. Mostrar Dados da conta");
			System.out.println("Entre com a sua opção: ");
			int opcao = scanner.nextInt();
			scanner.nextLine(); // Limpa o buffer do teclado
			
			double valor;

			switch (opcao) {
			case 1:

				System.out.println("Entre com o nome do correntista: ");
				cc.setNomeCorrentista(scanner.nextLine());

				System.out.println("Entre com o número da conta: ");
				cc.setNumeroConta(scanner.nextLine());

				System.out.println("Entre com o saldo inicial: ");
				cc.setSaldo(scanner.nextDouble());
				scanner.nextLine(); // Limpa buffer

				System.out.println("Conta cadastrada com sucesso!");
				cc.imprimirDados();
				break;

			case 2:
				System.out.println("Entre com o novo nome do correntista: ");
				String novoNome = scanner.nextLine();

				cc.alterarNome(novoNome); // chamando o método
				break;

			case 3:
				// Manipulando Deposito
				System.out.println("Entre com valor do Deposito:");
				valor = scanner.nextDouble();

				cc.deposito(valor); // chamando o método depositar
				break;

			case 4:
				// Manipulando Saque
				System.out.println("Entre com valor do Saque:");
				valor = scanner.nextDouble();

				cc.sacar(valor); // chamando o método sacar
				break;

			case 5:
				cc.imprimirDados();
				break;

			default:
				System.out.println("Opção Inválida");
				break;

			}

			System.out.println("Deseja continuar: Digite 1 (Sim) ou 2 (Não)");
			continuar = scanner.nextInt();
			scanner.nextLine(); // Limpa buffer

		} while (continuar == 1);

		System.out.println("Programa encerrado. Obrigado!");
		scanner.close();

	}

}
