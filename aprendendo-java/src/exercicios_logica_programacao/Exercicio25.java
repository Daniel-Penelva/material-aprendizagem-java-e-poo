package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio25 {
	/*
	 * Enunciado: Faça um algoritmo que receba “N” números e mostre positivo,
	 * negativo ou zero para cada número;
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int continuar;

		do {

			System.out.println("Entre com o indice: ");
			int indice = scanner.nextInt();

			int[] numeros = new int[indice];

			for (int i = 0; i < indice; i++) {
				System.out.println("Entre com um número na posição " + (i + 1) + ": ");
				numeros[i] = scanner.nextInt();
			}

			for (int i = 0; i < indice; i++) {
				if (numeros[i] < 0) {
					System.out.println("Número Negativo: " + numeros[i] + " | Posição: " + i);
				} else if (numeros[i] > 0) {
					System.out.println("Número Positivo: " + numeros[i] + " | Posição: " + i);
				} else {
					System.out.println("Número igual a Zero: " + numeros[i] + " | Posição: " + i);
				}
			}

			System.out.println("Entra com 1 (continuar) ou 2 (sair): ");
			continuar = scanner.nextInt();

			while (continuar != 1 && continuar != 2) {
				System.out.print("Entrada inválida. Digite 1 (continuar) ou 2 (sair): ");
				continuar = scanner.nextInt();
			}

		} while (continuar == 1);

		scanner.close();

	}

}
