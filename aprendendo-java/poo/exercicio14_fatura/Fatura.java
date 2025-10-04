package exercicio14_fatura;

public class Fatura {

	private String numero;
	private String descricao;
	private int quantidadeItem;
	private double preco;

	// Construtores
	public Fatura() {

	}

	public Fatura(String numero, String descricao, int quantidadeItem, double preco) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.quantidadeItem = quantidadeItem;
		this.preco = preco;
	}

	// Métodos Getters e Setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeItem() {
		return quantidadeItem;
	}

	public void setQuantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// Método para calcular o valor da fatura
	public double getTotalFatura() {

		if (preco < 0) {
			preco = 0;
		}

		double valor = quantidadeItem * preco;

		if (valor < 0) {
			valor = 0;
			return valor;
		} else {
			return valor;
		}
	}

	public void imprimir() {
		System.out.println("====== Dados da Fatura ======");
		System.out.println("Número da fatura: " + numero);
		System.out.println("Descrição da fatura: " + descricao);
		System.out.println("Quantidade comprada de um item: " + quantidadeItem);
		System.out.println("Preço da fatura: " + preco);
		System.out.println("Valor Total da Fatura: " + getTotalFatura());
	}
}
