package basico;

import java.util.Scanner;
import java.util.ArrayList;

public class While {

	public static void main(String[] args) {
		
		/*Exemplo 1
		 * 
		 * while() {} - testa a execu��o no in�cio - est� estrutura � executada zero ou n vezes. OBS. se n�mero for igual 5, o que acontece? o programa 
		 * simplesmente ignora.
		 */

		int numero = 1;

		while (numero < 4) {
			System.out.println(numero);
			numero++;
		}
		System.out.println("n�mero: " + numero);
		System.out.println("\n\n");
		
		
		/* Exemplo 2 */
		ArrayList<String> listaDeProdutos = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Liste seu produto - e para t�rmino digite \"fim\": ");

		String produto;

		/* o programa l� uma linha da entrada do console usando scanner.nextLine() e atribui o resultado � vari�vel produto. O loop continua enquanto a 
		 * string digitada n�o for "fim". 
		 * 
		 * A nega��o ! inverte o resultado da express�o booleana. Portanto, o while continuar� executando enquanto a express�o for falsa, o que significa 
		 * que continuar� enquanto a string digitada pelo usu�rio n�o for igual a "fim".*/
		while (!"fim".equals(produto = scanner.nextLine())) {
			
			listaDeProdutos.add(produto); /* Adiciona produtos na lista de produtos */
		}

		System.out.println(listaDeProdutos.toString()); /* Imprime a lista de produtos usando o m�todo toString() */
		
		
		/*Exemplo 3 - de fibonacci
		   * 
		   *  1 + 2 = [3] -> 2 + 3 = [5] -> 3 + 5 = [8] -> 5 + 8 = [13] -> 8 + 13 = [21] ...
		   * 
		   * */
		
	      int anterior = 0;
	      int proximo = 1;
	      
	      System.out.println(anterior);
	      
	      while(proximo < 500){
	    	  
	      System.out.println(proximo);
	      
	      proximo = proximo + anterior;  // proximo numero fibonacci
	      
	      anterior = proximo - anterior;  //atualizando o numero anterior(soma - anterior)
	      }
	      
	      /* Exemplo 4 */
	      
	      int i = 0;
			 
		  while(i < 10){
				System.out.println("i vale: " + i);
				i = i + 1;
			}
			
			System.out.println("\n");
			
			int j = 0;
			 
			while(j < 10){
				System.out.println("Java � Legal");
				j++;
			}
			
			/* Exemplo 5 */
			
			System.out.println("Exemplo tabuada");
			
		    System.out.println("Digite um valor? ");	
			Scanner s = new Scanner(System.in);
			int valor = s.nextInt();
			
			int w = 0;
			
			while(w <= 10){
			  System.out.println(valor + " x " + w + " = " + valor*w);
			  w++;
			}

	}

}
