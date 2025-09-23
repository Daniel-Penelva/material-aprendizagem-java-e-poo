package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio27 {
	/*
	 * Enunciado: Faça um algoritmo que leia um número de 1 a 5 e escreva por
	 * extenso. Caso o usuário digite um número que não esteja neste intervalo,
	 * exibir a seguinte mensagem: número inválido;
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[5];

		System.out.println("Digite 5 números entre 1 e 5:");

		for (int i = 0; i < 5; i++) {

			int valor;

			do {

				System.out.println("Número na posição " + (i + 1) + ": ");
				valor = scanner.nextInt();

				if (valor < 1 || valor > 5) {
					System.out.println("Valor inválido! Digite um número entre 1 e 5.");
				}

			} while (valor < 1 || valor > 5);

			// Salva no vetor após validar
			numeros[i] = valor;

		}

		System.out.println("<< Números Escolhidos >>");
		for (int i = 0; i < 5; i++) {
			System.out.println("Posição " + i + " -> Número: " + numeros[i]);
		}

		scanner.close();

	}

}
