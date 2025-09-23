package exercicios_logica_programacao;

import java.util.Iterator;
import java.util.Scanner;

/*
 * Enunciado: 
 * Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
 * */
public class Exercicio14 {

	public static void main(String[] args) {

		int[] numeros = new int[2];
		int maior;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			System.out.println("Entre com o valor desejado na posição " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}

		// Verifica se são distintos
		if (numeros[0] == numeros[1]) {
			System.out.println("\n Os números digitados são iguais. É necessário que sejam distintos.");
		} else {
			// Descobrindo o maior número
			if (numeros[0] > numeros[1]) {
				maior = numeros[0];
			} else {
				maior = numeros[1];
			}

			// Exibindo o resultado
			System.out.println("\nO maior número digitado é: " + maior);
		}

	}

}
