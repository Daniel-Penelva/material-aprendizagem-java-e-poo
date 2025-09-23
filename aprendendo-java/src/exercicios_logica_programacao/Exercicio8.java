package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado:
 * Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O algoritmo 
 * deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário;
 * */
public class Exercicio8 {

	public static void main(String[] args) {

		double quantidadeDolar;
		double cotacaoDolar;
		double valorEmReais = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com a quantidade de dólares que você possui: ");
		quantidadeDolar = scanner.nextDouble();

		System.out.println("Entre com a cotação do dólar (R$): ");
		cotacaoDolar = scanner.nextDouble();

		valorEmReais = quantidadeDolar * cotacaoDolar;

		// Exibição dos resultados
		System.out.println("\n--- Resumo Final ---");

		System.out.println("Cotação do Dólar - R$ " + cotacaoDolar);

		System.out.printf("\nO valor em reais é: R$ %.2f%n", valorEmReais);
		
		scanner.close();
	}

}
