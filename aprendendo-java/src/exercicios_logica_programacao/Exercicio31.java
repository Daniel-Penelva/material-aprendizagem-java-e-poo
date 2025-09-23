package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio31 {
	/*
	 * Enunciado: Escreva um algoritmo que leia três valores inteiros distintos e os
	 * escreva em ordem crescente;
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int continuar = 0;
		int[] numeros = new int[3];

		do {

			for (int i = 0; i < numeros.length; i++) {
				System.out.println("Entre com o número na posição " + (i + 1) + ": ");
				numeros[i] = scanner.nextInt();
			}

			int aux;

			for (int i = 0; i < numeros.length; i++) {
				for (int j = i + 1; j < numeros.length; j++) {

					if (numeros[i] > numeros[j]) {
						aux = numeros[i];
						numeros[i] = numeros[j];
						numeros[j] = aux;
					}

				}
			}
			
			
			System.out.println("Números em ordem crescente");
			for (int i = 0; i < numeros.length; i++) {
				System.out.println(numeros[i]);
			}

			// Ou pode fazer assim - descrescente

			for (int i = 0; i < numeros.length - 1; i++) {
				for (int j = 0; j < numeros.length - i - 1; j++) {
					if (numeros[j] < numeros[j + 1]) {  // só altera o operador para <
						aux = numeros[j];
						numeros[j] = numeros[j + 1];
						numeros[j + 1] = aux;
					}
				}
			}

			System.out.println("Números em ordem decrescente");
			for (int i = 0; i < numeros.length; i++) {
				System.out.println(numeros[i]);
			}

			System.out.println("Desejan continuar - digite: 1 (Sim) e 2 (Não)");
			continuar = scanner.nextInt();

			while (continuar != 1 && continuar != 2) {
				System.out.print("Entrada inválida. Digite 1 (continuar) ou 2 (sair): ");
				continuar = scanner.nextInt();
			}

		} while (continuar == 1);
		
		System.out.println("Fim do programa!");
		scanner.close();

	}

}
