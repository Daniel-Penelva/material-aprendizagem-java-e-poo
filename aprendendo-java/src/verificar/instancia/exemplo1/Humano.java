package verificar.instancia.exemplo1;

public class Humano {

	private String cabeca;
	private String tronco;
	private String membro;

	public Humano() {

	}

	public Humano(String cabeca, String tronco, String membro) {
		super();
		this.cabeca = cabeca;
		this.tronco = tronco;
		this.membro = membro;
	}

	public void setCabeca(String cabeca) {
		this.cabeca = cabeca;
	}

	public String getCabeca() {
		return cabeca;
	}

	public String isTronco() {
		return tronco;
	}

	public void setTronco(String tronco) {
		this.tronco = tronco;
	}

	public String isMembro() {
		return membro;
	}

	public void setMembro(String membro) {
		this.membro = membro;
	}
}
