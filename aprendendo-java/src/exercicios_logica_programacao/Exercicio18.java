package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado:
 * Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive);*/
public class Exercicio18 {

	public static void main(String[] args) {

		int[] numeros = new int[10];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Entre com o valor desejado na posição " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}

		System.out.println("<<< Números no intervalo entre 10 até 150 >>>");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= 10 && numeros[i] <= 150) {
				System.out.println("Número:" + numeros[i] + " - Posição: " + i);
			} 
		}
		
		scanner.close();

	}

}
