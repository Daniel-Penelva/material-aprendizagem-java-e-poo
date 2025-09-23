package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio26 {
	/*
	 * Enunciado: Faça um algoritmo que leia dois números e identifique se são
	 * iguais ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que
	 * eles são iguais. Caso sejam diferentes, informe qual número é o maior, e uma
	 * mensagem que são diferentes;
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o número 1: ");
		int numero1 = scanner.nextInt();

		System.out.println("Entre com o número 2: ");
		int numero2 = scanner.nextInt();

		if (numero1 == numero2) {
			System.out.println("Números iguais");
		} else if (numero1 > numero2) {
			System.out.println("Os números são diferentes");
		    System.out.println(numero1 + " é maior que " + numero2);
		} else {
			System.out.println("Os números são diferentes");
		    System.out.println(numero2 + " é maior que " + numero1);
		}

		scanner.close();

	}

}
