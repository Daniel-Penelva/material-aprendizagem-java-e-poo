package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio24 {
	/*
	 * Enunciado: Faça um algoritmo que receba um número e mostre uma mensagem caso
	 * este número seja maior que 80, menor que 25 ou igual a 40;
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int continuar;

		do {
			
			System.out.println("Entre com um número: ");
			int numero = scanner.nextInt();

			if (numero > 80) {
				System.out.println("Número maior que 80");
			} else if (numero < 25) {
				System.out.println("Número menor que 25");
			} else if (numero == 40) {
				System.out.println("Número igual a 40");
			} else {
				System.out.println("Número não declarado");
			}

			System.out.println("Entra com 1 (continuar) ou 2 (sair): ");
			continuar = scanner.nextInt();

			while (continuar != 1 && continuar != 2) {
				System.out.print("Entrada inválida. Digite 1 (continuar) ou 2 (sair): ");
				continuar = scanner.nextInt();
			}

		} while (continuar == 1);
		
		scanner.close();

	}

}
