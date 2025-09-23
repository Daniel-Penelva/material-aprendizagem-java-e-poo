package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado:
 * Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
 * */
public class Exercicio13 {

	public static void main(String[] args) {

		int numero;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com um número: ");
		numero = scanner.nextInt();

		if (numero > 10) {
			System.out.println("Número escolhido é maior que 10.");
		} else {
			System.out.println("Número escolhido é menor que 10.");
		}

		scanner.close();

	}

}
