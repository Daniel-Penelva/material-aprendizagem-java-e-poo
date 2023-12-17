package exception.exemplo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2BlocoFinally {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean continua = true;

		do {
			try {

				System.out.println("Entre com o numerador:");
				// armazena o valor
				int numerador = scanner.nextInt();

				System.out.println("Entre com o denominador:");
				int denominador = scanner.nextInt();
				continua = false; // para sair do "do{}while()"

				System.out.println("Resultado = " + numerador / denominador);

			} catch (InputMismatchException e1) {
				System.out.println("ERRO - InputMismatchException");
				System.err.println("O numero deve ser inteiro");

				scanner.nextLine(); // descarta a entrada errada e libera novamente para o usuario.

			} catch (ArithmeticException e2) {
				System.out.println("ERRO - ArithmeticException");
				System.err.println("O numero deve ser diferente de zero");
				e2.printStackTrace();

			} finally {

				System.err.println("Bloco finally sempre é executado.");
			}
		} while (continua);

	}
}
