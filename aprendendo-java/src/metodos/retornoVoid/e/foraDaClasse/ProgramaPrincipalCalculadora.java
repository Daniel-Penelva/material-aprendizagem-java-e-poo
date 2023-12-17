package metodos.retornoVoid.e.foraDaClasse;

import java.util.Scanner;

public class ProgramaPrincipalCalculadora {

	public static void main(String[] args) {

		int num1, num2;
		Scanner s = new Scanner(System.in);

		System.out.println("Entre com o valor do numero 1 ?");
		num1 = s.nextInt();
		System.out.println("Entre com o valor do numero 2 ?");
		num2 = s.nextInt();

		Calculadora cal = new Calculadora(); // Vamos precisar instanciar um objeto para pegar o num1 e num2...
		
		cal.somar(num1, num2); // método chamando somar

		cal.subtrair(num1, num2);// método chamando subtrair
		
		cal.multiplicar(num1, num2);// método chamando multiplicar
		
		cal.dividir(num1, num2);// método chamando dividir

	}

}
