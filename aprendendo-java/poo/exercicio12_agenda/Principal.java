package exercicio12_agenda;

import java.util.Scanner;

public class Principal {
	/*
	 * Enunciado: Crie uma classe Agenda que pode armazenar 10 pessoas e que seja
	 * capaz de realizar as seguintes operações: a. void armazenarPessoa(String
	 * nome, int idade, float altura); //armazena a pessoa em um array b. void
	 * removerPessoa(String nome); //remove a pessoa do array c. int
	 * buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
	 * d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
	 * e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na
	 * posição “i” da agenda.
	 */
	public static void main(String[] args) {

		Agenda agenda = new Agenda();
		Scanner sc = new Scanner(System.in);

		// Exemplo de cadastro
		agenda.armazenarPessoa("Alice", 25, 1.65f);
		agenda.armazenarPessoa("Bruno", 30, 1.80f);
		agenda.armazenarPessoa("Carla", 22, 1.70f);

		// Imprimir toda a agenda
		agenda.imprimirAgenda();

		// Buscar pessoa
		int pos = agenda.buscarPessoa("Bruno");
		System.out.println("Bruno está na posição: " + pos);

		// Remover pessoa
		agenda.removerPessoa("Alice");

		// Imprimir agenda novamente
		agenda.imprimirAgenda();

		// Imprimir pessoa por índice
		agenda.imprimirPessoa(1);

		sc.close();

	}

}
