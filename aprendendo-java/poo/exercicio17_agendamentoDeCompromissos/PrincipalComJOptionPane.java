package exercicio17_agendamentoDeCompromissos;

import javax.swing.JOptionPane;

public class PrincipalComJOptionPane {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		int continuar;

		do {
			// Menu com JOptionPane
			String menu = """
					====== Menu da Agenda ======
					1. Cadastrar
					2. Remover por índice o compromisso
					3. Listar compromisso por nome
					4. Listar compromisso por data
					5. Listar todos os compromissos
					""";

			int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu + "\nEntre com a opção desejada: "));

			switch (opcao) {
			case 1 -> {
				String nome = JOptionPane.showInputDialog("Entre com o nome da Pessoa:");
				String telefone = JOptionPane.showInputDialog("Entre com o telefone da Pessoa:");

				String dataStr = JOptionPane.showInputDialog("Entre com a data de Agendamento (dd MM yyyy):");
				String[] partesData = dataStr.split(" ");
				int dia = Integer.parseInt(partesData[0]);
				int mes = Integer.parseInt(partesData[1]);
				int ano = Integer.parseInt(partesData[2]);

				String tipo = JOptionPane
						.showInputDialog("Entre com o tipo de compromisso - (reunião, pagamento, entrega, etc):");

				Data data = new Data(dia, mes, ano);
				Pessoa pessoa = new Pessoa(nome, telefone);
				Compromisso compromisso = new Compromisso(tipo, data, pessoa);

				agenda.agendar(tipo, data, pessoa);
				JOptionPane.showMessageDialog(null, "Compromisso agendado com sucesso!");
			}

			case 2 -> {
				int remocao = Integer
						.parseInt(JOptionPane.showInputDialog("Entre com o índice do compromisso para remoção:"));
				agenda.remover(remocao);
			}

			case 3 -> {
				String buscarNome = JOptionPane.showInputDialog("Entre com o nome da Pessoa:");
				agenda.listarPorParticipantes(buscarNome);
			}

			case 4 -> {
				String dataBuscaStr = JOptionPane
						.showInputDialog("Entre com a data de Agendamento (dd MM yyyy) para listagem:");
				String[] partesBusca = dataBuscaStr.split(" ");
				int diaL = Integer.parseInt(partesBusca[0]);
				int mesL = Integer.parseInt(partesBusca[1]);
				int anoL = Integer.parseInt(partesBusca[2]);

				Data buscarData = new Data(diaL, mesL, anoL);
				agenda.listarPorData(buscarData);
			}

			case 5 -> agenda.listarTodos();

			default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
			}

			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação",
					JOptionPane.YES_NO_OPTION);

		} while (continuar == JOptionPane.YES_OPTION);

		JOptionPane.showMessageDialog(null, "Programa finalizado!!!");

	}

}
