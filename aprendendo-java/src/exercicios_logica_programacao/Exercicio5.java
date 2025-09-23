package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado:
 * Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final informar o nome do 
 * aluno e a sua média (aritmética);*/
public class Exercicio5 {

	public static void main(String[] args) {

		String nome;
		double nota1, nota2, nota3;
		double mediaFinal = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o nome: ");
		nome = scanner.nextLine();

		System.out.println("Entre com a nota 1: ");
		nota1 = scanner.nextDouble();

		System.out.println("Entre com a nota 2: ");
		nota2 = scanner.nextDouble();

		System.out.println("Entre com a nota 3: ");
		nota3 = scanner.nextDouble();

		mediaFinal = (nota1 + nota2 + nota3) / 3;

		// Exibição dos resultados
		System.out.println("\n--- Resumo do Aluno e Média Final ---");

		System.out.println("Nome: " + nome);
		System.out.println("Média Final: " + mediaFinal);
		
		scanner.close();

	}

}
