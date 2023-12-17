package argumentos.variaveis;

public class ArgumentosEmVariaveis {

	/*
	   * Este exemplo de m�todo � para mostrar uma quantidade de numeros indefinidos, ou seja, 
	   * os tr�s pontos dentro do parametro define esse padrao de colocar quantos valores quiser l� onde 
	   * chama o m�todo na classe principal.
	   * 
	   *  Bom saber: 
	   *  
	   *  double ... numeros
	   *  � o mesmo que escrever assim:   
	   *  double[] numeros
	   *  
	   *  A unica diferen�a � que l� onde chama o m�todo na classe principal seria assim:
	   *  
	   *  double[] numeros = { 1,2,3,4,5,6,7,8,9 }
	   *  double resultado = matematica.soma(numeros);
	   *  
	   *  */	
	   double soma(double ... numeros)
	    {
	    	double total = 0;
	    	
	    	for(double n : numeros)
	    	{
	    		 total += n;
	    	}
	      return total;
	    }
	   
	   
	   /*
	    * Exemplo 2
	    * Errado: String ... titulo -> n�o pode fazer isso n�o pode ter dois argumentos variaveis dentro do 
	    * mesmo m�todo, s� pode terminar com um argumento variavel.
	    * */
	   
	   double multiplicacao(String titulo, double ... valores)
	   {
		  System.out.println(titulo);
		  
		  double valor = 1;
		 
		for(double v : valores)
		  {
		     valor *= v; 
		  }
		 return valor;
	   }
}
