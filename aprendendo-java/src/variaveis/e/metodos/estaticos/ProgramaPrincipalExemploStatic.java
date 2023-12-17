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

	/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO 5 - BLOCO ESTÁTICO <<<<<<<<<<<<<<<<<<<<<<< */
	public static int numero;

	static {
		numero = 42;
		System.out.println("Bloco estático executado e o número é " + numero);
	}
	
/* O bloco estático é chamado automaticamente quando a classe é carregada pela primeira vez pelo ClassLoader. Não é necessário chamar explicitamente o 
 * bloco estático na classe principal; ele será executado automaticamente durante o carregamento da classe.*/

}
