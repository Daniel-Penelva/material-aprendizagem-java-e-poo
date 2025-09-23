package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado:
 * Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um 
 * acréscimo de acordo com um percentual informado pelo usuário;
 * */
public class Exercicio11 {

	public static void main(String[] args) {

		double precoCusto;
		double percentual;
		double precoFinal = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o valor de custo do produto R$: ");
		precoCusto = scanner.nextDouble();

		System.out.println("Entre com o valor percentual acrescido (%): ");
		percentual = scanner.nextDouble();

		precoFinal = precoCusto + (precoCusto * percentual / 100);

		// Exibir valores
		System.out.println("Preço de custo R$ " + precoCusto);
		System.out.println("Percentual  acrescido: " + percentual + "%");
		System.out.println("Preço final R$ " + precoFinal);

		scanner.close();

	}

}
