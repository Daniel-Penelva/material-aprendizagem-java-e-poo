package parseConversao;

import java.util.Scanner;

public class ExemploGeral {

	public static void main(String[] args) {
		
		// Exemplo 1: String -> int
		String valorTexto = "25";
		int numero = Integer.parseInt(valorTexto); // converte para int
		System.out.println("Número inteiro: " + numero);
		
		
		// Exemplo 2: String -> double
		String valorDecimal = "19.75";
		double valor = Double.parseDouble(valorDecimal);
		System.out.println("Número decimal: " + valor);
		
		
		// Exemplo 3: Conversão entre tipos numéricos
		
		/*
		 * Além de parse, você pode converter diretamente entre tipos numéricos, como int para double ou vice-versa.
		 * 
		 * Conversão implícita (automática)
		 * Quando convertemos de um tipo menor para um maior, Java faz isso automaticamente, sem perda de dados.
		 * */
		
		int inteiro = 10;
		double decimal = inteiro; // conversão automática de inteiro para double
		System.out.println(decimal);  // Vai imprimir 10.0
		
		/*
		 * Conversão explícita (cast)
		 * Quando você converte de um tipo maior para um menor, pode haver perda de informação.
		 * Nesse caso, é necessário usar cast — ou seja, informar ao Java que você quer fazer essa conversão.
		 * */
		
		double decimal1 = 9.75;
		int inteiro1 = (int) decimal1; // converte manualmente de double para inteiro
		System.out.println(inteiro1);  // Aqui, o valor decimal perdeu a parte fracionária. Vai imprimir 9
		
		
		// Exemplo 4: Exemplo prático
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String entrada = scanner.nextLine(); // vem como String

        int n = Integer.parseInt(entrada); // converte para int
        System.out.println("Número digitado + 10 = " + (n + 10));

        System.out.print("Digite um número decimal: ");
        double numeroDecimal = Double.parseDouble(scanner.nextLine());
        System.out.println("Número digitado dividido por 2 = " + (numeroDecimal / 2));

        scanner.close();

	}

}
