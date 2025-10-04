package exercicio17_agendamentoDeCompromissos;

public class Agenda {

	private Compromisso[] compromissos;
	private int total;
	private final static int CAPACIDADE = 10;

	public Agenda() {
		compromissos = new Compromisso[CAPACIDADE];
		total = 0;
	}

	// Método para cadastrar na agenda
	public void agendar(String tipo, Data data, Pessoa participante) {
		if (total < CAPACIDADE) {
			compromissos[total++] = new Compromisso(tipo, data, participante);
			System.out.println("Compromisso agendado com sucesso!");
		} else {
			System.out.println("Agenda Cheia!");
		}
	}

	// Método para remover um compromisso
	public void remover(int index) {
		if (index >= 0 && index < total) {
			for (int i = 0; i < total - 1; i++) {
				compromissos[i] = compromissos[i + 1];
			}

			compromissos[--total] = null;
			System.out.println("Compromisso removido com sucesso!.");
		}
	}

	// Método para listar compromissos
	public void listarPorParticipantes(String nome) {
		System.out.println("Compromissos de " + nome + ": ");
		for (int i = 0; i < total; i++) {
			if (compromissos[i].getParticipante().getNome().equalsIgnoreCase(nome)) {
				System.out.println(compromissos[i]);
			}
		}
	}

	// Método para listar por data
	public void listarPorData(Data data) {
		System.out.println("Compromissos em " + data + ":");
		for (int i = 0; i < total; i++) {
			if (compromissos[i].getData().equals(data)) {
				System.out.println(compromissos[i]);
			}
		}
	}

	public void listarTodos() {
		System.out.println("=== Todos os compromissos ===");
		for (int i = 0; i < total; i++) {
			System.out.println(compromissos[i]);
		}
	}

}
