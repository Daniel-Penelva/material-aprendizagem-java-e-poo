package polimorfismo.exemplo4.usando.classeFinal;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Animal pitbul = new Cachorro();
		pitbul.fazerBarulho();
		
		// Tentar criar uma subclasse resultar� em um erro, exemplificando:
		// Cachorro cachorro = new Labrador();
		// cachorro.fazerBarulho();
	}

}

/* Lembrete:
 * 	
 * Vari�vel Final - Modificador final Quando � usada numa variavel n�o pode ser mais alterada, transformando em uma constante. Quando � usada numa vari�vel 
 *                  n�o pode ser mais alterada, transformando em uma constante.
 * 
 * Final na Classe - Qnd aplicar "Final" numa classe, ela n�o vai poder mais ser herdada, ou seja, nenhuma outra classe poder� extender aquela classe.
 * 
 * Final no m�todo - Qnd se usa "Final" no m�todo quer dizer que este m�todo n�o poder� ser sobrescrito na subclasse, ou seja, na classe herdada.
 */
