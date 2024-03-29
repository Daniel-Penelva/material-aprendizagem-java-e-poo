package modelo.diagrama.de.classe;

import java.util.Date;

public class Livro implements ItemPedido {

	// Atributos espec�ficos do Livro
	private Integer codigo;
	private Double valor;
	private String descricao;

	private String autor;
	private String editora;
	private Date dataPublicacao;

	/* M�todos Setters e Getters espec�ficos do Livro */
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
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
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", dataPublicacao=" + dataPublicacao +
                '}';
    }
	
	

}