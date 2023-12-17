package construtores;

public class Cidade {

	private String estado;

	/* CONSTRUTOR */ 
	public Cidade(String estado) {
		this.estado = estado.toUpperCase();
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
