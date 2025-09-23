package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio32 {
	/*
	 * Enunciado: Dados três valores A, B e C, em que A e B são números reais e C é
	 * um caractere, pede-se para imprimir o resultado da operação de A por B se C
	 * for um símbolo de operador aritmético; caso contrário deve ser impressa uma
	 * mensagem de operador não definido. Tratar erro de divisão por zero;
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String continuar = "S";

		while (continuar.equals("S")) {

			System.out.println("Entre com o valor A de número real: ");
			double valorA = scanner.nextDouble();

			System.out.println("Entre com o valor B de número real: ");
			double valorB = scanner.nextDouble();

			System.out.println("Entre com o valor C de operador aritmético: ");
			String valorC = scanner.next();

			if (valorC.equals("+")) {
				double soma = valorA + valorB;
				System.out.println("soma -> " + valorA + "+" + valorB + "= " + soma);
			} else if (valorC.equals("-")) {
				double subtracao = valorA - valorB;
				System.out.println("subtração -> " + valorA + "-" + valorB + "= " + subtracao);
			} else if (valorC.equals("*")) {
				double multiplicacao = valorA * valorB;
				System.out.println("multiplicacao -> " + valorA + "x" + valorB + "= " + multiplicacao);
			} else if (valorC.equals("/")) {
				double divisao = valorA / valorB;
				if (valorB > 0) {
					System.out.println("divisao -> " + valorA + "/" + valorB + "= " + divisao);
				} else {
					System.out.println("Não existe divisão por zero!");
				}
			} else {
				System.out.println("Inválido! Operador não definido");
			}

			System.out.println("Deseja continuar - S (sim) e N (Não): ");
			continuar = scanner.next().toUpperCase();

		}

		scanner.close();
		System.out.println("Fim do programa!");
	}
}
