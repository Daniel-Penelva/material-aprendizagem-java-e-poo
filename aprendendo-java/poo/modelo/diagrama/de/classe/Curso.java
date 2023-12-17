package modelo.diagrama.de.classe;

public class Curso implements ItemPedido {

	// Atributos espec�ficos do Curso
	private String nome;
	private Integer cargaHoraria;
	private Integer codigo;
	private Double valor;
	private String descricao;
	
	
	/* M�todos espec�ficos do Curso */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	
	/* M�todos obrigatorios implementados da interface ItemPedido */
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	// Sobreescrevendo o m�todo toString() para facilitar a impress�o dos itens
    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + getCodigo() +
                ", valor=" + getValor() +
                ", descricao='" + getDescricao() + '\'' +
                ", nome='" + nome + '\'' +
                ", Carga Hor�rio='" + cargaHoraria +
                '}';
    }

}
