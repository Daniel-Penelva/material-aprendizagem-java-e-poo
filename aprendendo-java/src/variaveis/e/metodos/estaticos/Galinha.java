package variaveis.e.metodos.estaticos;

public class Galinha {

	/* Variável global = static
	 * -> Ela é criada uma unica vez, ou seja, uma única variável;
	 * -> Ela pertence exclusivamente a classe Galinha e não ao objeto instanciado da Galinha;
	 * -> Não precisa instanciar (ou seja, fazer um new) na classe principal para chamar a variável static;
	 * */
	
	public static int ovosDaGranja;
	
	public int ovos;  // Total de ovos do objeto galinha
	
	//Exemplo 1 - sem retorno 
	public void botar(){
		this.ovos++;
	}
	
	//Exemplo 2 - vai retornar o objeto Galinha - this é a referencia de return
	public Galinha chocar(){
		this.ovos++;
		
		Galinha.ovosDaGranja++; // chamando a variavel static
		
		return this;
	}
	
	
	/* Exemplo 3
	 * Tb pode criar métodos static.
	 * Importante saber: Ele não pode acessar variáveis e métodos locais, ou seja, não pode usar dentro do método static a palavra chave "this" porque this 
	 * representa uma instância de um objeto e o método static não conhece instância de objetos. 
	 * */
	
	public static double mediaDeOvos(int galinhas){
	  return ovosDaGranja/galinhas;
	}
}
