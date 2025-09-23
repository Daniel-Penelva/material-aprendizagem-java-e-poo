package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio36 {
	/*
	 * Enunciado: Faça um algoritmo que calcule o valor da conta de luz de uma
	 * pessoa. Sabe-se que o cálculo da conta de luz segue a tabela abaixo: Tipo de
	 * Cliente Valor do KW/h a. (Residência) 0,60; b. (Comércio) 0,48; c.
	 * (Indústria) 1,29.
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int continuar;

		do {

			System.out.println("Entre com a hora gasta de energia: ");
			int hora = scanner.nextInt();

			System.out.println("Entre com a opção: ");
			System.out.println("1. Residência");
			System.out.println("2. Comércio");
			System.out.println("3. Indústria");
			int opcao = scanner.nextInt();
			
			// chamando a função
			System.out.println(tipoClienteValorContaDeLuz(opcao, hora) + " kw/h");

			System.out.println("Deseja continuar - 1 (sim) e 2 (Não): ");
			continuar = scanner.nextInt();
		} while (continuar == 1);

		scanner.close();
		System.out.println("Fim do programa!");

	}

	static double tipoClienteValorContaDeLuz(int opcao, int hora) {
		double calculoContaLuz = 0;

		if (opcao == 1) {
			calculoContaLuz = 0.60 / hora;
			return calculoContaLuz;
		} else if (opcao == 2) {
			calculoContaLuz = 0.48 / hora;
			return calculoContaLuz;
		} else if (opcao == 3) {
			calculoContaLuz = 1.29 / hora;
			return calculoContaLuz;
		} else {
			return 0;
		}
	}

}
