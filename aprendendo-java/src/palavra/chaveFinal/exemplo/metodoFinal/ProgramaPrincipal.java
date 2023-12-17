package palavra.chaveFinal.exemplo.metodoFinal;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		ExemploMetodoFinal objeto = new ExemploMetodoFinal();
		objeto.metodoFinal(); // Chama o método final da classe base

		Subclasse subclasseObjeto = new Subclasse();
		subclasseObjeto.metodoFinal(); // Chama o método final herdado da classe base
	}
}

/* Final em Métodos:
 * Quando aplicado a um método, final indica que o método não pode ser sobrescrito por subclasses.
 * 
 * A classe ExemploFinalMetodo possui um método metodoFinal marcado como final, e a tentativa de sobrescrevê-lo na Subclasse resultaria em um erro de 
 * compilação.*/
