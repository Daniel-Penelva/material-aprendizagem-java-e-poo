package exercicio4_elevador;

public class Elevador {

	private int andarAtual;
	private int totalAndares;
	private int capacidadeElevador;
	private int pessoasPresentes;

	// construtores
	public Elevador() {

	}

	public Elevador(int andarAtual, int totalAndares, int capacidadeElevador, int pessoasPresentes) {
		super();
		this.andarAtual = andarAtual;
		this.totalAndares = totalAndares;
		this.capacidadeElevador = capacidadeElevador;
		this.pessoasPresentes = pessoasPresentes;
	}

	// Métodos getters e setters
	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}

	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}

	public int getPessoasPresentes() {
		return pessoasPresentes;
	}

	public void setPessoasPresentes(int pessoasPresentes) {
		this.pessoasPresentes = pessoasPresentes;
	}

	// Método para inicializar o elevador
	public void inicializar(int capacidade, int totalAndares) {
		totalAndares = 0;

		if (capacidade <= 0 || totalAndares < 0) {
			System.out.println("Erro: Capacidade e total de andares devem ser valores positivos.");
			return;
		}

		this.capacidadeElevador = capacidade;
		this.totalAndares = totalAndares;
		this.andarAtual = 0; // começa no térreo
		this.pessoasPresentes = 0; // começa sem nenhuma pessoa (vazio)
		System.out.println("Elevador configurado com sucesso!");
	}

	// Método entrar no elevador
	public void entra() {
		if (pessoasPresentes < capacidadeElevador) {
			pessoasPresentes++;
			System.out.println("Uma pessoa entrou. Pessoas no elevador: " + pessoasPresentes);
		} else {
			System.out.println("Elevador cheio! Não é possível entrar mais pessoas.");
		}
	}

	// Método para sair do elevador
	public void sair() {
		if (pessoasPresentes > 0) {
			pessoasPresentes--;
			System.out.println("Uma pessoa saiu. Pessoas no elevador: " + pessoasPresentes);
		} else {
			System.out.println("Elevador vazio! Não há ninguém para sair.");
		}
	}

	// Método para subir no elevador
	public void subir() {
		if (andarAtual < totalAndares) {
			andarAtual++;
			System.out.println("Subindo... Agora no andar: " + andarAtual);
		} else {
			System.out.println("Já estamos no último andar!");
		}
	}

	// Método para descer no elevador
	public void descer() {
		if (andarAtual > 0) {
			andarAtual--;
			System.out.println("Descendo... Agora no andar: " + andarAtual);
		} else {
			System.out.println("Já estamos no térreo!");
		}
	}

	// Método para exibir estado atual
	public void exibirStatus() {
		System.out.println("\n--- STATUS DO ELEVADOR ---");
		System.out.println("Andar atual: " + andarAtual);
		System.out.println("Pessoas no elevador: " + pessoasPresentes + "/" + capacidadeElevador);
		System.out.println("Total de andares (sem contar térreo): " + totalAndares);
		System.out.println("--------------------------\n");
	}

}
