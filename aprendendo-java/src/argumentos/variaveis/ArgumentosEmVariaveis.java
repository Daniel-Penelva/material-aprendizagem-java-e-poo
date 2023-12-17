package argumentos.variaveis;

public class ArgumentosEmVariaveis {

	/*
	   * Este exemplo de método é para mostrar uma quantidade de numeros indefinidos, ou seja, 
	   * os três pontos dentro do parametro define esse padrao de colocar quantos valores quiser lá onde 
	   * chama o método na classe principal.
	   * 
	   *  Bom saber: 
	   *  
	   *  double ... numeros
	   *  É o mesmo que escrever assim:   
	   *  double[] numeros
	   *  
	   *  A unica diferença é que lá onde chama o método na classe principal seria assim:
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
	    * Errado: String ... titulo -> não pode fazer isso não pode ter dois argumentos variaveis dentro do 
	    * mesmo método, só pode terminar com um argumento variavel.
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
