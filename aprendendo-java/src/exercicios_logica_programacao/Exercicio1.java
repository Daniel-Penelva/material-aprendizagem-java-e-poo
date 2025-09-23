package exercicios_logica_programacao;

import java.util.Scanner;

/*Enunciado:
 * Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
*/
public class Exercicio1 {

	public static void main(String[] args) {

		int numero1;
		int numero2;
		int soma = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o número 1: ");
		numero1 = scanner.nextInt();

		System.out.println("Entre com o número 2: ");
		numero2 = scanner.nextInt();

		soma = numero1 + numero2;

		System.out.println("Soma -> " + numero1 + " + " + numero2 + " = " + soma);
		
		scanner.close();

	}

}
