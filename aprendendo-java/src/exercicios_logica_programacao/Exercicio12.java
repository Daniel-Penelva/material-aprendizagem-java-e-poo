package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado:
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e dos impostos aplicados 
 * (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre o resultado). Supondo 
 * que o percentual do distribuidor seja de 28% e os impostos 45%, escreva um algoritmo que leia o custo de fábrica de um carro e 
 * informe o custo ao consumidor do mesmo;*/
public class Exercicio12 {

	public static void main(String[] args) {

		double custoFabrica;
		double percentualDistribuidor;
		double impostoAplicado;

		double valorComImpostos = 0;
		double custoConsumidor = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o custo de Fábrica do carro R$ ");
		custoFabrica = scanner.nextDouble();

		System.out.println("Entre com o percentual distribuidor do carro (%) ");
		percentualDistribuidor = scanner.nextDouble();

		System.out.println("Entre com o imposto aplicado do carro (%) ");
		impostoAplicado = scanner.nextDouble();

		// Passo 1: aplicar imposto sobre o custo de fábrica
		valorComImpostos = custoFabrica + (custoFabrica * (impostoAplicado / 100));

		// Passo 2: aplicar percentual do distribuidor sobre o resultado
		custoConsumidor = valorComImpostos + (valorComImpostos * (percentualDistribuidor / 100));

		// Saída
		System.out.printf("\nCusto de fábrica: R$ %.2f%n", custoFabrica);
		System.out.printf("Custo ao consumidor: R$ %.2f%n", custoConsumidor);

		scanner.close();

	}

}
