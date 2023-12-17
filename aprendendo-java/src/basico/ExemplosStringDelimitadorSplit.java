package basico;

public class ExemplosStringDelimitadorSplit {

	public static void main(String[] args) {
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		System.out.println("\n\n" + "EXEMPLO 1 - Delimitando as Strings através de ponto e virgula");
		
		String s = "XHTML; CSS; JAVA; JavaScript; JQuery";
		
		// Divide a string em tokens usando o ponto e vírgula como delimitador
		String[] tokens = s.split(";");
		
		// Itera sobre os tokens e imprime cada um
		System.out.println("Imprimindo utilizando o for");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println("Linguagem de Programação: " + tokens[i]);
		}
		
		System.out.println("\n\n" + "Imprimindo utilizando o foreach");
		//ou imprime em foreach
		for (String arrayToken : tokens)
		{
		  System.out.println("Linguagem de Programação: " + arrayToken);
		}

		// Imprime o número de tokens na string
		System.out.println("Para saber quantos tokens tem: " + tokens.length);
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		System.out.println("\n\n" + "EXEMPLO 2 - Delimitando as Strings através de espaço");
		
		String s1 = "Venha estudar no CEFET!";
		String[] tokens1 = s1.split(" ");
		
		for(int x = 0; x < tokens1.length; x++)
		{
		  System.out.println(tokens1[x]); // Dentro do loop, imprime cada palavra, acessando o elemento no índice x do array tokens1.
		}
		
		/*OBS. String[] tokens1 = s1.split(" ");: Usa o método split para dividir a string s1 em um array de strings, usando o espaço em branco como 
		 * delimitador. Isso resultará em um array chamado tokens1, onde cada elemento do array é uma palavra da frase.*/
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		System.out.println("\n\n" + "EXEMPLO 3 - Delimitando as Strings através da virgula");
		
		String lista = "Ferrari,Porsche,Aston Martin,Jaguar";
		String[] carros = lista.split(",");  

		for (String listaCarros : carros) {
			System.out.println("Carros: " + listaCarros);
		}
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		System.out.println("\n\n" + "EXEMPLO 4 - Delimitando as Strings através de uma expressão regular para dividir por espaços ou vírgulas");
		String dados = "Ana,25,Brasil";
		String[] detalhes = dados.split("[,\\s]+");  // A expressão regular [,\\s]+ significa que a string será dividida por uma vírgula ou por um ou mais espaços em branco.

		for(String listaDetalhes : detalhes) {
			System.out.println("Detalhes: " + listaDetalhes);
		}
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		System.out.println("\n\n" + "EXEMPLO 5 - Delimitando as Strings através de uma expressão regular para dividir por espaços ou vírgulas");
		
		String fraseLonga = "Esta é uma frase longa com muitas palavras";
		String[] palavrasLimitadas = fraseLonga.split(" ", 3); // o método split(" ", 3) limita a divisão a três substrings.
		
		for (String listaPalavrasLimitadas : palavrasLimitadas) {
			System.out.println("Palavras Limitadas: " + listaPalavrasLimitadas);
		}

	}

}

/*OBS. 
 * String[] tokens = s.split(";");: Usa o método split para dividir a string s em um array de strings, usando o ponto e vírgula como delimitador. Isso 
 * resultará em um array chamado tokens, onde cada elemento do array é uma linguagem de programação.*/

/**
 * TOKENIZAÇÃO
 * É o processo de pegar grandes pedaços de dados e dividi-los em pedaços pequenos. Quando se fala de tokenização, estamos falando de dados que no inicio 
 * são compostos de duas coisas:
 * 
 * 	-> Tokens = são os pedaços propriamente dito dos dados.
 * 	-> Delimitadores = são as expressões que separam os Tokens um dos outros.
 * 
 * Nas String tem alguns Tokens que representam as tecnologias(HTML; CSS; JAVA) separada pelo delimitador ponto e virgula(;). O processo de partir esses 
 * tokens é a tokenização.
 * 
 * O método split() é um método da classe String em Java e é usado para dividir uma string em substrings com base em um determinado delimitador.
 * 
 * IMPORTANTE!!! É importante mencionar que, se o delimitador for uma expressão regular especial, você precisará escapá-lo corretamente. Por exemplo, para 
 * dividir por um ponto (que é um caractere especial em expressões regulares), você deve usar "\\.".
 * 
 * Por exemplo:
 *                                "usuario @ examplo  . com"
 * "usuario@example.com" ------> "[a-zA-Z]+@[a-zA-Z]+\\.com"
*/
