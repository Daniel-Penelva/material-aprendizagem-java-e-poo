package exercicio13_calculadora;

import java.util.Scanner;

public class Principal {
	/*
	 * Enunciado: Crie uma classe Calculadora. Esta classe deve implementar as
	 * operações básicas (soma, subtração, divisão e multiplicação). Utilizando o
	 * conceito de herança crie uma classe chamada calculadora cientifica que
	 * implementa os seguintes cálculos: raizQuadrada e a potencia. Dica utilize a
	 * classe Math do pacote java.lang.
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int continua;

		do {

			System.out.println("Entre com o numero 1: ");
			double n1 = scanner.nextDouble();
			scanner.nextLine();

			System.out.println("Entre com o numero 2: ");
			double n2 = scanner.nextDouble();
			scanner.nextLine();

			Calculadora c = new Calculadora(n1, n2);
			CalculadoraCientifica cc = new CalculadoraCientifica(n1, n2);

			int opcao;

			System.out.println("Menu");
			System.out.println("1. Calculadora");
			System.out.println("2. Calculadora Científica");
			System.out.println("Entre com a opção desejada: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Menu: ");
				System.out.println("1. Soma");
				System.out.println("2. Subtração");
				System.out.println("3. Multiplicação");
				System.out.println("4. Divisão");
				System.out.println("Entre com a opção desejada: ");
				opcao = scanner.nextInt();
				scanner.nextLine();

				if (opcao == 1) {
					System.out.println("Soma - Resultado: " + c.somar());
				} else if (opcao == 2) {
					System.out.println("Subtração - Resultado: " + c.subtracao());
				} else if (opcao == 3) {
					System.out.println("Multiplicação - Resultado: " + c.multiplicacao());
				} else if (opcao == 4) {
					System.out.println("Divisão - Resultado: " + c.divisao());
				} else {
					System.out.println("Opção inválida!");
				}
				break;

			case 2:
				System.out.println("Menu: ");
				System.out.println("1. Potência");
				System.out.println("2. Raiz Quadrado");
				System.out.println("Entre com a opção desejada: ");
				opcao = scanner.nextInt();
				scanner.nextLine();

				if (opcao == 1) {
					System.out.println("Potencia - Resultado: " + cc.potencia());
				} else if (opcao == 2) {
					System.out.println("Raiz Quadrado - Resultado: " + cc.raizQuadrada());
				} else {
					System.out.println("Opção inválida!");
				}
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}

			System.out.println("Deseja continuar? 1 (Sim) 2 (Não): ");
			continua = scanner.nextInt();
			scanner.nextLine();
		} while (continua == 1);

		scanner.close();
		System.out.println("Programa Finalizado!");

	}

}
