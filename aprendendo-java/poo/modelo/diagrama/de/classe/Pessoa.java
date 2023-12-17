package modelo.diagrama.de.classe;

import java.util.Objects;

public class Pessoa {

	private Integer codigo;
	private String nome;
	private Cidade cidade; // Relação unidirecional - uma pessoa mora em uma cidade

	public Pessoa() {
		super();
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
	public Pessoa(String nome, Cidade cidade) {
		super();
		this.nome = nome;
		this.cidade = cidade;
	}

	public Pessoa(Integer codigo, String nome, Cidade cidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
	}

	// Metodos Getters e Setters

	public String getNome() {
		return nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", cidade=" + cidade + "]";
	}
}
