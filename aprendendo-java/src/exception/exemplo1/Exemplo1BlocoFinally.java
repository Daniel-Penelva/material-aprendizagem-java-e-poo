package exception.exemplo1;

import java.util.Scanner;

public class Exemplo1BlocoFinally {
	public static void main(String[] args) {
		
		try {
			int resultado = divide(10, 2);
			System.out.println("Resultado: " + resultado);
			
		} catch (ArithmeticException e) {
			System.out.println("Erro aritm�tico: " + e.getMessage());
			
		} finally {
			System.out.println("Bloco finally sempre � executado.");
		}
	}

	public static int divide(int numerador, int denominador) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com o denominador da divis�o:");
		denominador = scanner.nextInt();
		
		return numerador / denominador;
	}
}

/* Uso do Bloco finally
 * O bloco finally � usado para definir c�digo que ser� executado independentemente de ocorrer ou n�o uma exce��o. Ele � geralmente usado para liberar 
 * recursos ou executar a��es que devem ocorrer, independentemente de uma exce��o ser lan�ada ou n�o.*/
