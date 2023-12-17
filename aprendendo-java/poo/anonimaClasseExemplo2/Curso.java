package anonimaClasseExemplo2;

// Curso é um item de pedido
public class Curso implements ItemPedido {
	
	private Integer codigo;

	// Método que pertence a interface ItemPedido que devem ser implementados pelas subclasse Curso
	@Override
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public Integer getCodigo() {
		return codigo;
	}

}
