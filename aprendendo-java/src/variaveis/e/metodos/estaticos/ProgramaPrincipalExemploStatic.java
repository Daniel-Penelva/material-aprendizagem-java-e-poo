package variaveis.e.metodos.estaticos;

public class ProgramaPrincipalExemploStatic {

	public static void main(String[] args) {

		/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO 1 <<<<<<<<<<<<<<<<<<<<<<< */
		ExemplosStatic.metodoEstatico();

		/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO 2 <<<<<<<<<<<<<<<<<<<<<<< */
		int valor = ExemplosStatic.contador;
		System.out.println("Atributo static: " + valor);

		int valorIncremento = ++ExemplosStatic.contador;
		System.out.println("Atributo static: " + valorIncremento);

		/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO 3 <<<<<<<<<<<<<<<<<<<<<<< */
		double resultado = ExemplosStatic.multiplicacao(10, 5);
		System.out.println("Resultado: " + resultado);
		
		/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO 4 <<<<<<<<<<<<<<<<<<<<<<< */
		 ExemplosStatic instancia = ExemplosStatic.criarInstancia(10);
		 System.out.println(instancia);

	}

	/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO 5 - BLOCO EST�TICO <<<<<<<<<<<<<<<<<<<<<<< */
	public static int numero;

	static {
		numero = 42;
		System.out.println("Bloco est�tico executado e o n�mero � " + numero);
	}
	
/* O bloco est�tico � chamado automaticamente quando a classe � carregada pela primeira vez pelo ClassLoader. N�o � necess�rio chamar explicitamente o 
 * bloco est�tico na classe principal; ele ser� executado automaticamente durante o carregamento da classe.*/

}
