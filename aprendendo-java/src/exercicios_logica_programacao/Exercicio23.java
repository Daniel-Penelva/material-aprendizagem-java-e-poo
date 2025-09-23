package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio23 {
	/*
	 * Enunciado: Faça um algoritmo que receba o preço de custo e o preço de venda
	 * de 40 produtos. Mostre como resultado se houve lucro, prejuízo ou empate para
	 * cada produto. Informe o valor de custo de cada produto, o valor de venda de
	 * cada produto, amédia de preço de custo e do preço de venda;
	 */
	public static void main(String[] args) {

		System.out.println("<<< Sistema de Venda >>>");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantos produtos deseja cadastrar? ");
		int quantidadeProdutos = scanner.nextInt();
		scanner.nextLine(); // Consome o ENTER deixado pelo nextInt()

		String[] nomeProduto = new String[quantidadeProdutos];
		double[] precoCusto = new double[quantidadeProdutos];
		double[] precoVenda = new double[quantidadeProdutos];

		double totalPrecoCusto = 0;
		double totalPrecoVenda = 0;

		// ===== Entrada de Dados =====
		for (int i = 0; i < quantidadeProdutos; i++) {
			System.out.println("\n--- Produto " + (i + 1) + " ---");

			System.out.print("Nome do produto: ");
			nomeProduto[i] = scanner.nextLine();

			System.out.print("Preço de Custo: ");
			precoCusto[i] = scanner.nextDouble();

			System.out.print("Preço de Venda: ");
			precoVenda[i] = scanner.nextDouble();

			scanner.nextLine(); // Consome ENTER
		}

		// ===== Processamento e saída =====
		System.out.println("\n<<< Resultado por Produto >>>");
		for (int i = 0; i < quantidadeProdutos; i++) {
			totalPrecoCusto += precoCusto[i];
			totalPrecoVenda += precoVenda[i];

			System.out.printf("%nProduto: %s%n", nomeProduto[i]);
			System.out.printf("Preço de Custo: R$ %.2f | Preço de Venda: R$ %.2f%n", precoCusto[i], precoVenda[i]);

			if (precoCusto[i] > precoVenda[i]) {
				System.out.println("Resultado: Prejuízo");
			} else if (precoCusto[i] < precoVenda[i]) {
				System.out.println("Resultado: Lucro");
			} else {
				System.out.println("Resultado: Empate");
			}
		}

		// ===== Médias =====
		double mediaPrecoCusto = totalPrecoCusto / quantidadeProdutos;
		double mediaPrecoVenda = totalPrecoVenda / quantidadeProdutos;

		System.out.println("\n<<< Resumo Geral >>>");
		System.out.printf("Média de Preço de Custo: R$ %.2f%n", mediaPrecoCusto);
		System.out.printf("Média de Preço de Venda: R$ %.2f%n", mediaPrecoVenda);

		scanner.close();

	}

}
