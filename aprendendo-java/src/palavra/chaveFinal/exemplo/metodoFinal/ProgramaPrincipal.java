package palavra.chaveFinal.exemplo.metodoFinal;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		ExemploMetodoFinal objeto = new ExemploMetodoFinal();
		objeto.metodoFinal(); // Chama o m�todo final da classe base

		Subclasse subclasseObjeto = new Subclasse();
		subclasseObjeto.metodoFinal(); // Chama o m�todo final herdado da classe base
	}
}

/* Final em M�todos:
 * Quando aplicado a um m�todo, final indica que o m�todo n�o pode ser sobrescrito por subclasses.
 * 
 * A classe ExemploFinalMetodo possui um m�todo metodoFinal marcado como final, e a tentativa de sobrescrev�-lo na Subclasse resultaria em um erro de 
 * compila��o.*/
