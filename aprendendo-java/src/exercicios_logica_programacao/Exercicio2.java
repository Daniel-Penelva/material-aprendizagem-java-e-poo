package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado:
 * Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois números lidos;
 * */
public class Exercicio2 {

	public static void main(String[] args) {

		int numero1;
		int numero2;
		int soma = 0;
		int subtracao = 0;
		double multiplicacao = 0;
		double divisao = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o número 1: ");
		numero1 = scanner.nextInt();

		System.out.println("Entre com o número 2: ");
		numero2 = scanner.nextInt();

		soma = numero1 + numero2;
		System.out.println("Soma -> " + numero1 + " + " + numero2 + " = " + soma);

		subtracao = numero1 - numero2;
		System.out.println("Subtração -> " + numero1 + " - " + numero2 + " = " + subtracao);

		multiplicacao = numero1 * numero2;
		System.out.println("Multiplicacao -> " + numero1 + " x " + numero2 + " = " + multiplicacao);

		if (numero2 > 0) {
			divisao = numero1 / numero2;
			System.out.println("Divisão -> " + numero1 + " / " + numero2 + " = " + divisao);
		} else {
			System.out.println("Não existe divisão com número menor que zero.");
		}
		
		scanner.close();

	}

}
