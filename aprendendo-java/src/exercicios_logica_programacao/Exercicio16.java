package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado:
 * Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;*/
public class Exercicio16 {

	public static void main(String[] args) {

		int numero;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com um número inteiro: ");
		numero = scanner.nextInt();

		if (numero >= 100 && numero <= 200) {
			System.out.println("O número " + numero + " está no intervalo entre 100 e 200");
		} else {
			System.out.println("O número " + numero + " NÃO está no intervalo entre 100 e 200");
		}
		
		scanner.close();

	}

}
