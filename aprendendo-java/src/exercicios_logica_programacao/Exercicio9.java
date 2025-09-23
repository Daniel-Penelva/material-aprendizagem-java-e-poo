package exercicios_logica_programacao;

import java.util.Scanner;

/*
 * Enunciado:
 * Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês. Considere fixo o juro da 
 * poupança em 0,07% a. m;
 * */
public class Exercicio9 {

	public static void main(String[] args) {
		
		double valorDepositado;
		double taxaJuros = 0;
		double rendimento = 0;
		double valorFinal = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor depositado: R$ ");
		valorDepositado = scanner.nextDouble();
		
		// Juros da poupança (0,07% ao mês)
		taxaJuros = 0.07/100;
		
		// Cálculo do rendimento
		rendimento = valorDepositado * taxaJuros; 
		valorFinal = valorDepositado + rendimento;
		
		/*
		   Ou... valorFinal = valorDepositado + (valorDepositado * 0.07/100)
		*/
		
		// Exibição dos resultados
        System.out.printf("\nValor depositado: R$ %.2f%n", valorDepositado);
        System.out.printf("Rendimento do mês: R$ %.2f%n", rendimento);
        System.out.printf("Valor após um mês: R$ %.2f%n", valorFinal);

        scanner.close();

	}

}
