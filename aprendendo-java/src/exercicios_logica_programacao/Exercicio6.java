package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado:
 * Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a possuir o valor da 
 * variável B e a variável B passe a possuir o valor da variável A.Apresentar os valores trocados;
 * */
public class Exercicio6 {

	public static void main(String[] args) {
		
		int valorA;
		int valorB;
		int aux;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o valor A: ");
		valorA = scanner.nextInt();
		
		System.out.println("Entre com o valor B: ");
		valorB = scanner.nextInt();
		
		// Exibir valores antes da troca
        System.out.println("\nAntes da troca:");
        System.out.println("A = " + valorA);
        System.out.println("B = " + valorB);
        
        // Troca de valores usando variável auxiliar
        aux = valorA;
        valorA = valorB;
        valorB = aux;
        
        // Exibir valores após a troca
        System.out.println("\nApós a troca:");
        System.out.println("A = " + valorA);
        System.out.println("B = " + valorB);

        scanner.close();

	}

}

/*
 Chinês
 
aux = valorA;     -> aux =  (10)
valorA = valorB;  -> valorA = (20)
valorB = aux;     -> valorB = (10)
        
 */
