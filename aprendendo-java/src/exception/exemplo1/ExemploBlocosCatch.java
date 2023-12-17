package exception.exemplo1;

import java.util.Scanner;

public class ExemploBlocosCatch {
	public static void main(String[] args) {
		
		try {
			int[] array = { 1, 2, 3 };
			int resultado = divideArray(array, 0);   // inserir indice acima de 3 gera erro de índice fora do limite 
			System.out.println("Resultado: " + resultado);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro de índice fora do limite: " + e.getMessage());
			
		} catch (ArithmeticException e) {
			System.out.println("Erro aritmético: " + e.getMessage()); // gera erro se entrar com o denominador igual a zero
			
		} catch (Exception e) {
			System.out.println("Exceção genérica: " + e.getMessage());
		}
	}

	
	public static int divideArray(int[] array, int indice) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com o denominador da divisão:");
		int denominador = scanner.nextInt();
		
		return array[indice] / denominador;
	}
}

/* Múltiplos Blocos catch
 * Este exemplo mostra como usar múltiplos blocos catch para lidar com diferentes tipos de exceções. O bloco catch (Exception e) pode ser usado como um 
 * último recurso para capturar exceções que não foram tratadas pelos blocos catch anteriores.*/
 