package assertion;

import java.util.Scanner;

public class Exemplo2Assertion {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Entre com um numero de 0 a 10?");
		int numero = s.nextInt();

		assert (numero >= 0 && numero <= 10) : "Numero Inválido" + numero;

		System.out.println("Código continua a execução após a assertiva.");
	}
}
