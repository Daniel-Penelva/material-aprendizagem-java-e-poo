package exception.exemplo1;

import java.util.Scanner;

public class Exemplo1BlocoFinally {
	public static void main(String[] args) {
		
		try {
			int resultado = divide(10, 2);
			System.out.println("Resultado: " + resultado);
			
		} catch (ArithmeticException e) {
			System.out.println("Erro aritmético: " + e.getMessage());
			
		} finally {
			System.out.println("Bloco finally sempre é executado.");
		}
	}

	public static int divide(int numerador, int denominador) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com o denominador da divisão:");
		denominador = scanner.nextInt();
		
		return numerador / denominador;
	}
}

/* Uso do Bloco finally
 * O bloco finally é usado para definir código que será executado independentemente de ocorrer ou não uma exceção. Ele é geralmente usado para liberar 
 * recursos ou executar ações que devem ocorrer, independentemente de uma exceção ser lançada ou não.*/
