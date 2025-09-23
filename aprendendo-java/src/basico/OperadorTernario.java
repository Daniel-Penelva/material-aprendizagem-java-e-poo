package basico;

public class OperadorTernario {

	public static void main(String[] args) {

		/*
			 Sintaxe:
			 variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
			 
			 Quando usar o operador ternário
	
			✅ Ideal quando:
			
				A lógica for simples.
				
				Você quer atribuir valor em uma única linha.
				
				O objetivo for clareza e concisão.
			
			❌ Evite quando:
			
				Há muitas condições aninhadas, pois pode deixar o código difícil de ler.
				
				A lógica for mais complexa, onde um if/else tradicional é mais claro.
		 */

		// Exemplo 1 - Verificar se um número é par ou ímpar
		int n = 10;
		String resultado = (n % 2 == 0) ? "Par" : "Impár";
		System.out.println("O número é: " + resultado);

		// Exemplo 2 - Descobrir o maior entre dois números

		int a = 5;
		int b = 10;

		int maior = (a > b) ? a : b;
		System.out.println("O maior número é: " + maior);

		// Exemplo 3 - Mensagem baseada na idade
		int idade = 17;
		String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
		System.out.println(status);

		// Exemplo 4 - Desconto com mais de uma condição (aninhado)
		double valorCompra = 550.0;
		double desconto = (valorCompra > 1000) ? 0.20 : 
			              (valorCompra > 500) ? 0.10 : 0.50;
		System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
	}

}
