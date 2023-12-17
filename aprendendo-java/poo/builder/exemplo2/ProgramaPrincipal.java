package builder.exemplo2;

import java.math.BigDecimal;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		Produto produtoBasico = new Produto.Builder(1L, "Camiseta Básica").build();
		System.out.println("Camisa Básica - Id: " + produtoBasico.getId() + " :: Nome: " + produtoBasico.getNome());
		
		System.out.println("\n\n");

		Produto produtoBasicoComCor = new Produto.Builder(1L, "Camiseta Básica")
				.cor("Azul")
				.build();
		
		System.out.println("Camisa Básica com cor - Id: " + produtoBasicoComCor.getId() + " :: Nome: " + produtoBasicoComCor.getNome() + 
				" :: Cor: " + produtoBasicoComCor.getCor());
		
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */

		Produto produtoBasicoComCorDescricao = new Produto.Builder(1L, "Camiseta Básica")
				.cor("Azul")
				.descricao("Camiseta de Algodão")
				.build();
		
		System.out.println("Camisa Básica com cor e descrição - Id: " + produtoBasicoComCorDescricao.getId() + " :: Nome: " + produtoBasicoComCorDescricao.getNome() + 
				" :: Cor: " + produtoBasicoComCorDescricao.getCor() + " :: Descrição: " + produtoBasicoComCorDescricao.getDescricao());
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		Produto produtoCamisaCompleto = new Produto.Builder(1L, "Camiseta Básica")
				.descricao("Camisa Regata de algodão")
				.valor(new BigDecimal("45.54"))
				.cor("Branco")
				.altura("40")
				.largura("30")
				.comprimento("69")
				.build();
		
		System.out.println("Camisa completa - Id: " + produtoCamisaCompleto.getId() + " :: Nome: " + produtoCamisaCompleto.getNome() + 
				" :: Cor: " + produtoCamisaCompleto.getCor() + " :: Descrição: " + produtoCamisaCompleto.getDescricao() + 
				" :: Valor: " + produtoCamisaCompleto.getValor() + " :: Altura: " + produtoCamisaCompleto.getAltura() + 
				" :: Largura: " + produtoCamisaCompleto.getLargura() + " :: Comprimento: " + produtoCamisaCompleto.getComprimento());

	}

}
