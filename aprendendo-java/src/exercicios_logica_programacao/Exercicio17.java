package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado:
 * Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética), 
 * informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);
 * */
public class Exercicio17 {

	public static void main(String[] args) {

		String nome;
		double nota1, nota2, nota3;
		double media = 0;
		int continuar;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Entre com o nome do aluno: ");
			nome = scanner.nextLine();

			System.out.println("Entre com a nota 1º: ");
			nota1 = scanner.nextDouble();

			System.out.println("Entre com a nota 2º: ");
			nota2 = scanner.nextDouble();

			System.out.println("Entre com a nota 3º: ");
			nota3 = scanner.nextDouble();

			media = (nota1 + nota2 + nota3) / 3;

			if (media >= 7) {
				System.out.println("Aluno " + nome + " obteve média " + media);
				System.out.println("Aprovado");
			} else if (media > 5 && media < 7) {
				System.out.println("Aluno " + nome + " obteve média " + media);
				System.out.println("Recuperação");
			} else {
				System.out.println("Aluno " + nome + " obteve média " + media);
				System.out.println("Reprovado");
			}

			System.out.println("\n Entre com 1 (Continuar) e 2 (Sair)");
			continuar = scanner.nextInt();

		} while (continuar == 1);

		scanner.close();

	}

}
