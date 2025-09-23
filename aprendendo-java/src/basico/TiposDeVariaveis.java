package basico;

import java.util.ArrayList;

public class TiposDeVariaveis {

	public static void main(String[] args) {
		
		// Váriaveis Primitivas
		
		int idade = 23;
		float dolar = 4.5f;
		double salario = 3500.00;
		char letra = 'A';
		boolean ativo = true;
		byte ponto = 0;
		
		
		System.out.println("Idade: " + idade +
				" - Dólar: "+ dolar +
				" - Salário: " + salario +
				" - Letra: " + letra +
			    " - Ativo: " + ativo +
			    " - Ponto: " + ponto );
		
		
		/* Tipos de Referências 
		 * String
		 * Vetor
		 * ArrayList
		 * */
		String nome = "Daniel";
		System.out.println("Nome: " + nome);
		
		int[] numeros = {1, 2, 3, 4};
		for(int n: numeros) {
			System.out.println(n + " ");
		}
		
		
		ArrayList<String> listaDeFrutas = new ArrayList<>();
		listaDeFrutas.add("Banana");
		listaDeFrutas.add("Maça");
		listaDeFrutas.add("Uva");
		
		for (String frutas : listaDeFrutas) {
			System.out.println(frutas + " ");
		}
	}
}

/*
 * Tipos primitivos: valores simples, mais rápidos, ocupam menos memória.
 * Tipos de referência: objetos, coleções ou classes, podem ter métodos e armazenar múltiplos valores.
 * */
