package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio20 {

	/*
	 * Enunciado: Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e
	 * informe o nome e se ela é homem ou mulher. No final informe total de homens e
	 * de mulheres;
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o valor do índice do vetor: ");
		int indice = scanner.nextInt();
		
		String[] nome = new String[indice];
		String[] sexo = new String[indice];
		
		int totalHomens = 0;
		int totalMulheres = 0;
		
		// Consome a quebra de linha que ficou no buffer
        scanner.nextLine();

		// Entrada de dados
		for (int i = 0; i < indice; i++) {
			System.out.println("Entre com o nome da pessoa na posicao " + (i + 1) + ": ");
			nome[i] = scanner.nextLine();
			System.out.println("Entre com o sexo M (Masculino) e F (Feminio) da pessoa na posicao " + (i + 1) + ": ");
			sexo[i] = scanner.next().toUpperCase();
			
			// Consome o ENTER após o sexo
            scanner.nextLine();
		}

		// Contabiliza a quantidade de sexo masculino e feminino
		for (int i = 0; i < indice; i++) {
			if (sexo[i].equals("M")) {
				totalHomens++;
				// Ou pode fazer assim: totalHomens = totalHomens + 1;
			}
			if (sexo[i].equals("F")) {
				totalMulheres++;
			}
		}

		// Informa sexo masculino
		System.out.println("<<< Nomes e sexo Masculino >>>");
		for (int i = 0; i < indice; i++) {
			if (sexo[i].equals("M")) {
				System.out.println("Nome: " + nome[i] + " | Sexo: " + sexo[i]);
			}
		}

		// Informa sexo feminino
		System.out.println("<<< Nomes e sexo Feminino >>>");
		for (int i = 0; i < indice; i++) {
			if (sexo[i].equals("F")) {
				System.out.println("Nome: " + nome[i] + " | Sexo: " + sexo[i]);
			}
		}

		// Exibição quantidade masculino e feminino
		System.out.println("\nTotal de Sexo Masculino: " + totalHomens);
		System.out.println("Total de Sexo Feminino: " + totalMulheres);
		
		scanner.close();

	}

}
