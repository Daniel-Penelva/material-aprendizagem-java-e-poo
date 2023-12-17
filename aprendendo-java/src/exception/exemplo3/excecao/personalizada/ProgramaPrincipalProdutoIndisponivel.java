package exception.exemplo3.excecao.personalizada;

public class ProgramaPrincipalProdutoIndisponivel {

	public static void main(String[] args) {
		try {
			comprarProduto(false);
		} catch (ProdutoIndisponivelException e) {
			System.out.println("Produto indispon�vel: " + e.getMessage());
		}
	}

	public static void comprarProduto(boolean disponivel) {
		if (!disponivel) {
			throw new ProdutoIndisponivelException("Produto n�o est� dispon�vel para compra");
		}
		// L�gica adicional de compra do produto
	}
}

/* Criando uma Exce��o de Produto Indispon�vel (ProdutoIndisponivelException)
 * Neste exemplo, ProdutoIndisponivelException � uma exce��o personalizada que estende RuntimeException para indicar que um produto n�o est� dispon�vel para 
 * compra.*/
