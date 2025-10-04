package exercicio5_aluno;

import java.util.Scanner;

public class Principal {
	/*
	 * Enunciado: Escreva uma classe cujos objetos representam alunos matriculados
	 * em uma disciplina. Cada objeto dessa classe deve guardar os seguintes dados
	 * do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os
	 * seguintes métodos para esta classe: 
	 * a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2) 
	 * b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int continuar;

		Aluno aluno = new Aluno();

		do {

			System.out.println("Entre com o nome do Aluno: ");
			aluno.setNome(scanner.nextLine());

			System.out.println("Entre com a matrícula: ");
			aluno.setMatricula(scanner.nextLine());

			System.out.println("Entre com a nota 1: ");
			aluno.setNota1(scanner.nextDouble());
			scanner.nextLine();

			System.out.println("Entre com a nota 2: ");
			aluno.setNota2(scanner.nextDouble());
			scanner.nextLine();

			System.out.println("Entre com a nota do trabalho: ");
			aluno.setNotaTrabalho(scanner.nextDouble());
			scanner.nextLine();

			System.out.println("Menu");
			System.out.println("1. Saber Média Final");
			System.out.println("2. Prova Final");
			int opcao = scanner.nextInt();
			scanner.nextLine();

			if (opcao == 1) {
				System.out.println("Aluno " + aluno.getNome() + " teve média " + aluno.media());
			} else if (opcao == 2) {
				System.out.println("Entre com a Média Mínima: ");
				double mediaMinima = scanner.nextDouble();

				System.out.println("Média mínima para aprovação: " + aluno.provaFinal(mediaMinima));
			} else {
				System.out.println("Opção Inválida");
			}

			System.out.println("Deseja continuar?  1 (Sim) e 2 (Não)");
			continuar = scanner.nextInt();
			scanner.nextLine();

		} while (continuar == 1);

		scanner.close();
		System.out.println("Programa finalizado!!!");

	}

}
