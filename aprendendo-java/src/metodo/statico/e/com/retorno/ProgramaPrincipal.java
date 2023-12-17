package metodo.statico.e.com.retorno;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		int num1, num2;
		Scanner s = new Scanner(System.in);

		System.out.println("Entre com o valor do numero 1 ?");
		num1 = s.nextInt();
		System.out.println("Entre com o valor do numero 2 ?");
		num2 = s.nextInt();

		System.out.println("Soma: " + somar(num1, num2)); // método chamando somar

		System.out.println("Subtração: " + subtrair(num1, num2)); // método chamando subtrair

		System.out.println("Multiplica: " + multiplicar(num1, num2)); // método chamando multiplicar

		System.out.println("Divisão: " + dividir(num1, num2)); // método chamando dividir

	}

	public static int somar(int num1, int num2) {
		int soma;
		soma = num1 + num2;
		return soma;
	}

	public static int subtrair(int num1, int num2) {

		return num1 - num2;
	}

	public static float multiplicar(int num1, int num2) {

		return num1 * num2;
	}

	public static float dividir(int num1, int num2) {

		try {
			return num1 / num2;

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
