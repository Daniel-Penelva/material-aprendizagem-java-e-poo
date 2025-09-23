package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio21 {
	/*
	 * Enunciado: concessionária de veículos “CARANGO VELHO” está vendendo os seus
	 * veículos com desconto. Faça um algoritmo que calcule e exiba o valor do
	 * desconto e o valor a ser pago pelo cliente de vários carros. O desconto
	 * deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima
	 * de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando
	 * desconto até que a resposta seja: “(N) Não”. Informar total de carros com ano
	 * até 2000 e total geral;
	 */
	public static void main(String[] args) {

		int totalCarroAno2000 = 0;
		int totalCarro = 0;
		String continuar;

		Scanner scanner = new Scanner(System.in);

		System.out.println("<<< concessionária de veículos CARANGO VELHO >>>");

		do {

			System.out.println("Entre com o ano do carro: ");
			int anoDoCarro = scanner.nextInt();

			System.out.println("Entre com o valor pago do carro: ");
			double valorPago = scanner.nextDouble();

			// Define o percentual conforme o ano
			double percentual = (anoDoCarro <= 2000) ? 0.12 : 0.07;

			// Calcula desconto e valor a pagar
			double valorDesconto = valorPago * percentual;
			double valorAPagar = valorPago - valorDesconto;

			// Atualiza contadores
			if (anoDoCarro <= 2000) {
				totalCarroAno2000++;
			}

			totalCarro++;

			// Mostra resultado do carro atual
			System.out.printf("Valor do desconto do carro: R$ %.2f%n", valorDesconto);
			System.out.printf("Valor a ser pago pelo carro: R$ %.2f%n", valorAPagar);

			// Pergunta se deseja continuar (usa next() para evitar problemas com \n)
			System.out.print("Deseja continuar? (S) sim ou (N) não: ");
			continuar = scanner.next().trim().toUpperCase();

			// Valida entrada (se não for S nem N, pergunta novamente)
			while (!continuar.equals("S") && !continuar.equals("N")) {
				System.out.print("Entrada inválida. Digite S ou N: ");
				continuar = scanner.next().trim().toUpperCase();
			}

		} while (continuar.equals("S"));
		
		
		// Exibe totais finais
        System.out.println("\n--- Resumo ---");
        System.out.println("Total de carros com ano até 2000: " + totalCarroAno2000);
        System.out.println("Total geral de carros processados: " + totalCarro);

		scanner.close();

	}

}
