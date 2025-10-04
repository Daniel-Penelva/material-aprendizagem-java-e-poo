package exercicio9_voo;

public class Voo {

	private int numeroVoo;
	private Data data;
	private boolean[] cadeiras; // Array para armazenar ocupação (100 cadeiras no máximo)

	// Construtores
	public Voo() {

	}

	public Voo(int numeroVoo, Data data) {
		this.numeroVoo = numeroVoo;
		this.data = data.clone();
		this.cadeiras = new boolean[100];
	}

	// Métodos Getters e Setters
	public int getNumeroVoo() {
		return numeroVoo;
	}

	public void setNumeroVoo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public boolean[] getCadeiras() {
		return cadeiras;
	}

	public void setCadeiras(boolean[] cadeiras) {
		this.cadeiras = cadeiras;
	}

	// Método para retornar o número próximo da cadeira
	public int proximoLivre() {
		for (int i = 0; i < cadeiras.length; i++) {
			if (!cadeiras[i]) {
				return i + 1; // +1 porque a cadeira começa no número 1
			}
		}
		return -1; // -1 indica que não há cadeiras livres
	}

	// Método que verifica se a cadeira está ocupada.
	public boolean verifica(int numeroCadeira) {
		if (numeroCadeira < 1 || numeroCadeira > cadeiras.length) {
			throw new IllegalArgumentException("Número de cadeira inválido. Deve estar entre 1 e 100.");
		}
		return cadeiras[numeroCadeira - 1];
	}

	// Método que ocupa uma cadeira, retorna true se conseguiu.
	public boolean ocupa(int numeroCadeira) {
		if (numeroCadeira < 1 || numeroCadeira > cadeiras.length) {
			throw new IllegalArgumentException("Número de cadeira inválido. Deve estar entre 1 e 100.");
		}

		if (!cadeiras[numeroCadeira - 1]) {
			cadeiras[numeroCadeira - 1] = true;
			return true; // Cadeira foi ocupada com sucesso
		}

		return false; // Cadeira já estava ocupada
	}

	// Método para retornar o número de vagas disponíveis
	public int vagas() {
		int vagasLivres = 0;
		for (boolean cadeira : cadeiras) {
			if (!cadeira) {
				vagasLivres++;
			}
		}

		return vagasLivres;
	}

	// Método que retorna o núemro do voo
	public int getVoo() {
		return numeroVoo;
	}

	// Método para retornar a data do voo
	public Data data() {
		return data.clone();
	}

	@Override
	public String toString() {
		return "Voo nº " + numeroVoo + " | Data: " + data + " | Vagas disponíveis: " + vagas();
	}

}
