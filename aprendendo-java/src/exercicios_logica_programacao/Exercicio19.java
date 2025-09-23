package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio19 {

	/*
	 * Enunciado: Faça um algoritmo que receba a idade de 75 pessoas e mostre
	 * mensagem informando “maior de idade” e “menor de idade” para cada pessoa.
	 * Considere a idade a partir de 18 anos como maior de idade;
	 */

	public static void main(String[] args) {

		int[] idade = new int[10];
		int maior, menor;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < idade.length; i++) {
			System.out.println("Entre com a idade desejado na posição " + (i + 1) + ": ");
			idade[i] = scanner.nextInt();
		}

		maior = idade[0];
		menor = idade[0];

		for (int i = 1; i < idade.length; i++) {
			if (idade[i] > maior) {
				maior = idade[i];
			}
			if (idade[i] < menor) {
				menor = idade[i];
			}
		}

		// Exibição dos resultados
		System.out.println("\nO maior idade é " + maior);
		System.out.println("O menor idade é " + menor);

		scanner.close();

	}

}
