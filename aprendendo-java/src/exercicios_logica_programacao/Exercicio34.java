package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio34 {
	/*
	 * Enunciado: A escola “APRENDER” faz o pagamento de seus professores por
	 * hora/aula. Faça um algoritmo que calcule e exiba o salário de um professor.
	 * Sabe-se que o valor da hora/aula segue a tabela abaixo: a. Professor Nível1
	 * R$12,00 por hora/aula; b. Professor Nível 2 R$17,00 por hora/aula; c.
	 * Professor Nível 3 R$25,00 por hora/aula.
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int continuar;

		System.out.println("Escola Aprender");

		do {

			System.out.println("Entre com a quantidade de horas que deseja: ");
			int hora = scanner.nextInt();

			System.out.println("Entre com a opção: ");
			System.out.println("1. Professor Nível 1");
			System.out.println("2. Professor Nível 2");
			System.out.println("3. Professor Nível 3");
			int opcao = scanner.nextInt();

			// Chamando a função
			tipoProfessor(opcao, hora);

			System.out.println("Deseja continuar - 1 (sim) e 2 (Não): ");
			continuar = scanner.nextInt();
		} while (continuar == 1);

		scanner.close();
		System.out.println("Fim do programa!");

	}

	// Função para verificar o tipo de professor
	static void tipoProfessor(int opcao, int hora) {
		double salario = 0;
		switch (opcao) {
		case 1:
			salario = hora * 12;
			System.out.println("Salario Professor Nível 1 - R$: " + salario);
			break;
		case 2:
			salario = hora * 17;
			System.out.println("Salario Professor Nível 2 - R$: " + salario);
			break;
		case 3:
			salario = hora * 25;
			System.out.println("Salario Professor Nível 3 - R$: " + salario);
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}

}
