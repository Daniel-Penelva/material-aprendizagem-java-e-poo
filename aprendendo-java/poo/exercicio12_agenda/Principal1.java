package exercicio12_agenda;

import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {

		Agenda agenda = new Agenda();
		Scanner sc = new Scanner(System.in);
		int continua, opcao;

		do {

			System.out.println("Agenda");
			System.out.println("1. Armazenar Pessoa");
			System.out.println("2. Remover Pessoa");
			System.out.println("3. Buscar Pessoa por nome");
			System.out.println("4. Imprimir Agenda");
			System.out.println("5. Imprimir pessoa por índice");
			System.out.println("Escolha a opção: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:

				System.out.println("Entre com o nome da Pessoa: ");
				String nome = sc.nextLine();

				System.out.println("Entre com a idade da pessoa: ");
				int idade = sc.nextInt();
				sc.nextLine();

				System.out.println("Entre com a altura da pessoa: ");
				float altura = sc.nextFloat();
				sc.nextLine();

				agenda.armazenarPessoa(nome, idade, altura);
				break;

			case 2:

				System.out.println("Entre com o nome da Pessoa para remorção: ");
				String removerPessoa = sc.nextLine();

				agenda.removerPessoa(removerPessoa);
				break;

			case 3:
				System.out.println("Entre com o nome da Pessoa para busca: ");
				String buscarPessoa = sc.nextLine();

				int pos = agenda.buscarPessoa(buscarPessoa);
				System.out.println("Pessoa buscada: " + pos);
				break;

			case 4:
				agenda.imprimirAgenda();
				break;

			case 5:
				System.out.println("Entre com o indice da Pessoa para busca: ");
				int indice = sc.nextInt();
				agenda.imprimirPessoa(indice);
				break;
			}

			System.out.println("Deseja continuar - 1 (Sim) e 2 (Não): ");
			continua = sc.nextInt();
			sc.nextLine();
		} while (continua == 1);

		sc.close();
	}

}
