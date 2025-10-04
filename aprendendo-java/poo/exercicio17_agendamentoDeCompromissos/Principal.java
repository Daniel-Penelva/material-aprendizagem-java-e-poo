package exercicio17_agendamentoDeCompromissos;

import java.util.Scanner;

public class Principal {
	/*
	 * Enunciado: O agendamento de compromissos é uma das tarefas mais comuns para
	 * profissionais. Um sistema com essa finalidade deve ser capaz de gerenciar
	 * compromissos, atribuindo a cada um o seu tipo (reunião, pagamento, entrega de
	 * projeto); data; nome do participante ( pessoa, empresa etc) alguém com quem
	 * acontecerá é o compromisso) e seu telefone. Desenvolva um sistema que seja
	 * capaz de fazer operações básicas como agendar, remover e alterar compromissos
	 * e exibir compromissos por participante e por data.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Agenda agenda = new Agenda();

		int continuar;

		do {

			System.out.println("====== Menu da Agenda ======");
			System.out.println("1. Cadastrar");
			System.out.println("2. Remover por indice o compromisso");
			System.out.println("3. Listar compromisso por nome");
			System.out.println("4. Listar compromisso por data");
			System.out.println("5. Listar todos os compromissos");
			System.out.println("Entre com a opção desejada: ");
			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:

				System.out.println("Entre com o nome da Pessoa: ");
				String nome = scanner.nextLine();

				System.out.println("Entre com o telefone da Pessoa: ");
				String telefone = scanner.nextLine();

				System.out.println("Entre com a data de Agendamento (dd MM yyyy): ");
				int dia = scanner.nextInt();
				int mes = scanner.nextInt();
				int ano = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Entre com o tipo de compromisso - (reunião, pagamento, entrega, etc): ");
				String tipo = scanner.nextLine();

				// Criando os objetos
				Data data = new Data(dia, mes, ano);
				Pessoa pessoa = new Pessoa(nome, telefone);
				Compromisso compromisso = new Compromisso(tipo, data, pessoa);

				agenda.agendar(tipo, data, pessoa); // Método para cadastrar o compromisso

				break;

			case 2:

				System.out.println("Entre com o índice do compromisso para remorção: ");
				int remorção = scanner.nextInt();

				agenda.remover(remorção);
				break;

			case 3:
				System.out.println("Entre com o nome da Pessoa: ");
				String buscarNome = scanner.nextLine();

				agenda.listarPorParticipantes(buscarNome);
				break;

			case 4:
				System.out.println("Entre com a data de Agendamento (dd MM yyyy) para listagem: ");
				int diaL = scanner.nextInt();
				int mesL = scanner.nextInt();
				int anoL = scanner.nextInt();
				scanner.nextLine();

				Data buscarData = new Data(diaL, mesL, anoL);

				agenda.listarPorData(buscarData);

				break;

			case 5:

				agenda.listarTodos();
				break;

			default:

				System.out.println("Opção inválida!");
				break;

			}

			System.out.println("Deseja continuar? 1 (Sim) 2 (Não): ");
			continuar = scanner.nextInt();
			scanner.nextLine();

		} while (continuar == 1);

		scanner.close();
		System.out.println("Programa finalizado!!!");

	}

}
