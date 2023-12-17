package modelo.diagrama.de.classe;

public interface Pedido {

	public Integer getCodigo();

	public Double calcularValorTotal();

	public void imprimiItens();

	public ItemPedido[] ordenarItensPedido();

	public ItemPedido[] getItensPedido(); // para visualizar os itens do pedido

	public void adicionarItemPedido(ItemPedido itemPedido);

	public void removerItemPedido(ItemPedido itemPedido);
}