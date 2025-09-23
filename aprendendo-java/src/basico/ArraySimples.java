package basico;

import java.util.Arrays;

public class ArraySimples {

	public static void main(String[] args) 
	{
		/*Array = conjuntos indexados(armazenados) de informa��es
		 * 
		 * Paises       posição
		 *
		 * Russia        indice 0
		 * Brasil        indice 1
		 * Inglaterra    indice 2 
		 * Autrália      indice 3
		 * 
		 * */
	  String[] paises = {"Rússia","Brasil","Inglaterra","Austr�lia"};
	  
	  System.out.println("País:" + paises[0]);
	  
	  /*Exemplo de substituiçao de valor armazenado no indice zero*/
	  
	  paises[0] = "Brasil";
	  System.out.println("País:" + paises[0]);
	  
	  /*Exemplo 2 - outra forma de usar um array*/
	  
	  int[] numeroImpares = new int[5];
	  numeroImpares[0] = 1;
	  numeroImpares[1] = 3;
	  numeroImpares[2] = 5;
	  numeroImpares[3] = 7;
	  numeroImpares[4] = 9;
	  
	  for(int i=0; i<5; i++)
	  {
		  System.out.println(numeroImpares[i]); 
	  }
	  
	  /*Exemplo 3 - qual a quantidade de array?*/
	  System.out.println(paises.length);
	  
	 
	  /* Exemplo 4 - Classe utilizada para manipular array - metodo toString() - este m�todo recebe um par�metro */
	  
	  String[] carros = {"Ferrari", "Uno" , "Fusca" , "Porshe"};
	  System.out.println(Arrays.toString(carros));
	  
	  /*Exemplo 5 - m�todo binarySearch() - este m�todo recorre a uma busca de refer�ncia identificando a posi��o */
	  
	  int posicao = Arrays.binarySearch(carros,"Porshe");
	  System.out.println("Valor da posicao: " + posicao);
	  
	  /*Exemplo 6 - m�todo sort() - este m�todo ordena os valores na ordem crescente*/
	  Arrays.sort(carros, 0 , carros.length);
	  System.out.println(Arrays.toString(carros));
	  
	  /*Exemplo 7 - m�todo value() - este m�todo acessa o valor do indice pre-determinado do usuario*/
	  Double[] numerosFracionados = {12.90 , 23.70, 2.70, 4.7};
	  System.out.println(numerosFracionados[1].doubleValue());
			  
	}
}
