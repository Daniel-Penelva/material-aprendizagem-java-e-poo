package exercicio14_fatura;

import java.util.Scanner;

public class FaturaTeste {
/*Enunciado:
 * Crie uma classe em Java chamada Fatura para uma loja de suprimentos de informática. A classe deve conter quatro atributos:
 * a. número (String);
 * b. descrição (String);
 * c. quantidade comprada de um item (int);
 * d. preço por item (double).
 * A classe deve ter um construtor e os métodos getters e setters. Além disso, forneça um método chamado getTotalFatura que 
 * calcula o valor da fatura e depois retorna o valor como um double. Se o valor não for positivo, ele deve ser alterado para 0. 
 * Se o preço por item não for positivo, ele deve ser alterado para 0. Escreva uma nova classe chamada FaturaTeste (que contenha 
 * o método main) que demonstre as capacidades da classe Fatura.
 * */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o número da Fatura: ");
		String numero = scanner.nextLine();
		
		System.out.println("Entre com a descrição da Fatura: ");
		String descricao = scanner.nextLine();
		
		System.out.println("Entre com a quantidade comprada de um item da fatura: ");
		int quantidade = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Entre com o valor da fatura: ");
		double preco = scanner.nextDouble();
		scanner.nextLine();
		
		Fatura fatura = new Fatura(numero, descricao, quantidade, preco);
		
		fatura.getTotalFatura();
		
		// método para imprimir os dados da fatura
		fatura.imprimir();
		
		scanner.close();
	}

}
