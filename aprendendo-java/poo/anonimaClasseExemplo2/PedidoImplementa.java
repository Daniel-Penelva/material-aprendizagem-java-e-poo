package anonimaClasseExemplo2;

public class PedidoImplementa implements Pedido {

	// Método que pertence a interface Pedido que deve ser implementado pela subclasse PedidoImplementa
	// Repare que recebe que o método AdicionarItemPedido recebe como parâmetro o ItemPedido (Interface ItemPedido). 
	@Override
	public void AdicionarItemPedido(ItemPedido itemPedido) {
		
		System.out.println("Adicionado um item");
	}

}
