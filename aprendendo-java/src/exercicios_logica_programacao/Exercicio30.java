package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio30 {
	/*
	 * Enunciado: Faça um algoritmo que receba o número do mês e mostre o mês
	 * correspondente. Valide mês inválido;
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char continuar = 'S';

		while (continuar == 'S') {

			System.out.println("Entre com o número do mês: ");
			int numeroMes = scanner.nextInt();

			if (numeroMes == 1) {
				System.out.println("Janeiro");
			} else if (numeroMes == 2) {
				System.out.println("Fevereiro");
			} else if (numeroMes == 3) {
				System.out.println("Março");
			} else if (numeroMes == 4) {
				System.out.println("Abril");
			} else if (numeroMes == 5) {
				System.out.println("Maio");
			} else if (numeroMes == 6) {
				System.out.println("Junho");
			} else if (numeroMes == 7) {
				System.out.println("Julho");
			} else if (numeroMes == 8) {
				System.out.println("Agosto");
			} else if (numeroMes == 9) {
				System.out.println("Setembro");
			} else if (numeroMes == 10) {
				System.out.println("Outubro");
			} else if (numeroMes == 11) {
				System.out.println("Novembro");
			} else if (numeroMes == 12) {
				System.out.println("Dezembro");
			} else {
				System.out.println("Número de mês inexistente!");
			}

			System.out.println("Deseja Continuar? S (Sim) ou N (Não)");
			continuar = scanner.next().toUpperCase().charAt(0);

		}

		scanner.close();
	}

}
