package exception.exemplo3.excecao.personalizada;

public class ProgramaPrincipalProdutoIndisponivel {

	public static void main(String[] args) {
		try {
			comprarProduto(false);
		} catch (ProdutoIndisponivelException e) {
			System.out.println("Produto indisponível: " + e.getMessage());
		}
	}

	public static void comprarProduto(boolean disponivel) {
		if (!disponivel) {
			throw new ProdutoIndisponivelException("Produto não está disponível para compra");
		}
		// Lógica adicional de compra do produto
	}
}

/* Criando uma Exceção de Produto Indisponível (ProdutoIndisponivelException)
 * Neste exemplo, ProdutoIndisponivelException é uma exceção personalizada que estende RuntimeException para indicar que um produto não está disponível para 
 * compra.*/
