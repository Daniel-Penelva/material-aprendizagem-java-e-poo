package exception.exemplo1;

import java.util.Scanner;

public class ExemploBlocosCatch {
	public static void main(String[] args) {
		
		try {
			int[] array = { 1, 2, 3 };
			int resultado = divideArray(array, 0);   // inserir indice acima de 3 gera erro de �ndice fora do limite 
			System.out.println("Resultado: " + resultado);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro de �ndice fora do limite: " + e.getMessage());
			
		} catch (ArithmeticException e) {
			System.out.println("Erro aritm�tico: " + e.getMessage()); // gera erro se entrar com o denominador igual a zero
			
		} catch (Exception e) {
			System.out.println("Exce��o gen�rica: " + e.getMessage());
		}
	}

	
	public static int divideArray(int[] array, int indice) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com o denominador da divis�o:");
		int denominador = scanner.nextInt();
		
		return array[indice] / denominador;
	}
}

/* M�ltiplos Blocos catch
 * Este exemplo mostra como usar m�ltiplos blocos catch para lidar com diferentes tipos de exce��es. O bloco catch (Exception e) pode ser usado como um 
 * �ltimo recurso para capturar exce��es que n�o foram tratadas pelos blocos catch anteriores.*/
 