package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado:
 * Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e 
 * o total de combustível gasto;*/
public class Exercicio3 {

	public static void main(String[] args) {

		double consumoMedio = 0;
		double distanciaTotal;
		double totalCombustivel;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com a distãncia (km) total percorrida pelo automóvel: ");
		distanciaTotal = scanner.nextDouble();

		System.out.println("Entre com o total gasto (L) de combustível: ");
		totalCombustivel = scanner.nextDouble();

		consumoMedio = distanciaTotal / totalCombustivel;

		System.out.println("Consumo médio: " + consumoMedio + " km/l");
		
		scanner.close();

	}

}
