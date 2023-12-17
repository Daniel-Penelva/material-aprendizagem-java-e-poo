package anonimaClasseExemplo2;

// Livro é um item de pedido
public class Livro implements ItemPedido {

	private Integer codigo;

	// Método que pertence a interface ItemPedido que devem ser implementados pelas subclasse Livro
	@Override
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public Integer getCodigo() {
		return codigo;
	}

}
