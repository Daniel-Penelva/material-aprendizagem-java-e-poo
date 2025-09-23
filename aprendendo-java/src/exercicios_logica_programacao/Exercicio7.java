package exercicios_logica_programacao;

import java.util.Scanner;

/* Enunciado:
 * Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, 
 * sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;
 * */
public class Exercicio7 {

	public static void main(String[] args) {

		double c;
		double f = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com a temperatura em graus Celsius: ");
		c = scanner.nextDouble();

		f = (9 * c + 160) / 5;

		System.out.println("Conversão em Fahrenheit: " + f);

		scanner.close();

	}

}
