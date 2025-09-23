package scanner;

import java.util.Scanner;

public class ExampleScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Textos longos
		System.out.println("Entre com o nome:");
		String nome = scanner.nextLine();

		// Uma palavra
		System.out.println("Escreva uma frase:");
		String frase = scanner.next();

		System.out.println("Entre com a idade:");
		int idade = scanner.nextInt();

		System.out.println("Entre com a cotação do dólar:");
		float cotacaoDolar = scanner.nextFloat();

		System.out.println("Entre com a altura:");
		double altura = scanner.nextDouble();

		System.out.println("Nome: " + nome);
		System.out.println("Frase: " + frase);
		System.out.println("Idade: " + idade);
		System.out.println("Cotação Dolar: " + cotacaoDolar);
		System.out.println("Cotação Dolar: " + altura);
		
		scanner.close();
	}

}
