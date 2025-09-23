package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado: 
 * Escreva um algoritmo que leia dez valores inteiro distintos e informe qual é o maior e o menor e indica a posição do maior e menor vetor;
 * */
public class Exercicio15 {

	public static void main(String[] args) {

		int[] numeros = new int[10]; // Vetor com 10 posições
		int maior, menor;
		int posicaoMaior = 0;
		int posicaoMenor = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o número na posição " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}

		// inicializa maior e menor com o primeiro número do vetor.
		maior = numeros[0];
		menor = numeros[0];

		for (int i = 1; i < numeros.length; i++) {

			if (numeros[i] > maior) {
				maior = numeros[i];
				posicaoMaior = i;
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
				posicaoMenor = i;
			}
		}

		// Exibição dos resultados
		System.out.println("\nO maior número é " + maior + " na posição " + (posicaoMaior + 1));
		System.out.println("O menor número é " + menor + " na posição " + (posicaoMenor + 1));

		scanner.close();

	}

}
