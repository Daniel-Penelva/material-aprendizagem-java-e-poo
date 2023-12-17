package modelo.diagrama.de.classe;

public class ProgramaPrincipalPedido {

	public static void main(String[] args) {

		Pedido pedido1 = new PedidoImpl();

		ItemPedido livro = new Livro();
		livro.setCodigo(10);
		livro.setDescricao("Harry Potter");
		livro.setValor(250D);

		ItemPedido curso = new Curso();
		curso.setCodigo(5);
		curso.setDescricao("Java Programming");
		curso.setValor(150D);

		pedido1.adicionarItemPedido(livro);
		pedido1.adicionarItemPedido(curso);

		// Imprimir itens antes da ordenação
		System.out.println("Itens do pedido antes da ordenação:");
		for (ItemPedido item : pedido1.getItensPedido()) {
			System.out.println(item);
		}

		// Ordenar os itens
		ItemPedido[] itensOrdenados = pedido1.ordenarItensPedido();

		// Imprimir itens ordenados
		System.out.println("\nItens do pedido após a ordenação:");
		for (ItemPedido item : itensOrdenados) {
			System.out.println(item);
		}

	}

}