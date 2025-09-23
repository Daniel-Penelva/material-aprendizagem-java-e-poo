package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio22 {

	/*
	 * Enunciado: Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo,
	 * idade e saúde) e informe se está apta ou não para cumprir o serviço militar
	 * obrigatório. Informe os totais;
	 */
	public static void main(String[] args) {

		System.out.println("<<< Serviço Militar >>>");

		Scanner scanner = new Scanner(System.in);

		char desejaContinuar = 'S';

		while (desejaContinuar == 's' || desejaContinuar == 'S') {

			System.out.println("Entre com o índice do vetor: ");
			int indice = scanner.nextInt();

			scanner.nextLine(); // Consome o ENTER deixado pelo nextInt()

			String[] nome = new String[indice];
			String[] sexo = new String[indice];
			int[] idade = new int[indice];
			String[] diagnosticoSaude = new String[indice];
			int totalApto = 0;

			for (int i = 0; i < indice; i++) {
				System.out.println("\n--- Pessoa " + (i + 1) + " ---");

				System.out.print("Nome: ");
				nome[i] = scanner.nextLine(); // Nome pode ter espaços

				System.out.print("Sexo (M/F): ");
				sexo[i] = scanner.nextLine().toUpperCase();

				System.out.print("Idade: ");
				idade[i] = scanner.nextInt();
				scanner.nextLine(); // Consome ENTER após idade

				System.out.print("Diagnóstico (A - Apto | R - Reprovado): ");
				diagnosticoSaude[i] = scanner.nextLine().toUpperCase();

			}

			System.out.println("Apto para serviço militar");
			for (int i = 0; i < indice; i++) {
				if (sexo[i].equals("M") || sexo[i].equals("F")) {
					if (idade[i] >= 18 && diagnosticoSaude[i].equals("A")) {
						System.out.println("Nome: " + nome[i] + " | Sexo: " + sexo[i] + " | Idade: " + idade[i]);
						totalApto++;
					}
				}
			}

			System.out.println("\nTotal de Apto para o serviço militar: " + totalApto);

			System.out.println("\nDeseja continuar (S) Sim ou (N) não: " + totalApto);
			desejaContinuar = scanner.next().charAt(0);

		} // fim while

		scanner.close();

	}

}
