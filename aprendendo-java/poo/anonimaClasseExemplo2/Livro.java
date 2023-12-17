package anonimaClasseExemplo2;

// Livro � um item de pedido
public class Livro implements ItemPedido {

	private Integer codigo;

	// M�todo que pertence a interface ItemPedido que devem ser implementados pelas subclasse Livro
	@Override
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public Integer getCodigo() {
		return codigo;
	}

}
