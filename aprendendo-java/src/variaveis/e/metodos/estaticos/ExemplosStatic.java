package variaveis.e.metodos.estaticos;

public class ExemplosStatic {
	
	/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO 1 - MÉTODOS ESTÁTICOS <<<<<<<<<<<<<<<<<<<<<<< */
	/* Métodos estáticos pertencem à classe em vez de a instâncias específicas da classe. Eles podem ser chamados usando o nome da classe, sem a 
	 * necessidade de criar uma instância da classe. */
	
	public static void metodoEstatico() {
		System.out.println("Método estático chamado!!!");
	}
	
	
	/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO 2 - ATRIBUTOS ESTÁTICOS <<<<<<<<<<<<<<<<<<<<<<< */
	/* Atributos estáticos também pertencem à classe e são compartilhados por todas as instâncias da classe. Eles são declarados usando a palavra-chave 
	 * static. */
	
	public static int contador = 10;
	
	
	/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO 3 - MÉTODOS E ATRIBUTOS ESTÁTICOS <<<<<<<<<<<<<<<<<<<<<<< */
	
	public static int numero1;
	public static int numero2;
	
	public static double multiplicacao(int numero1, int numero2){
	   
	   return  numero1 * numero2;
	}
	
	/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO 4 - MÉTODOS DE FÁBRICA ESTÁTICOS <<<<<<<<<<<<<<<<<<<<<<< */
	/* Métodos estáticos podem ser usados como métodos de fábrica, retornando uma instância da classe. */
	
	private int valor;
	
	private ExemplosStatic(int valor) {
		this.valor = valor;
	}
	
	public static ExemplosStatic criarInstancia(int valor) {
		return new ExemplosStatic(valor);
	}

	@Override
	public String toString() {
		return "ExemplosStatic [valor=" + valor + "]";
	}

}
