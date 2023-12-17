package variaveis.e.metodos.estaticos;

public class ExemplosStatic {
	
	/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO 1 - M�TODOS EST�TICOS <<<<<<<<<<<<<<<<<<<<<<< */
	/* M�todos est�ticos pertencem � classe em vez de a inst�ncias espec�ficas da classe. Eles podem ser chamados usando o nome da classe, sem a 
	 * necessidade de criar uma inst�ncia da classe. */
	
	public static void metodoEstatico() {
		System.out.println("M�todo est�tico chamado!!!");
	}
	
	
	/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO 2 - ATRIBUTOS EST�TICOS <<<<<<<<<<<<<<<<<<<<<<< */
	/* Atributos est�ticos tamb�m pertencem � classe e s�o compartilhados por todas as inst�ncias da classe. Eles s�o declarados usando a palavra-chave 
	 * static. */
	
	public static int contador = 10;
	
	
	/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO 3 - M�TODOS E ATRIBUTOS EST�TICOS <<<<<<<<<<<<<<<<<<<<<<< */
	
	public static int numero1;
	public static int numero2;
	
	public static double multiplicacao(int numero1, int numero2){
	   
	   return  numero1 * numero2;
	}
	
	/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO 4 - M�TODOS DE F�BRICA EST�TICOS <<<<<<<<<<<<<<<<<<<<<<< */
	/* M�todos est�ticos podem ser usados como m�todos de f�brica, retornando uma inst�ncia da classe. */
	
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
