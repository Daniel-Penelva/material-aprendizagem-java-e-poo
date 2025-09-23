package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio28 {
	/*
	 * Enunciado: A concessionária de veículos “CARANGO” está vendendo os seus
	 * veículos com desconto. Faça um algoritmo que calcule e exiba o valor do
	 * desconto e o valor a ser pago pelo cliente. O desconto deverá ser calculado
	 * sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina
	 * – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados.
	 * Informe total de desconto e total pago pelos clientes;
	 */
	public static void main(String[] args) {

		System.out.println("Concessionária de veículos CARANGO");

		Scanner scanner = new Scanner(System.in);

		int continuar = 0;
		double totalDesconto = 0;
		double totalPago = 0;

		do {

			System.out.println("Entre com o valor do carro: ");
			double valorCarro = scanner.nextDouble();

			System.out.println("Entre com a opção entre 1 a 3:");
			System.out.println("1. Carro Álcool");
			System.out.println("2. Carro Gasolina");
			System.out.println("3. Carro Diesel");
			System.out.println("Qual deseja escolher: ");
			int opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				totalDesconto = valorCarro * 0.25; // 25%
				totalPago = valorCarro - totalDesconto;
				System.out.println("Valor desconto - R$ " + totalDesconto);
				System.out.println("Total a pagar - R$ " + totalPago);
				break;

			case 2:
				totalDesconto = valorCarro * 0.21; // 21%
				totalPago = valorCarro - totalDesconto;
				System.out.println("Valor desconto - R$ " + totalDesconto);
				System.out.println("Total a pagar - R$ " + totalPago);
				break;

			case 3:
				totalDesconto = valorCarro * 0.14; // 14%
				totalPago = valorCarro - totalDesconto;
				System.out.println("Valor desconto - R$ " + totalDesconto);
				System.out.println("Total a pagar - R$ " + totalPago);
				break;

			default:
				System.out.println("Opção Inválida! Tente de novo.");

			}

			System.out.println("Deseja continuar? ");
			System.out.println("0. Sair");
			System.out.println("1. Veiculo");
			continuar = scanner.nextInt();

		} while (continuar == 1);
		
		scanner.close();

	}

}
