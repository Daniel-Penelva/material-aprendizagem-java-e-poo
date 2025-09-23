package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio33 {
	/*
	 * Enunciado: Escreva um algoritmo que leia três valores inteiros e verifique se
	 * eles podem ser os lados de um triângulo. Se forem, informar qual o tipo de
	 * triângulo que eles formam: equilátero, isóscele ou escaleno. Propriedade: o
	 * comprimento de cada lado de um triângulo é menor do que a soma dos
	 * comprimentos dos outros dois lados.
	 * 
	 * a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados
	 * iguais; b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados
	 * iguais. c. Triângulo equilátero é também isóscele; d. Triângulo Escaleno:
	 * aquele que tem os comprimentos de seus três lados diferentes;
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int continuar;

		do {

			System.out.println("Entre com os lados do triângulo");

			System.out.println("Lado 1: ");
			int lado1 = scanner.nextInt();

			System.out.println("Lado 2: ");
			int lado2 = scanner.nextInt();

			System.out.println("Lado 3: ");
			int lado3 = scanner.nextInt();

			if (verificarIntegridadeTriangulo(lado1, lado2, lado3)) {
				System.out.println(verificarTipoTriangulo(lado1, lado2, lado3));
			} else {
				System.out.println("Não é triângulo");
			}

			System.out.println("Deseja continuar - 1 (sim) e 2 (Não): ");
			continuar = scanner.nextInt();

		} while (continuar == 1);

		scanner.close();
		System.out.println("Fim do programa!");

	}

	// Função para verificar se existe algum tipo de triângulo
	static boolean verificarIntegridadeTriangulo(int lado1, int lado2, int lado3) {

		if ((lado1 > lado2 + lado3) || (lado2 > lado1 + lado3) || (lado3 > lado1 + lado2)) {
			return false;
		} else {
			return true;
		}
	}

	static String verificarTipoTriangulo(int lado1, int lado2, int lado3) {
		if ((lado1 == lado2) && (lado2 == lado3)) {
			return "Equilátero";
		} else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
			return "Isósceles é também equilátero";
		} else {
			return "Escaleno";
		}
	}

}

/*Entrada de Dados - teste:
 * Triângulo Equilátero - Exemplo: 5, 5, 5
 * Triângulo Isósceles - Exemplo: 4, 4, 7 ou 3, 5, 3
 * Triângulo Escaleno - Exemplo: 3, 4, 5 
 * Não é um Triângulo - Exemplo: 1, 2, 5 ou 1, 2, 3
 * */
