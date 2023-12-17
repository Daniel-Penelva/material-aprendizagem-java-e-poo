package palavra.chaveFinal.exemplo.classeFinal;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		ExemploFinalClasse objeto = new ExemploFinalClasse();
		objeto.metodo(); // Chama o m�todo da classe final

		// Tentar criar uma subclasse resultar� em um erro, exemplificando:
		// Subclasse subclasseObjeto = new Subclasse();
		// subclasseObjeto.metodo();
	}
}

/* Final em Classes:
 * Quando aplicado a uma classe, final indica que a classe n�o pode ser estendida por outras classes.
 * 
 * A classe ExemploFinalClasse � declarada como final, e qualquer tentativa de criar uma subclasse resultaria em um erro de compila��o.*/ 
 