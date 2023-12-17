package exception.exemplo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2TratamentoExcecao {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean continua = true;

		do {
			try {

				dividir(s);
				continua = false; // para sair do "do{}while()"

			} catch (InputMismatchException | ArithmeticException e1) { // denominador deve ser inteiro | numerador não pode ser igual a zero
				
				System.err.println("O numero é inválido");
				e1.getMessage();
				s.nextLine();
			}

		} while (continua);

	}
	
	public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException {
		
		System.out.println("Entre com o numerador:");
		int numerador = s.nextInt();

		System.out.println("Entre com o denominador:");
		int denominador = s.nextInt();

		System.out.println("Resultado = " + numerador / denominador);
	}

}
