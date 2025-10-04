package exercicio4_elevador;

import java.util.Scanner;

public class Principal {
	/*
	 * Enunciado: Crie uma classe denominada Elevador para armazenar as informações
	 * de um elevador dentro de um prédio. A classe deve armazenar o andar atual
	 * (térreo = 0), total de andares no prédio (desconsiderando o térreo),
	 * capacidade do elevador e quantas pessoas estão presentes nele. A classe deve
	 * também disponibilizar os seguintes métodos: a. Inicializa: que deve receber
	 * como parâmetros a capacidade do elevador e o total de andares no prédio (os
	 * elevadores sempre começam no térreo e vazio); b. Entra: para acrescentar uma
	 * pessoa no elevador (só deve acrescentar se ainda houver espaço); c. Sai: para
	 * remover uma pessoa do elevador (só deve remover se houver alguém dentro
	 * dele); d. Sobe: para subir um andar (não deve subir se já estiver no último
	 * andar); e. Desce: para descer um andar (não deve descer se já estiver no
	 * térreo);
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Elevador elevador = new Elevador();

		System.out.println("<< Configuração inicial do elevador >>");
		System.out.print("Informe a capacidade do elevador: ");
		int capacidade = scanner.nextInt();
		scanner.nextLine(); // Limpa buffer

		System.out.print("Informe o total de andares do prédio: ");
		int totalAndares = scanner.nextInt();
		scanner.nextLine(); // Limpa buffer

		elevador.inicializar(capacidade, totalAndares);

		int opcao;
		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1. Entrar uma pessoa");
			System.out.println("2. Sair uma pessoa");
			System.out.println("3. Subir um andar");
			System.out.println("4. Descer um andar");
			System.out.println("5. Exibir status do elevador");
			System.out.println("6. Sair do programa");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				elevador.entra();
				break;
			case 2:
				elevador.sair();
				break;
			case 3:
				elevador.subir();
				break;
			case 4:
				elevador.descer();
				break;
			case 5:
				elevador.exibirStatus();
				break;
			case 6:
				System.out.println("Encerrando o programa...");
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 6);

		scanner.close();

	}

}
