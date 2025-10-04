package exercicio12_agenda;

public class Agenda {

	private Pessoa[] pessoas;
	private int capacidade = 3;

	// Construtores
	public Agenda() {
		pessoas = new Pessoa[capacidade];
	}

	// Método Getters e Setters
	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	// Método para armazenar pessoa
	public void armazenarPessoa(String nome, int idade, float altura) {
		for (int i = 0; i < capacidade; i++) {
			if (pessoas[i] == null) {
				pessoas[i] = new Pessoa(nome, idade, altura);
				System.out.println("Pessoa armazenada com sucesso na posicão + " + i);
				return;
			}
		}
		System.out.println("Agenda cheia! Não é possível armazenar mais pessoas.");
	}

	// Método para remover pessoa pelo nome
	public void removerPessoa(String nome) {
		for (int i = 0; i < capacidade; i++) {
			if (pessoas[i] != null && pessoas[i].getNome().equals(nome)) {
				pessoas[i] = null;
				System.out.println("Pessoa removida com sucesso na posição " + i);
				return;
			}
		}
		System.out.println("Pessoa não encontrada.");
	}

	// Método para buscar pessoa pelo nome
	public int buscarPessoa(String nome) {
		for (int i = 0; i < capacidade; i++) {
			if (pessoas[i] != null && pessoas[i].getNome().equals(nome)) {
				return i;
			}
		}
		return -1; // pessoa não encontrada
	}

	// Método para imprimir as pessoas
	public void imprimirAgenda() {
		for (int i = 0; i < capacidade; i++) {
			if (pessoas[i] != null) {
				System.out.print("Posição " + i + ": ");
				pessoas[i].imprimirPessoa();
			}
		}
	}

	// Método imprimir pessoa por índice
	public void imprimirPessoa(int index) {
		for (int i = 0; i < capacidade; i++) {
			if (pessoas[i] != null && index >= 0 && index < capacidade) {
				pessoas[index].imprimirPessoa();
			} else {
				System.out.println("Pessoa não encontrada na posição " + index);
			}
		}
	}

}
