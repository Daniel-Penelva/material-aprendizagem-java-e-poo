package palavra.chaveFinal.exemplo.variavelFinal;

public class ExemploFinalVariavel {
	public static void main(String[] args) {
		
		final int numero = 10;
		
		// número = 20; // Isso resultaria em um erro, pois a variável é final
		System.out.println("Número: " + numero);
	}
}

/*Final em Variáveis:
 * Quando aplicado a uma variável, final indica que seu valor não pode ser alterado depois de ser atribuído.
 * 
 * Neste exemplo, a variável numero é declarada como final, e qualquer tentativa de modificar seu valor resultaria em um erro.*/
