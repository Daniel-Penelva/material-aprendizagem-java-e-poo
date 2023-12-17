package arrayListExemplo;

public class Disciplina {

	private String codigo;
	private String nome;
	private Integer creditos;

	public Disciplina() {
		super();
	}

	public Disciplina(String codigo, String nome, Integer creditos) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.creditos = creditos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", creditos=" + creditos + "]";
	}
	
}
