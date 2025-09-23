package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado:
 * Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final 
 * do mês;*/
public class Exercicio4 {

	public static void main(String[] args) {
		
		String nome;
		double salarioFixo;
		int totalDeVendasMes;
		double comissao;
		double salarioFinal;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o nome: ");
		nome = scanner.nextLine();
		
		System.out.println("Entre com o salário fixo: ");
		salarioFixo = scanner.nextDouble();
		
		System.out.println("Entre com total de vendas: ");
		totalDeVendasMes = scanner.nextInt();
		
		// Cálculo da comissão (15% das vendas = 15/100 = 0.15)
		comissao = totalDeVendasMes * 0.15;
		
		// Salário final
		salarioFinal = salarioFixo + comissao;
		
		// Exibição dos resultados
        System.out.println("\n--- Resumo do Vendedor ---");
        System.out.println("Nome: " + nome);
        System.out.println("Comissão: " + comissao);
        System.out.printf("Salário fixo: R$ %.2f%n", salarioFixo);
        System.out.printf("Salário final (com comissão): R$ %.2f%n", salarioFinal);

        scanner.close();
	}

}
