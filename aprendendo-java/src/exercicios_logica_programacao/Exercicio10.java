package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado:
 * A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um algoritmo que receba um valor de uma 
 * compra e mostre o valor das prestações;*/
public class Exercicio10 {

	public static void main(String[] args) {

		double valorCompra;
		double valorPrestacoes = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o valor da compra: ");
		valorCompra = scanner.nextDouble();

		valorPrestacoes = valorCompra / 5;

		System.out.printf("\nO valor em reais é: R$ %.2f%n", valorCompra);
		System.out.printf("\nO valor em reais é: R$ %.2f%n", valorPrestacoes);

		scanner.close();

	}

}
