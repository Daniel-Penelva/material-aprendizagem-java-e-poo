package metodos.comRetorno.e.foraDaClasse;

import java.util.Scanner;

public class ProgramaPrincipalCalculadora {

	public static void main(String[] args) {

		int num1, num2;
		Scanner s = new Scanner(System.in);

		System.out.println("Entre com o valor do numero 1 ?");
		num1 = s.nextInt();
		System.out.println("Entre com o valor do numero 2 ?");
		num2 = s.nextInt();

		Calculadora cal = new Calculadora();

		
		int soma = cal.somar(num1, num2); // m�todo chamando somar
		System.out.println("Soma: " + soma);

		System.out.println("Subtra��o:" + cal.subtrair(num1, num2)); // m�todo chamando subtrair

		float valor_multiplica = cal.multiplicar(num1, num2); // m�todo chamando multiplicar
		System.out.println("Multiplica��o: " + valor_multiplica);

		System.out.println(cal.dividir(num1, num2)); // m�todo chamando dividir

	}

}
