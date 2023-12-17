package palavra.chaveFinal.exemplo.variavelFinal;

public class ExemploFinalVariavel {
	public static void main(String[] args) {
		
		final int numero = 10;
		
		// n�mero = 20; // Isso resultaria em um erro, pois a vari�vel � final
		System.out.println("N�mero: " + numero);
	}
}

/*Final em Vari�veis:
 * Quando aplicado a uma vari�vel, final indica que seu valor n�o pode ser alterado depois de ser atribu�do.
 * 
 * Neste exemplo, a vari�vel numero � declarada como final, e qualquer tentativa de modificar seu valor resultaria em um erro.*/
