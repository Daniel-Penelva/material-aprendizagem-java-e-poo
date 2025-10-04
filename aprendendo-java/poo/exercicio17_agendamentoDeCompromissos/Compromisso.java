package exercicio17_agendamentoDeCompromissos;

public class Compromisso {

	private String tipo; // reunião, pagamento, entrega, etc
	private Data data;
	private Pessoa participante;

	// Construtor
	public Compromisso(String tipo, Data data, Pessoa participante) {
		super();
		this.tipo = tipo;
		this.data = data;
		this.participante = participante;
	}

	// Método Getters e Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Pessoa getParticipante() {
		return participante;
	}

	public void setParticipante(Pessoa participante) {
		this.participante = participante;
	}

	@Override
	public String toString() {
		return "Compromisso: " + tipo + ", Data: " + data + ", Participante: " + participante;
	}

}
