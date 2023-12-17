package anonimaClasseExemplo2;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Pedido pedido = new PedidoImplementa(); // "pedido" � uma inst�ncia para adicionar os itens do pedido
		
		/* CRIAR OS ITENS DE PEDIDO */
		
		/* EXEMPLO DE ATRIBUI��O AN�NIMA */
		
		// Primeiro Pedido
		ItemPedido item1Livro = new Livro(); // Atribui��o an�nima
		item1Livro.setCodigo(3);  // atribui o n�mero do c�digo do item do Livro
		
		// Segundo Pedido
		ItemPedido item2Curso = new Curso(); // Atribui��o an�nima
		item2Curso.setCodigo(20);  // atribui o n�mero do c�digo do item do Curso 
		
		
		/* EXEMPLO DE USO DE CLASSE AN�NIMA PARA IMPLEMENTAR A INTERFACE */
		
/** OBSERVA��O.
 * As classes an�nimas s�o definidas e instanciadas ao mesmo tempo, diretamente no c�digo onde s�o necess�rias. Ou seja, ao instanciar a interface
* ItemPedido no ProgramaPrincipal ser� criado nesse local espic�fico do c�digo a classe an�nima, contudo, o maior objetivo � evitar a necessidade de criar 
* uma classe separada para implementar os m�todos que est�o na Interface ItemPedido.
* 
* Vale ressaltar que os m�todos setCodigo e getCodigo s�o m�todos obrigat�rios que j� est�o definidos na Interface ItemPedido, LOGO esses m�todos tamb�m 
* ser�o adicionados na classe an�nima. 
* 
* Vale ressaltar tamb�m que podemos criar novos atributos, ou novos m�todos nessa classe an�nima, sem que haja problema na interface ItemPedido. Por exemplo,
* vou criar um atributo nome e seus m�todos getters e setters.    
*  
* */ 
		
		// Terceiro Pedido - Classe An�nima (Foi criada no momento que foi instanciado a interface ItemPedido)
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
			
			// Posso criar os m�todos getters e setters
			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}
			
			// Pode declarar outro m�todo
			public void produtoExcelente() {
				System.out.println("Produto Excelente!!!");
			}
		};
		
		item3Lapis.setCodigo(45); // atribui o n�mero do c�digo do item l�pis
		
		
		// Quarto Pedido - Classe An�nima (Foi criada no momento que foi instanciado a interface ItemPedido)
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
			
			// Posso criar os m�todos getters e setters
			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}
			
			// Pode declarar outro m�todo
			public void produtoExcelente() {
				System.out.println("Produto Excelente!!!");
			}
		};
		
		item4Borracha.setCodigo(60); // atribui o n�mero do c�digo do item l�pis
		
		
		/* IMPRIME - ADICIONANDO OS ITENS PEDIDOS NO PEDIDO */
		pedido.AdicionarItemPedido(item1Livro);
		pedido.AdicionarItemPedido(item2Curso);
		pedido.AdicionarItemPedido(item3Lapis);
		pedido.AdicionarItemPedido(item4Borracha);
		
		System.out.println("\n");
		
		/* IMPRIME - O C�DIGO DO ITEM DE PEDIDO */
		System.out.println("C�digo do item Livro: " + item1Livro.getCodigo());
		System.out.println("C�digo do item Curso: " +item2Curso.getCodigo());
		System.out.println("C�digo do item L�pis: " + item3Lapis.getCodigo());
		System.out.println("C�digo do item Borracha: " + item4Borracha.getCodigo());
		
	}

}
