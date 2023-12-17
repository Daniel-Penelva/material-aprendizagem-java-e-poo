package modelo.diagrama.de.classe;

public class Cidade {

	private String cidade;
	private Estado estado; // relacão unidirecional: uma cidade tem um Estado

	public Cidade() {
		super();
	}

	public Cidade(String cidade, Estado estado) {
		super();
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cidade [cidade=" + cidade + ", estado=" + estado + "]";
	}

}
