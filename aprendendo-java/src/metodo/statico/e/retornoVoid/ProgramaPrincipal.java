package metodo.statico.e.retornoVoid;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		int num1, num2;
		Scanner s = new Scanner(System.in);

		System.out.println("Entre com o valor do numero 1 ?");
		num1 = s.nextInt();
		System.out.println("Entre com o valor do numero 2 ?");
		num2 = s.nextInt();

         // OBS. Por ser um m�todo static n�o n�o � poss�vel instanciar (new) um novo objeto. 
		
		somar(num1, num2); // m�todo chamando somar

		
		subtrair(num1, num2); // m�todo chamando subtrair

		
		multiplicar(num1, num2); // m�todo chamando multiplicar

		
		dividir(num1, num2); // m�todo chamando dividir
	}

	
	public static void somar(int num1, int num2) {
		int soma = num1 + num2;
		System.out.println("Soma: " + soma);
	}

	public static void subtrair(int num1, int num2) {
		int subtrai = num1 - num2;
		System.out.println("Subtra��o: " + subtrai);
	}

	public static void multiplicar(int num1, int num2) {
		float multiplica = num1 * num2;
		System.out.println("Multiplica��o: " + multiplica);
	}

	public static void dividir(int num1, int num2) {
		
		if(num2 == 0) {
			System.out.println("N�o existe divis�o com denominador zero!!!");
		}
		
		 System.out.println("Divis�o: " + num1 / num2);
	}
}
