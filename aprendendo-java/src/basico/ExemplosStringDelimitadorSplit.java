package basico;

public class ExemplosStringDelimitadorSplit {

	public static void main(String[] args) {
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		System.out.println("\n\n" + "EXEMPLO 1 - Delimitando as Strings atrav�s de ponto e virgula");
		
		String s = "XHTML; CSS; JAVA; JavaScript; JQuery";
		
		// Divide a string em tokens usando o ponto e v�rgula como delimitador
		String[] tokens = s.split(";");
		
		// Itera sobre os tokens e imprime cada um
		System.out.println("Imprimindo utilizando o for");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println("Linguagem de Programa��o: " + tokens[i]);
		}
		
		System.out.println("\n\n" + "Imprimindo utilizando o foreach");
		//ou imprime em foreach
		for (String arrayToken : tokens)
		{
		  System.out.println("Linguagem de Programa��o: " + arrayToken);
		}

		// Imprime o n�mero de tokens na string
		System.out.println("Para saber quantos tokens tem: " + tokens.length);
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		System.out.println("\n\n" + "EXEMPLO 2 - Delimitando as Strings atrav�s de espa�o");
		
		String s1 = "Venha estudar no CEFET!";
		String[] tokens1 = s1.split(" ");
		
		for(int x = 0; x < tokens1.length; x++)
		{
		  System.out.println(tokens1[x]); // Dentro do loop, imprime cada palavra, acessando o elemento no �ndice x do array tokens1.
		}
		
		/*OBS. String[] tokens1 = s1.split(" ");: Usa o m�todo split para dividir a string s1 em um array de strings, usando o espa�o em branco como 
		 * delimitador. Isso resultar� em um array chamado tokens1, onde cada elemento do array � uma palavra da frase.*/
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		System.out.println("\n\n" + "EXEMPLO 3 - Delimitando as Strings atrav�s da virgula");
		
		String lista = "Ferrari,Porsche,Aston Martin,Jaguar";
		String[] carros = lista.split(",");  

		for (String listaCarros : carros) {
			System.out.println("Carros: " + listaCarros);
		}
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		System.out.println("\n\n" + "EXEMPLO 4 - Delimitando as Strings atrav�s de uma express�o regular para dividir por espa�os ou v�rgulas");
		String dados = "Ana,25,Brasil";
		String[] detalhes = dados.split("[,\\s]+");  // A express�o regular [,\\s]+ significa que a string ser� dividida por uma v�rgula ou por um ou mais espa�os em branco.

		for(String listaDetalhes : detalhes) {
			System.out.println("Detalhes: " + listaDetalhes);
		}
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		System.out.println("\n\n" + "EXEMPLO 5 - Delimitando as Strings atrav�s de uma express�o regular para dividir por espa�os ou v�rgulas");
		
		String fraseLonga = "Esta � uma frase longa com muitas palavras";
		String[] palavrasLimitadas = fraseLonga.split(" ", 3); // o m�todo split(" ", 3) limita a divis�o a tr�s substrings.
		
		for (String listaPalavrasLimitadas : palavrasLimitadas) {
			System.out.println("Palavras Limitadas: " + listaPalavrasLimitadas);
		}

	}

}

/*OBS. 
 * String[] tokens = s.split(";");: Usa o m�todo split para dividir a string s em um array de strings, usando o ponto e v�rgula como delimitador. Isso 
 * resultar� em um array chamado tokens, onde cada elemento do array � uma linguagem de programa��o.*/

/**
 * TOKENIZA��O
 * � o processo de pegar grandes peda�os de dados e dividi-los em peda�os pequenos. Quando se fala de tokeniza��o, estamos falando de dados que no inicio 
 * s�o compostos de duas coisas:
 * 
 * 	-> Tokens = s�o os peda�os propriamente dito dos dados.
 * 	-> Delimitadores = s�o as express�es que separam os Tokens um dos outros.
 * 
 * Nas String tem alguns Tokens que representam as tecnologias(HTML; CSS; JAVA) separada pelo delimitador ponto e virgula(;). O processo de partir esses 
 * tokens � a tokeniza��o.
 * 
 * O m�todo split() � um m�todo da classe String em Java e � usado para dividir uma string em substrings com base em um determinado delimitador.
 * 
 * IMPORTANTE!!! � importante mencionar que, se o delimitador for uma express�o regular especial, voc� precisar� escap�-lo corretamente. Por exemplo, para 
 * dividir por um ponto (que � um caractere especial em express�es regulares), voc� deve usar "\\.".
 * 
 * Por exemplo:
 *                                "usuario @ examplo  . com"
 * "usuario@example.com" ------> "[a-zA-Z]+@[a-zA-Z]+\\.com"
*/
