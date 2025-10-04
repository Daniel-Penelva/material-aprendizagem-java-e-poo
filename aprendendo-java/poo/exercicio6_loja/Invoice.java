package exercicio6_loja;

public class Invoice {

	private int itemFatura;
	private String descricao;
	private int quantidade;
	private double precoUnitario;

	public Invoice() {

	}

	public Invoice(int itemFatura, String descricao, int quantidade, double precoUnitario) {
		super();
		this.itemFatura = itemFatura;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}

	public int getItemFatura() {
		return itemFatura;
	}

	public void setItemFatura(int itemFatura) {
		this.itemFatura = itemFatura;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {

		if (quantidade <= 0) {
			this.quantidade = 0;
		} else {
			this.quantidade = quantidade;
		}
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {

		if (precoUnitario < 0) {
			this.precoUnitario = 0.0;
		} else {
			this.precoUnitario = precoUnitario;
		}
	}

	public double getInvoiceAmount() {
		double valorFatura = quantidade * precoUnitario;
		return valorFatura;
	}

}
