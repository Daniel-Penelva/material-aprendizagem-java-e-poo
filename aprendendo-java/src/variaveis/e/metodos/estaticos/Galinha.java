package variaveis.e.metodos.estaticos;

public class Galinha {

	/* Vari�vel global = static
	 * -> Ela � criada uma unica vez, ou seja, uma �nica vari�vel;
	 * -> Ela pertence exclusivamente a classe Galinha e n�o ao objeto instanciado da Galinha;
	 * -> N�o precisa instanciar (ou seja, fazer um new) na classe principal para chamar a vari�vel static;
	 * */
	
	public static int ovosDaGranja;
	
	public int ovos;  // Total de ovos do objeto galinha
	
	//Exemplo 1 - sem retorno 
	public void botar(){
		this.ovos++;
	}
	
	//Exemplo 2 - vai retornar o objeto Galinha - this � a referencia de return
	public Galinha chocar(){
		this.ovos++;
		
		Galinha.ovosDaGranja++; // chamando a variavel static
		
		return this;
	}
	
	
	/* Exemplo 3
	 * Tb pode criar m�todos static.
	 * Importante saber: Ele n�o pode acessar vari�veis e m�todos locais, ou seja, n�o pode usar dentro do m�todo static a palavra chave "this" porque this 
	 * representa uma inst�ncia de um objeto e o m�todo static n�o conhece inst�ncia de objetos. 
	 * */
	
	public static double mediaDeOvos(int galinhas){
	  return ovosDaGranja/galinhas;
	}
}
