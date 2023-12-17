package builder.exemplo2;

import java.math.BigDecimal;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		Produto produtoBasico = new Produto.Builder(1L, "Camiseta B�sica").build();
		System.out.println("Camisa B�sica - Id: " + produtoBasico.getId() + " :: Nome: " + produtoBasico.getNome());
		
		System.out.println("\n\n");

		Produto produtoBasicoComCor = new Produto.Builder(1L, "Camiseta B�sica")
				.cor("Azul")
				.build();
		
		System.out.println("Camisa B�sica com cor - Id: " + produtoBasicoComCor.getId() + " :: Nome: " + produtoBasicoComCor.getNome() + 
				" :: Cor: " + produtoBasicoComCor.getCor());
		
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */

		Produto produtoBasicoComCorDescricao = new Produto.Builder(1L, "Camiseta B�sica")
				.cor("Azul")
				.descricao("Camiseta de Algod�o")
				.build();
		
		System.out.println("Camisa B�sica com cor e descri��o - Id: " + produtoBasicoComCorDescricao.getId() + " :: Nome: " + produtoBasicoComCorDescricao.getNome() + 
				" :: Cor: " + produtoBasicoComCorDescricao.getCor() + " :: Descri��o: " + produtoBasicoComCorDescricao.getDescricao());
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		Produto produtoCamisaCompleto = new Produto.Builder(1L, "Camiseta B�sica")
				.descricao("Camisa Regata de algod�o")
				.valor(new BigDecimal("45.54"))
				.cor("Branco")
				.altura("40")
				.largura("30")
				.comprimento("69")
				.build();
		
		System.out.println("Camisa completa - Id: " + produtoCamisaCompleto.getId() + " :: Nome: " + produtoCamisaCompleto.getNome() + 
				" :: Cor: " + produtoCamisaCompleto.getCor() + " :: Descri��o: " + produtoCamisaCompleto.getDescricao() + 
				" :: Valor: " + produtoCamisaCompleto.getValor() + " :: Altura: " + produtoCamisaCompleto.getAltura() + 
				" :: Largura: " + produtoCamisaCompleto.getLargura() + " :: Comprimento: " + produtoCamisaCompleto.getComprimento());

	}

}
