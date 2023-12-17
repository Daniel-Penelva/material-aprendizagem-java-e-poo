package polimorfismo.exemplo4.usando.classeFinal;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Animal pitbul = new Cachorro();
		pitbul.fazerBarulho();
		
		// Tentar criar uma subclasse resultará em um erro, exemplificando:
		// Cachorro cachorro = new Labrador();
		// cachorro.fazerBarulho();
	}

}

/* Lembrete:
 * 	
 * Variável Final - Modificador final Quando é usada numa variavel não pode ser mais alterada, transformando em uma constante. Quando é usada numa variável 
 *                  não pode ser mais alterada, transformando em uma constante.
 * 
 * Final na Classe - Qnd aplicar "Final" numa classe, ela não vai poder mais ser herdada, ou seja, nenhuma outra classe poderá extender aquela classe.
 * 
 * Final no método - Qnd se usa "Final" no método quer dizer que este método não poderá ser sobrescrito na subclasse, ou seja, na classe herdada.
 */
