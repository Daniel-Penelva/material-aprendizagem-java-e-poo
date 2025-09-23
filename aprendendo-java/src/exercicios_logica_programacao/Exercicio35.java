package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio35 {
	/*
	 * Enunciado: Elabore um algoritmo que, dada a idade de um nadador.
	 * Classifique-o em uma das seguintes categorias: a. Infantil A = 5 - 7 anos; b.
	 * Infantil B = 8 - 10 anos; c. Juvenil A = 11- 13 anos; d. Juvenil B = 14 - 17
	 * anos; e. Sênior = 18 - 25 anos. Apresentar mensagem “idade fora da faixa
	 * etária” quando for outro ano não contemplado;
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int continuar;

		do {

			System.out.println("Entre com a idade do nadador desejado: ");
			int idade = scanner.nextInt();

			// chamando a função
			tipoCategoriaNatacao(idade);

			System.out.println("Deseja continuar - 1 (sim) e 2 (Não): ");
			continuar = scanner.nextInt();
		} while (continuar == 1);

		scanner.close();
		System.out.println("Fim do programa!");

	}

	static void tipoCategoriaNatacao(int idade) {

		if (idade >= 5 && idade < 8) {
			System.out.println("Infantil A");
		} else if (idade >= 8 && idade < 11) {
			System.out.println("Infantil B");
		} else if (idade >= 11 && idade < 14) {
			System.out.println("Juvenil A");
		} else if (idade >= 14 && idade < 18) {
			System.out.println("Juvenil B");
		} else if (idade >= 18 && idade < 26) {
			System.out.println("Sênior");
		} else {
			System.out.println("Idade fora da faixa etária!");
		}
	}

}
