package anonimaClasseExemplo2;

public class PedidoImplementa implements Pedido {

	// M�todo que pertence a interface Pedido que deve ser implementado pela subclasse PedidoImplementa
	// Repare que recebe que o m�todo AdicionarItemPedido recebe como par�metro o ItemPedido (Interface ItemPedido). 
	@Override
	public void AdicionarItemPedido(ItemPedido itemPedido) {
		
		System.out.println("Adicionado um item");
	}

}
