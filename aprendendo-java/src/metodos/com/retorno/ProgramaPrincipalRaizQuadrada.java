package metodos.com.retorno;

public class ProgramaPrincipalRaizQuadrada {

	public static void main(String[] args) {
		
		/*Raiz de Pell`s 
		   * 
		   * quero obter a raiz de 27
		   *
		   * obs: vai diminuir com os valores impares ate o limite
		   * 
		   *  1) 27 - 1 = 26 
		   *  2) 26 - 3 = 23
		   *  3) 23 - 5 = 18
		   *  4) 18 - 7 = 11
		   *  5) 11 - 9 = 2 
		   *  
		   *  Foram tomados 5 etapas. Então sabemos que a raiz de 27 começo com o valor 5
		   */
			
			RaizQuadrada raiz = new RaizQuadrada();
			
			int valor = raiz.raizQuadrada(27);
			System.out.println(valor);
	}

}
