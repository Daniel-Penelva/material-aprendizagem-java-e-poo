package anonimaClasseExemplo2;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Pedido pedido = new PedidoImplementa(); // "pedido" é uma instância para adicionar os itens do pedido
		
		/* CRIAR OS ITENS DE PEDIDO */
		
		/* EXEMPLO DE ATRIBUIÇÃO ANÔNIMA */
		
		// Primeiro Pedido
		ItemPedido item1Livro = new Livro(); // Atribuição anônima
		item1Livro.setCodigo(3);  // atribui o número do código do item do Livro
		
		// Segundo Pedido
		ItemPedido item2Curso = new Curso(); // Atribuição anônima
		item2Curso.setCodigo(20);  // atribui o número do código do item do Curso 
		
		
		/* EXEMPLO DE USO DE CLASSE ANÔNIMA PARA IMPLEMENTAR A INTERFACE */
		
/** OBSERVAÇÃO.
 * As classes anônimas são definidas e instanciadas ao mesmo tempo, diretamente no código onde são necessárias. Ou seja, ao instanciar a interface
* ItemPedido no ProgramaPrincipal será criado nesse local espicífico do código a classe anônima, contudo, o maior objetivo é evitar a necessidade de criar 
* uma classe separada para implementar os métodos que estão na Interface ItemPedido.
* 
* Vale ressaltar que os métodos setCodigo e getCodigo são métodos obrigatórios que já estão definidos na Interface ItemPedido, LOGO esses métodos também 
* serão adicionados na classe anônima. 
* 
* Vale ressaltar também que podemos criar novos atributos, ou novos métodos nessa classe anônima, sem que haja problema na interface ItemPedido. Por exemplo,
* vou criar um atributo nome e seus métodos getters e setters.    
*  
* */ 
		
		// Terceiro Pedido - Classe Anônima (Foi criada no momento que foi instanciado a interface ItemPedido)
		ItemPedido item3Lapis = new ItemPedido() {
			
			private int codigo;
			private String nome; // posso criar um novo atributo chamado "nome"
			
			@Override
			public void setCodigo(Integer codigo) {
				this.codigo = codigo;
			}
			
			@Override
			public Integer getCodigo() {
				return codigo;
			}
			
			// Posso criar os métodos getters e setters
			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}
			
			// Pode declarar outro método
			public void produtoExcelente() {
				System.out.println("Produto Excelente!!!");
			}
		};
		
		item3Lapis.setCodigo(45); // atribui o número do código do item lápis
		
		
		// Quarto Pedido - Classe Anônima (Foi criada no momento que foi instanciado a interface ItemPedido)
		ItemPedido item4Borracha = new ItemPedido() {
			
			private int codigo;
			private String nome; // posso criar um novo atributo chamado "nome"
			
			@Override
			public void setCodigo(Integer codigo) {
				this.codigo = codigo;
			}
			
			@Override
			public Integer getCodigo() {
				return codigo;
			}
			
			// Posso criar os métodos getters e setters
			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}
			
			// Pode declarar outro método
			public void produtoExcelente() {
				System.out.println("Produto Excelente!!!");
			}
		};
		
		item4Borracha.setCodigo(60); // atribui o número do código do item lápis
		
		
		/* IMPRIME - ADICIONANDO OS ITENS PEDIDOS NO PEDIDO */
		pedido.AdicionarItemPedido(item1Livro);
		pedido.AdicionarItemPedido(item2Curso);
		pedido.AdicionarItemPedido(item3Lapis);
		pedido.AdicionarItemPedido(item4Borracha);
		
		System.out.println("\n");
		
		/* IMPRIME - O CÓDIGO DO ITEM DE PEDIDO */
		System.out.println("Código do item Livro: " + item1Livro.getCodigo());
		System.out.println("Código do item Curso: " +item2Curso.getCodigo());
		System.out.println("Código do item Lápis: " + item3Lapis.getCodigo());
		System.out.println("Código do item Borracha: " + item4Borracha.getCodigo());
		
	}

}
