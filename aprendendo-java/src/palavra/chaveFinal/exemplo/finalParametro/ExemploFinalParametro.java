package palavra.chaveFinal.exemplo.finalParametro;

public class ExemploFinalParametro {

	public static void main(String[] args) {
		
		ExemploFinalParametro exemplo = new ExemploFinalParametro();
		exemplo.metodoComParametroFinal(10);
	}
	
	public void metodoComParametroFinal(final int valor) {
		
		// Tentar modificar o valor resultaria em um erro, exemplificando:
		// valor = 20; // Isso resultaria em um erro, pois o parâmetro é final
		System.out.println("Valor dentro do método: " + valor);
	}
}
